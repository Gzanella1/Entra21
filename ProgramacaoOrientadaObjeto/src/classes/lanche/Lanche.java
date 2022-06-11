package classes.lanche;

public abstract class Lanche {
    //temos uma lista vaga para 10 ingredientes como
    //como ele e publico usa o public
    private String[] ingredientes = new String[10];
    //add um valor a Xsalada
    private double valor;
    private String tipo;

    public String[] getIngredientes() {
        return ingredientes;
    }

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

    public abstract void mostrarDetalhesdaComanda();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}




