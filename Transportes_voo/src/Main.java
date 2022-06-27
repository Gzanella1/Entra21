import classes.Voo;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int Nlinhas=0;
        int Ncadeiras=0;
        while(true) {
            System.out.print("Digite o número de linha de cadeiras do avião: ");
            Nlinhas = in.nextInt();
            System.out.print("Digite o número de cadeiras por linha: ");
            Ncadeiras = in.nextInt();
            if(Nlinhas>26||Ncadeiras>10) {
                System.out.println("Quantidade inválida!");
                System.out.print("Digite o número de linha de cadeiras do avião: ");
                Nlinhas = in.nextInt();
                System.out.print("Digite o número de cadeiras por linha: ");
                Ncadeiras = in.nextInt();
            }
                if((Nlinhas>0&&Nlinhas<27)&&(Ncadeiras>0&&Ncadeiras<=10)){
                    break;
                }
        }
        in.nextLine();
        Voo voo = new Voo(Nlinhas, Ncadeiras);
        voo.mostrarAssentos();
        while (voo.quantidadeLivre()>0) {
            System.out.print("Informe a posição do assento (Digite PARE para terminar): ");
            String assento = in.nextLine();
            if(assento.equalsIgnoreCase("pare")){
                break;
            }
            if (voo.verificaOcupacao(assento)) {
                System.out.println("Assento ocupado!");
            } else {
                voo.ocupar(assento);
            }
            System.out.printf("Assentos livres: %d\n", voo.quantidadeLivre());
            System.out.println("---Diagrama de assentos---");
            if(voo.quantidadeLivre()==0){
                System.out.println("Avião lotado!");
                break;
            }
        }
    }
}
