import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, ArrayList<Carro>> carros = new HashMap<>();

        boolean executa = true;

        while (executa) {
            System.out.println("---------Concessionária--------");
            System.out.println("1- Ver a lista de carros.");
            System.out.println("2- Adicionar um carro a lista de venda.");
            System.out.println("3- vender um carro.");
            System.out.println("0- Sair ");
            System.out.println();
            int escolha = in.nextInt();
            in.nextLine();

            switch (escolha) {
                case 0: executa =false; break;
                case 1:
                    if(carros.isEmpty()){
                        System.out.println("Não existem carros cadastrados!");
                    }else {

                    }

                case 2:
                    Carro c = new Carro();
                    System.out.println("Informe o modelo do  carro: ");
                    c.setModelo(in.nextLine());
                    System.out.println("informe a Marca de venda");
                    String marca = in.nextLine();
                    System.out.println("informe o valor do veiculo: ");
                    double valor = in.nextDouble();
                    System.out.println("informe o valor de venda: ");
                    c.setValorVenda(in.nextDouble());
                    if (!carros.containsKey(marca)) {
                        carros.put(marca, new ArrayList<>());
                    }
                    carros.get(marca).add(c);
                    System.out.println("carro adicionado");
                    System.out.println();
                    break;

                case 3:
                    if (carros.isEmpty()) {
                        System.out.println("Não há Carros cadastrdos");
                    } else {
                        System.out.println("Qual carro deseja vender:");
                        String busca = in.nextLine().toLowerCase();
                        if (carros.containsKey(busca)) {
                            System.out.println("");
                        }
                        break;
                    }
            }
        }
    }
}

