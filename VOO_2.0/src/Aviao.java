import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoAviao> listaassentoAviao = new ArrayList<>();

    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas) {
        String codigoAssentos = "ABCD";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < linhasCadeirasLuxo; j++) {
                AssentoAviao a = new AssentoAviao();
                a.setCodigo(String.valueOf(codigoAssentos.charAt(i))+j);
                a.setClasse(ClasseAssentoVoo.LUXO);
                listaassentoAviao.add(a);
            }
        }
        codigoAssentos = "ABCDEF";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < linhasCadeirasEconomicas; j++) {
                AssentoAviao a = new AssentoAviao();
                a.setCodigo(String.valueOf(codigoAssentos.charAt(i))+j);
                a.setClasse(ClasseAssentoVoo.ECONOMICA);
                listaassentoAviao.add(a);
            }
        }
    }
/*

                a.setClasse(ClasseAssentoVoo.LUXO);
                assentos.add(a);
            }
        }
        codigoAssentos = "ABCDEF";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < linhasCadeirasEconomicas; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setCodigo(String.valueOf(codigoAssentos.charAt(i))+j);
                a.setClasse(ClasseAssentoVoo.ECONOMICA);
                assentos.add(a);*/

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

    public Assento getAssento(String assento, ClasseAssentoVoo classe) {
        for (AssentoAviao assentoAviao : this.listaassentoAviao) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(assento) && assentoAviao.getClasse().equals(classe)) {
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
