import java.util.*;

public class MainArrayList {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
//        Pedir pro usuário informar n números inteiros até ele digitar 0
//        Quando ele digitar 0, mostrar a lista dos números digitados por ele
        ArrayList inteiros = new ArrayList();
        while (true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: ");
        System.out.println(inteiros);
    }

    public static void ex2() {
//        Pedir pro usuário informar valores inteiros até que seja informado 0
//        Quando for informado 0, mostrar os valores que o usuário digitou
//        mostrar a soma dos números pares e dos números impares informados
//        mostrar a média de todos os valores informados
        ArrayList<Integer> inteiros = new ArrayList<>();
        int somaPar = 0, somaImpar = 0;
        double somaTotal = 0.0;
        while (true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            if (escolha % 2 == 0) {
                somaPar += escolha;
            } else {
                somaImpar += escolha;
            }
            somaTotal += escolha;
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: " + inteiros);
        System.out.print("Soma dos valores pares: " + somaPar);
        System.out.print("Soma dos valores ímpares: " + somaImpar);
        System.out.print("Média dos valores informados: " + (somaTotal / inteiros.size()));
    }

    public static void ex3() {
        /*1 - ler o input do usuário (String) até que seja informado SAIR
          2 - Pedir pro usuário um valor inteiro > 0
          3 - Remover da lista as palavras que tenha a quantidade de
          caracteres menor que o número informado
          4 - Mostrar a lista de palavras*/
        ArrayList<String> palavras = new ArrayList<>();
        while (true) {
            System.out.print("Informe uma palavra ou SAIR para sair: ");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            palavras.add(input);
        }
        System.out.println("Informe um valor inteiro: ");
        int valor = in.nextInt();
        for (int i = 0; i < palavras.size(); i++) {
            if (palavras.get(i).length() < valor) {
                palavras.remove(i);
                i--;
            }
        }
        System.out.println(palavras);
    }

}
//set altera





























































