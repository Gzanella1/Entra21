import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoAviao> listaassentoAviao = new ArrayList<>();

    public Aviao(int linhascadeirasLuxo, int linhasCadeirasEconomica) {
        String alfabeto = "ABCDEF";
        String cont = "ABCDEF";

        for (int i = 1; i < 4 * linhascadeirasLuxo; i++) {
            AssentoAviao cluxo = new AssentoAviao();
                if (i < 10) {
                    cluxo.setCodigo(alfabeto.charAt(i - 1) + "0" + String.valueOf(i));
                } else {
                    cluxo.setCodigo(alfabeto.charAt(i - 1) + String.valueOf(i));
                }
                listaassentoAviao.add(cluxo);
            }
        }



    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoAviao assentoAviao : this.listaassentoAviao) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(assento)) {
                return assentoAviao.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        //for (classe string :o que vc quer percorer )
        int contaLivre = 0;
        for (AssentoAviao assentoAviao : this.listaassentoAviao) {
            if (!assentoAviao.isOcupado()) {
                contaLivre++;
            }
        }
        return contaLivre;
    }

    @Override
    public void mostrarAsseentos() {
        for (int i = 1; i <= listaassentoAviao.size(); i++) {
            if (listaassentoAviao.get(i - 1).isOcupado()) {
                System.out.print("[XX]");
            } else {
                System.out.print("[" + listaassentoAviao.get(i - 1).getCodigo() + "]");
            }
            if (i % 4 == 0) {
                System.out.println();
            } else if (i % 2 == 0) {
                System.out.print(" || ");
            }

        }
    }

    @Override
    //sobreescrevendo
    public Assento getAssento(String assento) {
        for (AssentoAviao assentoAviao : this.listaassentoAviao) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(assento)) {
                return assentoAviao;
            }
        }
        return null;
    }

    public Assento getAssento(String assento, String classe) {
        for (AssentoAviao assentoAviao : this.listaassentoAviao) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(assento) && assentoAviao.getClasse().equalsIgnoreCase(classe)) {
                return assentoAviao;
            }
        }
        return null;
    }

    //getter e setter
    public ArrayList<AssentoAviao> getListaassentoAviao() {
        return listaassentoAviao;
    }

    public void setListaassentoAviao(ArrayList<AssentoAviao> listaassentoAviao) {
        this.listaassentoAviao = listaassentoAviao;
    }


}
