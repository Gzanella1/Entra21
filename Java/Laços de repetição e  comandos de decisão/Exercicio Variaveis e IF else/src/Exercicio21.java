import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Digite o numero da conta");
        double numero= in.nextDouble();
        System.out.println("Digite o saldo da conta");
        double saldo= in.nextDouble();
        System.out.println("Digite o debito da conta");
        double debito= in.nextDouble();
        System.out.println("Digite o credito da conta");
        double credito= in.nextDouble();


        double saldoAtual= saldo-debito+credito;
        if (saldoAtual >= 0){
            System.out.println("Saldo positivo ! \nseu saldo é: "+saldoAtual);
        }else {
            System.out.println("Saldo negativo ! \nseu saldo é: "+saldoAtual);
        }
    }
}
