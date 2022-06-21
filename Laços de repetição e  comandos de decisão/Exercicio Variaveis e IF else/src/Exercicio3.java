import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //atribundo uma var
        System.out.println("digite a base:");
        double base = in.nextInt(); //ler a entrada do usuario

        System.out.println("Digite a altura:");
        double altura = in.nextInt();

        double area=base * altura;
        double perimetro = base+base+altura+altura;

        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);


    }
}

