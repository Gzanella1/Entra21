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
        System.out.print("6- Pizza");
        int escolha = in.nextInt();
        in.nextLine();
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
            case 6:
                lanche= new Pizza();
                break;
            default:
                System.out.println("Escolha uma opção válida!");
        }
        //instanceof, verifica se um objeto é uma instancia de uma classe
        if (lanche instanceof Sanduiche) {
            //inicia a parte de  adicionais
            System.out.println("Deseja adicionais? (S/N):");
            in.nextLine();
            String adicionais = in.nextLine();
            if (adicionais.equalsIgnoreCase("S")) {
                //adicionar os adicionais
                for (int i = 0; i < 10; i++) {
                    System.out.println("quais são os adicionais:");
                    //ta pegando o que o usuario digitou e jogando na lista
                    ((Sanduiche) lanche).adicionarAdicionais(in.nextLine());
                    System.out.println("Deseja adicionar mais adicionais? (S/N): ");
                    String parada= in.nextLine();
                    if(parada.equalsIgnoreCase("N")){
                        break;
                    }
                }
            }//fim da parte de adicionais
        }

        if (lanche instanceof XBurguer) {
            System.out.print("Lanche aberto? (S/N): ");
            in.nextLine();
            String aberto2 = in.nextLine();
            ((XBurguer) lanche).setAberto(aberto2.equalsIgnoreCase("S")); ; //aberto == 1

        } else {
            System.out.println("Escolha o sabor da Pizza:");
            System.out.println("1 - 4 Queijos");
            System.out.println("2 - Calabresa");
            System.out.println("3- Frango com Catupiry");
            System.out.println("4- Marguerita");
            System.out.println("5- Prtuguesa");
            int sabor= in.nextInt();
            in.nextLine();
           MiniPizza miniPizza= ((MiniPizza) lanche);
           switch (sabor){
               case 1:
                   miniPizza.adicionarSaborEngrediente("4 queijos");
                   break;
               case 2:
                   miniPizza.adicionarSaborEngrediente("Calabresa");
                   break;
               case 3:
                   miniPizza.adicionarSaborEngrediente("Frango c/ catupiry");
                   break;
               case 4:
                   miniPizza.adicionarSaborEngrediente("Marguerita");
                   break;
               case 5:
                   miniPizza.adicionarSaborEngrediente("Portuguesa");
                   break;
               default:
                   System.err.println("Escolha um sabor válido");

           }
           if (lanche instanceof Pizza){
               System.out.println("Informe o tamaho da Pizza:");
               System.out.println("XS - Broto");
               System.out.println("SM - pequena");
               System.out.println("MD - media");
               System.out.println("LG - grande");
               System.out.println("XL - familia");
               ((Pizza)lanche).setTamanho(in.nextLine().toUpperCase());

           }
            System.out.println("borda recheada? (S/N)");
            String aberto= in.nextLine();
            ((MiniPizza) lanche).setBordarecheada(aberto.equalsIgnoreCase("S"));
            if(miniPizza.isBordarecheada()){
                System.out.println("qual o sabor da borda: ");
                miniPizza.setSaborborda(in.nextLine());
            }

        }
        System.out.print("Informe o valor do " + lanche.tipo + ": R$");
        lanche.valor = in.nextDouble();
        lanche.montarcomanda();

        //classe é um molde do objeto.
        // o objeto é uma instancia da classe,
        // instancia é uma aplicação
        // construtor é uma função da classe que nao tem nenhum retorno
        //classe abstrata define um compartamento generico, e n pode ser istanciada
        //classe derivada, podem ser instanciada
        //herança
    }
}





//set propriedade colocar o valo em uma propriedade
// get ou is buscar o valor da propriendade





