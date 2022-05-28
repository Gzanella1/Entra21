package classes;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MiniPizza extends Lanche {
    Scanner in= new Scanner(System.in);
    public boolean bordarecheada;
    public String saborborda;
    public MiniPizza() {
        this.addIngredientes("Calabresa");
        this.addIngredientes("Queijo mussarela");
        this.addIngredientes("Molho de tomate");
        this.addIngredientes("Cebola");
        this.addIngredientes("Tomate");
        this.addIngredientes("Massa");
        this.tipo = "Mini Pizza";
    }// apagar e pedir qual ele que la na main

    //override re escreve um metodo em outra classe no casso a classe lanche
    @Override
    public void montarcomanda() {
        super.montarcomanda();
        if (this.bordarecheada) {
            System.out.println("--COM BORDA "+this.saborborda.toUpperCase()+"--");

        }

    }
}

