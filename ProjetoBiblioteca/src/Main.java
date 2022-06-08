import objetos.Livros;
import objetos.avaliacao.Avaliacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Livros l = new Livros();
        l.setTitulo("Harry Potter");
        l.avaliar();
        l.avaliar();
        l.avaliar();
        System.out.println(l.getTotalRating());

    }
}
