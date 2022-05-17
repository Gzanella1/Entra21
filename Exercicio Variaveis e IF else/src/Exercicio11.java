import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor ");
        double valor = in.nextDouble();

        if (valor > 10) {
            System.out.println("Maior que 10!");
        } else {
            System.out.println("Menor que 10!");
        }
    }

}
