package classes.lanche;

public class XBurguer extends Sanduiche {
    private boolean aberto;


    public XBurguer() {
        this.addIngredientes("Hamburguer");
        this.addIngredientes("Milho");
        this.addIngredientes("queijo");
        this.addIngredientes("presunto");
        this.setTipo("Xburguer");
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    //get retorna
    public boolean isAberto() {
        return this.aberto;
    }

    @Override
    public void mostrarDetalhesdaComanda() {

    }
}




