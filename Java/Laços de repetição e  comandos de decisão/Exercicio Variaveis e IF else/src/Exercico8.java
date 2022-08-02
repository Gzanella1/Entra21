import java.util.Scanner;

public class Exercico8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número de carro vendido ");
        double vendas = in.nextDouble();

        System.out.println("digite o numero total de suas vendas");
        double valorv = in.nextDouble();
        double vcarrov =valorv *(5/100.0);

        System.out.println("Digite o valor do salario fixo");
        double salario = in.nextDouble();

        System.out.println("digite o valor recebido por carro vendido");
        double carrov =in.nextDouble();
        double car= carrov* vendas;

        double soma= vcarrov+salario+car;

        System.out.println(soma);


    }
}