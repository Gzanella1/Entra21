import java.util.Scanner;


public class Desafio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("digite quantas palavras voce desseja informar");
        int n = in.nextInt();

        String[] palavras = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("informe as palavras");
            palavras[i] = in.next();
        }
        String palavraF = "";
        for (int i = 0; i < palavras.length; i++) {
            if (i == 0) {
                palavraF += palavras[i];
            }else{
                palavraF += ", "+palavras[i];
            }
        }
        System.out.println(palavraF);

    }

}
