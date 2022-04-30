import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite a hora inicial do jogo");
        int inicial= in.nextInt();
        System.out.println("digite a hora final do jogo");
        int hfinal= in.nextInt();

        if (inicial >= hfinal) {
            int cal = 24 - inicial + hfinal;
            System.out.println(cal+" Horas");
        }else{
            int calculo=hfinal-inicial;
            System.out.println(calculo+" Horas");
        }}}
