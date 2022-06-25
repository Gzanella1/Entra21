import java.util.ArrayList;
import java.util.Scanner;

public class Onibus implements MeioTransporte {

    private ArrayList<AssentoOnibus> listaassentoonibus = new ArrayList<>();

    public Onibus(int linhasCadeiras) {
        //como já sabemos quantos cadeiras cabem em uma linha

        for (int i = 1; i <= 4 * linhasCadeiras; i++) {
            //criar um objeto assento
            AssentoOnibus a = new AssentoOnibus();
            //valueof converte o numero de lugar para String
            a.setLugar(String.valueOf(i));
            //adicionaum objeto a que seria os assentos
            listaassentoonibus.add(a);
        }

    }

    @Override
    public boolean verificaOcupacao(String assento) {
        //A classe assentoOnibus percore toda a lista assentos do onibus
        for (AssentoOnibus assentoOnibus : this.listaassentoonibus) {
            //se um determinado assento em um determinado lugar for igual ao assennto que o usuario digitou
            //LEMBRE DE QUE O ASSENTO ESTÁ EM UM LIGAR E ACHO QUE DEVE SER INFORMAO NO IF
            if (assentoOnibus.getLugar().equalsIgnoreCase(assento)) {
                //retorna que o assento está ocupado
                return assentoOnibus.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int assentoslivre = 0;
        for (AssentoOnibus assentoOnibus : this.listaassentoonibus) {
            //se o assento nao estiver ocupado conta mais um para o assento LIVRE
            if (!assentoOnibus.isOcupado()) {
                assentoslivre++;
            }
        }
        return assentoslivre;
    }

    @Override
    public void mostrarAsseentos() {
        for (int i = 1; i <= listaassentoonibus.size(); i++) {
           if(listaassentoonibus.get(i-1).isOcupado()){
               System.out.print("[XX]");
           }else if(i < 10) {
                System.out.print("[0" + listaassentoonibus.get(i - 1).getLugar() + "]");
            }else {
                System.out.print("[" + listaassentoonibus.get(i - 1).getLugar() + "]");
            }
            if (i % 4 == 0) {
                System.out.println();
            } else if (i %2==0 ) {
                System.out.print(" || ");
            }
        }
    }


    @Override
    //a Classe assento criamos um metodo com o getAssento da classe
    //essa classe pega/busca  o assento que o usuario digitou
    public Assento getAssento(String assento) {
        for (AssentoOnibus assentoOnibus : this.listaassentoonibus) {
            if (assentoOnibus.getLugar().equalsIgnoreCase(assento)) {
                return assentoOnibus;
            }
        }
        return null;
    }

    public ArrayList<AssentoOnibus> getListaassentoonibus() {
        return listaassentoonibus;
    }

    public void setListaassentoonibus(ArrayList<AssentoOnibus> listaassentoonibus) {
        this.listaassentoonibus = listaassentoonibus;
    }


}
