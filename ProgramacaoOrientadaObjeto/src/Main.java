import classes.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-MENU: Escolha uma opção:-");
        System.out.println("1-XSalada");
        System.out.println("2-XBurguer");
        System.out.println("3-Misto Quente");
        System.out.println("4-Hot Dog");
        System.out.print("5-Mini Pizza");
        int escolha = in.nextInt();
        Lanche lanche = null;

        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;

            case 2:
                lanche = new XBurguer();

                break;

            case 3:
                lanche = new MistoQuente();
                break;

            case 4:
                lanche = new HotDog();
                break;
            case 5:
                lanche = new MiniPizza();
                break;

            default:
                System.out.println("Escolha uma opção válida!");
        }
        if (escolha == 1 || escolha == 2) {
            System.out.print("Lanche aberto? (S/N): ");
            in.nextLine();
            String aberto2 = in.nextLine();
            ((XBurguer) lanche).aberto = aberto2.equalsIgnoreCase("S"); //aberto == 1

        } else if (escolha == 5) {
            System.out.print("Mini Pizza com borda? (S/N): ");
            in.nextLine();
            String borda = in.nextLine();
            ((MiniPizza) lanche).bordarecheada = borda.equalsIgnoreCase("S"); //aberto == 1

            System.out.print("Qual o sabor da borda:");
            ((MiniPizza) lanche).saborborda=in.next();
        }
        System.out.print("Informe o valor do "+lanche.tipo+": R$");
        lanche.valor = in.nextDouble();
        lanche.montarcomanda();



    }
}











