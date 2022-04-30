import java.util.Scanner;

public class Exercico12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor ");
        double valor = in.nextDouble();

        if (valor > 0) {
            System.out.println("o valor é positivo");
        } else {
            System.out.println("o valor é negativo");
        }
    }

}
