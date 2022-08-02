import java.util.Scanner;

public class Exercicio4 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite quantos anos você viveu:");
        int anos= in.nextInt();

        System.out.println("Digite quantos meses você viveu:");
        int meses = in.nextInt();

        System.out.println("digite os dias vividos");
        int dias =in.nextInt();

        int a1= anos*365;
        int m1=meses*30;
        int viveu= a1+m1+dias;

        System.out.println("você viveu "+ viveu +" dias");




    }
}


