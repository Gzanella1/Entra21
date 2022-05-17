import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("digite a promeira nota");
        double nota1= in.nextDouble();

        System.out.println("digite a segunada  nota");
        double nota2= in.nextDouble();

        System.out.println("digite a terceira nota");
        double nota3= in.nextDouble();

        double media=(nota1+nota3+nota2)/3.0;

        System.out.println(" a sua media é "+media);
    }


}
