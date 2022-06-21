import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
        System.out.println("Digite o custus de fabrica");
        int custos = in.nextInt();

        System.out.println("Digite a porcentagem do distribuidor");
        int distribuidor = in.nextInt();
        double porcentagemD = distribuidor * (28 / 100.0);

        System.out.println("digite os impostos  (aplicados ao custos de fabrica).");
        int impostos = in.nextInt();
        double porimpostos = impostos * (45 / 100.0);

        double novo = custos + porcentagemD + porimpostos;
        System.out.println("o valor do carro novo é " + novo);

    }
    }

