import java.util.Scanner;

public class Exercicio5 {


public static void main(String[]args){


    Scanner in =new Scanner(System.in);
    System.out.println("Digite o números de eleitores");
    int eleitores= in.nextInt();

    System.out.println("Digite a quantidade de votos validos ");
    int validos=in.nextInt();

    System.out.println("digite a quantidade de votos nulos\n");
    int nulos= in.nextInt();

    System.out.println("digite a quantidades de votos em branco\n");
    int branco= in.nextInt();

    int valido= eleitores-branco-nulos;

    double porcento1=eleitores *(validos/100.0);
    double porcento2=eleitores *(nulos/100.0);
    double porcento3=eleitores *(branco/100.0);

    System.out.println("Total de votos validos: "+ valido);
    System.out.println("A porcentagem de votos validos é " +porcento1);
    System.out.println("A porcentagem de votos nulos é "+porcento2+"%");
    System.out.println("A porcentagem de votos em branco é "+porcento3+"%");









}}
