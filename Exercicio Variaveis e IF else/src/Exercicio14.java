import java.util.Scanner;
public class Exercicio14 {

   public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Digite o ano atual");
        int ano= in.nextInt();
        System.out.println("Digite o ano do seu nascimento");
        int nascimento=in.nextInt();

        int calculo= ano -nascimento;
        if (calculo >= 18) {
            System.out.println("você poderá votar ");
        }else {
            System.out.println("você não pode votar ");
        }}}

