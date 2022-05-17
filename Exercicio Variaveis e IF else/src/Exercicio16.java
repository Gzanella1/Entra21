import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite o primeiro valor:");
        int valor1 =in.nextInt();
        System.out.println("digite o segundo valor");
        int valor2 =in.nextInt();

        if (valor1 <valor2){
            System.out.println("A ordem crecente é "+valor1 +" "+valor2);
        }else {
            System.out.println("A ordem crecente é "+valor2+" "+valor1);
        }}}
