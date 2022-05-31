package classes;

public class XBurguer extends Sanduiche {
    private boolean aberto;


    public XBurguer() {
        this.addIngredientes("Hamburguer");
        this.addIngredientes("Milho");
        this.addIngredientes("queijo");
        this.addIngredientes("presunto");
        this.tipo = "Xburguer";
    }


    @Override
    public void montarcomanda() {
        //chamar o comportamento generico (lanche)
        super.montarcomanda();
        if (this.aberto) {
            System.out.println("--LANCHE ABERTO--");
        }
    }
    public void setAberto(boolean aberto){
        this.aberto=aberto;
    }
    //get retorna
    public boolean isAberto() {
        return this.aberto;
    }
}



