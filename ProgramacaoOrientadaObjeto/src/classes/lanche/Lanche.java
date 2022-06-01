package classes.lanche;

public abstract class Lanche {
    //temos uma lista vaga para 10 ingredientes como
    //como ele e publico usa o public
    private String[] ingredientes = new String[10];
    //add um valor a Xsalada
    public double valor;
    public String tipo;

    //adicional coso o cliente queira
    public void addIngredientes(String ingrediente) {
        //para percorer o ingredientes
        for (int i = 0; i < 10; i++) {
            //o this serve para dizer oa java que e esse objeto que vai receber
            if (this.ingredientes[i] == null) {
                this.ingredientes[i] = ingrediente;
                break;

            }
        }
    }

    public void montarcomanda() {
        if(this instanceof MiniPizza){
            System.out.println("====" + this.tipo + "-"+((MiniPizza)this).getSabor());
        }else {
            System.out.println("====" + this.tipo + "====");
        }
        System.out.printf("valor: R$%.2f\n", this.valor);
        System.out.println("Ingrediente-");
        for (String ingrediente : this.ingredientes) {
            if (ingrediente != null) {
                System.out.println(ingrediente);
            }
        }

    }
}




