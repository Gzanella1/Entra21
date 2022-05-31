package classes;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MiniPizza extends Lanche {
    Scanner in = new Scanner(System.in);
    private String sabor;
    private boolean bordarecheada;
    private String saborborda;

    public MiniPizza() {
        this.addIngredientes("Queijo mussarela");
        this.addIngredientes("Molho de tomate");
        ;
        this.addIngredientes("Massa");
        this.tipo = "Mini Pizza";
    }

    //metodo que não retorna nada
    public void adicionarSaborEngrediente(String sabor) {
        this.setSabor(sabor);
        switch (sabor.toUpperCase()) {
            case "4 QUEIJOS":
                this.addIngredientes("Chedar");
                this.addIngredientes("Catupiry");
                this.addIngredientes("provolone");
                break;
            case "CALABRESA":
                this.addIngredientes("Calabresa");
                break;
            case "FRANGO C/ CATUPIRY":
                this.addIngredientes("Frango");
                this.addIngredientes("Catupiry");
                break;
            case "MARGUERITA":
                this.addIngredientes("Tomate");
                this.addIngredientes("Mangerição");
                break;
            case "PORTUGUESA":
                this.addIngredientes("Presunto");
                this.addIngredientes("Cebola");
                this.addIngredientes("Ovo");
                break;
        }
    }

    //override re escreve um metodo em outra classe no casso a classe lanche
    @Override
    public void montarcomanda() {
        super.montarcomanda();
        if (this.isBordarecheada()) {
            System.out.println("--COM BORDA " + this.getSaborborda().toUpperCase() + "--");

        }
    }

    public void setBordarecheada(boolean bordarecheada) {
        this.bordarecheada = bordarecheada;
    }//quando for boolean ele vai o is no lugar do get

    public boolean isBordarecheada() {
        return this.bordarecheada;
    }

    public void setSaborborda(String saborborda) {
        this.saborborda = saborborda;
    }

    public String getSaborborda() {
        return this.saborborda;
    }
    public void setSabor(String sabor){
        this.saborborda=sabor;

    }public String getSabor(){
        return this.sabor;
    }
}

