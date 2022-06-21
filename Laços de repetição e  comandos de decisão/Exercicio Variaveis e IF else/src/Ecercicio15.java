import java.util.Scanner;

public class Ecercicio15 {
    public static void main(String[] args) {
        Scanner in   = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        double valor1= in.nextDouble();
        System.out.println("Digite o segundo valor");
        double valor2= in.nextDouble();

        if (valor1 >valor2) {
            System.out.println("O valor Maior é " + valor1);
        }else{
            System.out.println("O valor maior é "+valor2);
        }}}
