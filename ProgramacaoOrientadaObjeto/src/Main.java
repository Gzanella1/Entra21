import classes.HotDog;
import classes.MistoQuente;
import classes.XBurguer;
import classes.XSalada;

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
        System.out.println("1-Hot Dog");
        int escolha = in.nextInt();
        

        switch (escolha) {

            case 1:
                XSalada lanche = new XSalada();
                System.out.println("Informe o valor do XSalada: R$");
                lanche.valor = in.nextDouble();
                System.out.println("Lanche aberto? (S/N)");
                in.nextLine();
                String aberto = in.nextLine();
                lanche.aberto = aberto.equalsIgnoreCase("S"); //aberto == 1
                lanche.montarcomanda();
                break;

            case 2:
                XBurguer lanche2 = new XBurguer();
                System.out.println("Informe o valor do XBurguer: R$");
                lanche2.valor = in.nextDouble();
                System.out.println("Lanche aberto? (S/N)");
                in.nextLine();
                String aberto2 = in.nextLine();
                lanche2.aberto = aberto2.equalsIgnoreCase("S"); //aberto == 1
                lanche2.montarcomanda();
                break;

            case 3:
                MistoQuente lanche3 = new MistoQuente();
                System.out.println("Informe o valor do Misto Quente: R$");
                lanche3.valor = in.nextDouble();
                lanche3.montarcomanda();
                break;

            case 4:
                HotDog lanche4 = new HotDog();
                break;

            default:
                System.out.println("Escolha uma opção válida!");
        }

    }
}
