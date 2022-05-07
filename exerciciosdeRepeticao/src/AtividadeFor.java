import java.util.Scanner;

public class AtividadeFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a frase ");
        String frase = in.nextLine();

        int contador= 0;

        for (int i = 0; i < frase.length(); i++) {
          if (frase.charAt(i) == ' '){
              contador++;

            }
        }
        System.out.println("A quantidade de espaços é: " +contador);
    }
}