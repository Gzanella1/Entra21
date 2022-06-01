package classes.pedido;
import classes.lanche.Lanche;

public class Pedido {
    private Lanche[] lanche= new Lanche[10];
    public void imprimirComanda(){
    }
    public double calcularValorTotal(){
        return 0;
    }
    public void adicionarLanche(Lanche lanche) {
        for (int i = 0; i < 10; i++) {
            if (this.lanche[i] == null) {
                this.lanche[i] = lanche;
                break;
            }
        }
    }
}
