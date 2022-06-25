import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoAviao> listaassentoAviao = new ArrayList<>();

    public Aviao(int linhascadeirasLuxo, int linhasCadeirasEconomica) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 1; i < 4 * linhascadeirasLuxo; i++) {
            AssentoAviao cluxo= new AssentoAviao();
            cluxo.setCodigo(alfabeto.charAt(i)+String.valueOf(i));
            listaassentoAviao.add(cluxo);
        }
        for (int i = 1; i < 6 * linhasCadeirasEconomica; i++) {
            AssentoAviao cluxo = new AssentoAviao();
            cluxo.setCodigo(String.valueOf(i));

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
        /*for (int i =0 ;i < ;i++){

        }
*/
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
