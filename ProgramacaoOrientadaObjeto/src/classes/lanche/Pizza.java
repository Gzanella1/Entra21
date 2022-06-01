package classes.lanche;

public class Pizza extends MiniPizza {
    private String tamanho;

    public Pizza() {
        this.tipo = "Pizza";
    }

    @Override
    public void montarcomanda() {
        super.montarcomanda();
        System.out.println("Tamanho: " + this.getTamanho());

    }
    public void setTamanho(String tamanho){
        this.tamanho=tamanho;
    }
    //get retorna
    public String getTamanho() {
        return this.tamanho;
    }
}
