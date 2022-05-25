package classes;

public class XBurguer extends Lanche {
    public boolean aberto;

    public XBurguer() {
        this.addIngredientes("Hamburguer");
        this.addIngredientes("Milho");
        this.addIngredientes("queijo");
        this.addIngredientes("presunto");
        this.addIngredientes("pão");
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
}
