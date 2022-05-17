import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite o numero de linhas ");
        int linha = in.nextInt();

        System.out.println("digite o numero de colunas ");
        int coluna = in.nextInt();

        for (int l= 0; l < linha; l++){
            for (int c= 0; c < coluna;c++){
                System.out.println("#");
            }
            System.out.println("");
        }
    }
}


