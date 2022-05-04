import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner repetição= new Scanner(System.in);
        System.out.println("Qual a tabuada deseja saber?");
        int valor=repetição.nextInt();

        for (int var= 0; var<=10; var++){
            System.out.println(var *valor);


        }
    }



}
