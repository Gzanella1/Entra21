import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite a temperatura em graus Fahrenheit");
        double f= in.nextDouble();
        double conversao= (f -32) *5/9;

        System.out.println("a converção de "+f+" Fahrenheit para celcius é "+conversao);


    }
    }
