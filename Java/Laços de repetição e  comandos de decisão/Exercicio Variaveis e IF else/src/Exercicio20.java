import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Digite o salario fixo ");
        double salario=in.nextDouble();
        System.out.println("Digite o valor das vendas ");
        double vendas= in.nextDouble();

        if (vendas < 1.500) {
            double comissao= (0.03*vendas)+salario;
            System.out.println("o salario total é: " +comissao);
        }else{
            double comissao1= ((vendas-1500)*0.05)+(1500*0.03)+salario;
            System.out.println("o salario total é: " +comissao1);
        }

    }
}
