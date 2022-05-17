import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Digite a quantidade do estoque");
        double quantidade = in.nextDouble();
        System.out.println("Digite a quantidade maxima do estoque");
        double maximo= in.nextDouble();
        System.out.println("Digite a quantidade minima do estoque");
        double minimo= in.nextDouble();

        double media= (maximo+minimo)/2;
        if (quantidade >= media){
            System.out.println("Não efutuar compra!");
        }else{
            System.out.println("Efetuar compra");
        }}}
