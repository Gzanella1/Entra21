import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero de horas trabalhadas no mês: ");
        double Htrabalhado = in.nextDouble();

        System.out.println("Digite o salario por hora");
        double valorph = in.nextDouble();

        if(Htrabalhado > 160) {
            double hrextra =Htrabalhado-160*(valorph/2);
            System.out.println("o salario total acrecentado com hora Extra é: " + 1660 *valorph+hrextra);
        }else{
            double Sporhora= Htrabalhado * valorph;
            System.out.println("o salario total sem horas extras é: "+Sporhora);
        }}}