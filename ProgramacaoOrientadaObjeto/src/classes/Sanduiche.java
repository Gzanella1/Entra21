package classes;

public abstract class Sanduiche extends Lanche {
    //+adicionais:String[]
    private String[] adicionais = new String[10];

    //metodo
    public void adicionarAdicionais(String adicional) {

        for (int i = 0; i < 10; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;

            }
        }
    }

    public void montarComanda() {
        super.montarcomanda();
        if (this.adicionais[0] != null) {
            System.out.println("-ADICIONAIS-");
            for (String adicional : this.adicionais) {
                if (adicional != null) {
                    System.out.println(adicional);
                }
            }
        }
    }
    public void setAdicionais(String[] adicionais){
        this.adicionais=adicionais;

    }public String[] getAdicionais(){
        return this.adicionais;
    }
}





//USE O SHIFT + ALT  E SELECIONA AS LINHAS QUE VOCE QUE DIGITAR AO MESMO TEMPO
//CONTROL + CLICA EM CIMA DO QUE VOCE QUE PROCURAR









