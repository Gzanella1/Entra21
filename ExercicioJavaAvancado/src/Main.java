import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    static HashMap<String, ArrayList<Carro>> carros = new HashMap<>();

    public static void main(String[] args) {
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
                case 0:
                    executa = false;
                    break;
                case 1:
                    verLista();
                    break;
                case 2:
                    addumcarro();break;
                case 3:
                    venderumcarro();break;
                default:
                    System.out.println("invalido");
            }
        }

    }

    public static void verLista() {
        //verifica se há algum carro no Hashmap
        if (carros.isEmpty()) {
            System.out.println("Não há Carros cadastrados");
        } else {
            System.out.println("--------CATALAGO----------- ");
            //keySet retorna as chaves do hashMap no caso a marca
            //ou seja ele so busca chave por chave
            for (String key : carros.keySet()) {
                System.out.println(key.toUpperCase());
                //recupra os items da string key
                //criou uma instancia da classe carro
                //busca o modelo DA array
                for (Carro separapormodelo : carros.get(key)) {
                    //ver o que é isso "%s: R$%.2f\n",
                    System.out.printf("%s: R$%.2f\n", separapormodelo.getModelo(), separapormodelo.getValorVenda());
                }
            }
        }
    }
    public static void addumcarro(){
        Carro c = new Carro();
        System.out.println("Informe o MODELO do  carro: ");
        c.setModelo(in.nextLine());
        System.out.println("informe a MARCA de venda");
        String marca = in.nextLine();
        System.out.println("informe o valor de venda: ");
        c.setValorVenda(in.nextDouble());
        in.nextLine();
        if (!carros.containsKey(marca)) {
            //não entendi
            carros.put(marca, new ArrayList<>());
        }
        //add um carro no arraylist
        carros.get(marca).add(c);
        System.out.println("carro adicionado");
        System.out.println();
    }
    public static void venderumcarro(){
            System.out.print("Informe a marca do carro: ");
            String marca = in.nextLine();
            if (!carros.containsKey(marca.toLowerCase())) {
                System.out.println("Não existem carros da marca '"+marca+"'!");
            } else {
                System.out.print("Informe o modelo do carro: ");
                String modelo = in.nextLine();
                ArrayList<Carro> carrosMarca = carros.get(marca.toLowerCase());
                boolean encontrado = false;
                for (int i = 0; i < carrosMarca.size(); i++) {
                    Carro c = carrosMarca.get(i);
                    if (c.getModelo().equalsIgnoreCase(modelo)) {
                        encontrado = true;
                        System.out.printf("Valor da venda: R$%.2f. Deseja efetuar venda (S/N)? ", c.getValorVenda());
                        if (in.nextLine().equalsIgnoreCase("S")) {
                            System.out.printf("Carro %s da marca %s vendido por R$%.2f!\n", c.getModelo(), marca, c.getValorVenda());
                            carrosMarca.remove(i);
                            if (carrosMarca.isEmpty()) {
                                carros.remove(marca.toLowerCase());
                            }
                        }
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Carro de modelo '"+modelo+"' não encontrado na marca '"+marca+"'!");
                }
            }
            System.out.println();
        }
    }

