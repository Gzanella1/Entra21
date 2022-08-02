import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        //exemplo1();
        //exemplo2();
        exemplo3();
    }

    public static void exemplo1() {
        Scanner in = new Scanner(System.in);

        System.out.println("informe a quantidade de números: ");//esses números vao para as arrays
        int num = in.nextInt();

        int[] numeros = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("informe um número: ");
            numeros[i] = in.nextInt();
        }
        int somapar = 0, somaimpar = 0;
        for (int valor : numeros) {
            // esse valor %2 ==0 ele ta checando se meu numero e divisivel por dois se sim é par
            if (valor % 2 == 0) {
                somapar += valor;
            } else {
                somaimpar += valor;
            }
        }
        System.out.println("Soma dos valores pares: " + somapar);
        System.out.println("Soma dos valores impares: " + somaimpar);
    }

    public static void exemplo2() {
        Scanner in = new Scanner(System.in);

        System.out.println("informe a quantidade de Palavras: ");//esses números vai para as arrays
        int nums = in.nextInt();

        String[] palavras = new String[nums];
        in.nextLine();

        for (int i = 0; i < nums; i++) {
            System.out.println("informe uma palavra:");
            palavras[i] = in.nextLine();

        }
        System.out.println("informe um número > 0: ");
        int numeroCorte = in.nextInt();

        for (int i = 0; i < nums; i++) {
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            }
        }//vai passar em todas as posições lendo um por um
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }
    }

    public static void exemplo3() {
        Scanner in = new Scanner(System.in);

        //pedir uma lista pro usuario
        System.out.println("informe a quantidade de números da primeira lista : ");//esses números vai para as arrays
        int nums = in.nextInt();
        int[] numero1 = new int[nums];
        for (int i = 0; i < nums; i++) {
            System.out.println("informe um numero:");
            numero1[i] = in.nextInt();

            //ate aqui vc pediu uma lista
        }
        System.out.println("informe a quantidade de numeros da segunda lista: ");
        int nuns2 = in.nextInt();
        int[] numero2 = new int[nuns2];
        for (int i = 0; i < nuns2; i++) {
            System.out.println("informe um inteiro:");
            numero2[i] = in.nextInt();
        }
        for (int valor1 : numero1) {
            boolean achou = false;

            for (int valor2 : numero2) {
                if (valor1 == valor2) {
                    achou = true;
                    break;
                }
            }
      if (!achou){
          System.out.println(valor1);
      }
       }
    }
}