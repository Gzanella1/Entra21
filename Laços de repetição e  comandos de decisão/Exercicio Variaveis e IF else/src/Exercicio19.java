import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome= in.nextLine();
        System.out.println("digite digite a altura:");
        double altura= in.nextDouble();
        System.out.println("digite o sexo: \n 1- masculino \n 1- feminino ");
        int sexo =in.nextInt();

        if (sexo == 1) {
            double pideal = (72.7 * altura) - 58;
            System.out.println("O peso ideal para o sexo masculino é: " + pideal);
        }else {
            double pidealf=(62.1*altura)-44.7;
            System.out.println("O peso ideal para o sexo feminino é: " + pidealf);
        }}}
