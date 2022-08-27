public class kkkkkk {
    public static void main(String[] args) {


    int valor1 =36;
    int valor2=54;

    int resto;
        while (valor2 != 0) {
        resto = valor1 % valor2;
        valor1 = valor2;
        valor2 = resto;
    }
        System.out.println("MDC = " + valor1);


    }}
