import jdk.swing.interop.SwingInterOpUtils;

import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isHealer = true;

        while (isHealer) {
            System.out.println("Digite a abreviação da classe healer");
            String classes = in.next().toUpperCase();

            if (classes.length() == 3) {
                switch (classes) {

                    case "PLD", "HAR", "DKN", "GNB":
                        System.out.println("A classe é TANK ");
                        break;
                    case "WHM", "SCH", "AST", "SAG":
                        System.out.println("A classe é HEDER");
                        break;
                    case "MNR", "DRG", "NJA", "SMR", "PRP", "BRD", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                        System.out.println("A classe é DPS");
                        break;

                    default:
                        System.out.println("Não é uma classe");

                        isHealer = false;
                        break;
                }

            } else {
                System.out.println("A abreviação não é valida, digite uma com três letras");
                isHealer = false;
                break;
            }


        }
    }
}

// matriz é uma lista de lista