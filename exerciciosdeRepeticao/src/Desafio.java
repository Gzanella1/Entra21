import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Qual a tabuada deseja saber?");
        int valor = in.nextInt();

        while (valor != 0) {

            for (int var1 = 0; var1 <= 10; var1++) {
                System.out.println(valor + " x " + var1 + " = " + var1 * valor);
            }

            System.out.println("Qual a tabuada deseja saber?");
            valor = in.nextInt();

        }
    }
}


