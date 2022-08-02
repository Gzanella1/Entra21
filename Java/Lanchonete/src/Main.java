
import classes.cliente.Cliente;
import classes.lanche.*;
import menus.EMenu;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.print("Insira o nome do cliente: ");
        cl.setNome(in.nextLine());
        while (true){
            cl.getPedido().adicionarLanche(montarLanche());
            System.out.println("Deseja mais um lanche? (S/N)");
            if(in.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Cliente: "+cl.getNome());
        cl.getPedido().imprimirComanda();
    }

    private static Lanche montarLanche() {
        int escolha = 0 ;
       try {   System.out.println("-MENU: Escolha uma opção-");
           for (EMenu menu:EMenu.values() ){

           }
            escolha = in.nextInt();
       }catch (InputMismatchException e){
           System.out.println("Escolha um lanche válido");
       }finally {
           in.nextLine();
       }
        Lanche lanche = null;
            switch (escolha) {
                case 1 -> lanche = new XSalada();
                case 2 -> lanche = new XBurguer();
                case 3 -> lanche = new MistoQuente();
                case 4 -> lanche = new HotDog();
                case 5 -> lanche = new MiniPizza();
                case 6 -> lanche = new Pizza();
                default -> System.err.println("Escolha uma opção válida!");
            }
        lanche.montarDetalhesLanche(in);
        System.out.print("Informe o valor do(a) "+lanche.getTipo()+": R$");
        lanche.setValor(in.nextDouble());
        in.nextLine();
        return lanche;
    }
}