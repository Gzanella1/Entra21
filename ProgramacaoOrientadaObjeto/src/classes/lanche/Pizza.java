package classes.lanche;

public class Pizza extends MiniPizza {
    private String tamanho;

    public Pizza() {
        this.setTipo("Pizza");
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    //get retorna
    public String getTamanho() {
        return this.tamanho;
    }
}
