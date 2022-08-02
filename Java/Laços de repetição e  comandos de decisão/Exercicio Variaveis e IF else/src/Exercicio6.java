import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[]args){


        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu salario mesnal");
        double salario = in.nextInt();

        System.out.println("Digite o porcentual de reajuste");
        double porcento = in.nextInt();


        double calculo= salario * (porcento/100);
        double sliquido= calculo+salario;
        System.out.println("seu salario é "+sliquido+" reais ");//sout


    }}