import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numerode maças: ");
        int macas = in.nextInt();

        if (macas < 12) {
        double calculo1 =macas * 1.30 ;
        System.out.printf("o valor total da compra das maças é R$ %.2f\n ",calculo1);

        }else  {
        double calculo2= macas * 1.00;
            System.out.printf("o valor total da compra das maças é R% %.2f\n ",calculo2);
        }

        }

    }


