import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("digite o valor");
        int valor = in.nextInt();
        int antes = valor  - 1;
        System.out.print("Antecessor: " + antes);

    }
}