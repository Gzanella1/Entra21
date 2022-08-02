import javax.crypto.spec.PSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class MainHashMap {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Double> produtos = new HashMap<>();
        boolean executa = true;

        while (executa) {
            System.out.println("---------Menu--------");
            System.out.println("1- Cadastrar Produtos");
            System.out.println("2- Buscaar um produto");
            System.out.println("3- Mostrar lista dos produtos");
            System.out.println("4- Remover um produto");
            System.out.println("0- Sair ");
            System.out.println();
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    executa = false;
                    break;
                case 1:
                    System.out.println("Informe o produto: ");
                    String chave = in.nextLine();

                    if (produtos.containsKey(chave)) {
                        System.out.println("Produto ja existente, deseja ataulizar o valor (S/N): ");
                        if (in.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }
                    }
                    System.out.println("informe o valor: ");
                    double valor = in.nextDouble();
                    produtos.put(chave.toLowerCase(), valor);
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                            System.out.println("Não há produtos cadastrdos");
                        } else {
                            System.out.println("Informe o produto: ");
                            String busca = in.nextLine().toLowerCase();
                            if (produtos.containsKey(busca)) {
                                System.out.println(busca + " : " + produtos.get(busca));
                            }
                            break;
                    }
                case 3:
                    System.out.println(produtos);
                    break;

                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrdos");
                    } else {
                        System.out.println("Informe o produto: ");
                        String busca = in.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            produtos.remove(busca);
                        }
                    }
                    break;
                default:
                    System.out.println("INFORME UMA OPÇÃO VALIDA");
            }
        }
        System.out.println(produtos);
    }
}



     /* public static void ex1() {
        produtos.put("Maça", 2.6);
        produtos.put("Banana", 0.4);
        produtos.put("Abacate", 1.5);
        System.out.println(produtos);}*/