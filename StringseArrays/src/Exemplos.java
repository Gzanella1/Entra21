import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exemplos {

    public static void main(String[] args) {
        //exemplo1();
        //exemplo2();
        //exemplo3();
        //exemplo4();
        //exemplo5();
       // exemplo6();
        //exemplo7();
        exemplo8();

    }

    public static void exemplo1() {

    }
    public static void exemplo2() {
        Scanner in =new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumacoisa=in.nextLine();
        System.out.println("Digite alguma outra coisa: ");
        String algumaOutracoisa=in.nextLine();

        //equald mostra se é Exatamente igual ex: se comecar com maiuscula ele so vai ser verdadeiro se o que ele quer verificar comecar com maiuscula
        if (algumacoisa.equals(algumaOutracoisa)){
            System.out.println("São exatamente iguais");
        // o equalsignoreCase te mostra se igual independente se é maiuscula ou minuscula
        } else if (algumacoisa.equalsIgnoreCase(algumaOutracoisa)) {
            System.out.println("São iguais independente da case");
        }else {
            System.out.println("São diferentes");
        }

    }
    public static void exemplo3() {
        Scanner in =new Scanner(System.in);

        System.out.println("Digite alguma coisa: ");
        String algumacoisa=in.nextLine();
        System.out.println("Digite alguma outra coisa: ");
        String algumaOutracoisa=in.nextLine();

        if(algumacoisa.contains(algumaOutracoisa)){
            System.out.println(algumaOutracoisa+" faz parte de "+algumacoisa);
        }else if (algumaOutracoisa.contains(algumacoisa)){
            System.out.println(algumaOutracoisa+" faz parte de "+algumacoisa);
        }else {
            System.out.println("nenhuma Strig faz parte da outra");

        }
}
    public static void exemplo4() {
        Scanner in =new Scanner(System.in);

        System.out.println("Digite alguma coisa: ");
        String algumacoisa=in.nextLine();
        System.out.println("Digite alguma outra coisa: ");
        String algumaOutracoisa=in.nextLine();

        //o Start With verifica se uma String faz parte da outra e essa parte é o começo
       if(algumacoisa.startsWith(algumaOutracoisa)){
            System.out.println(algumacoisa + " é prefixo de " + algumaOutracoisa);
        }else if (algumaOutracoisa.startsWith(algumacoisa)){
           System.out.println(algumaOutracoisa + " é prefixo de " + algumacoisa);
        }else {
           System.out.println("As strings não são prefxo uma da outra");
       }

        }
    public static void exemplo5() {
        Scanner in =new Scanner(System.in);

        System.out.println("Digite alguma coisa: ");
        String algumacoisa=in.nextLine();
        System.out.println("Digite alguma outra coisa: ");
        String algumaOutracoisa=in.nextLine();

        //o endsWit verifica se uma String faz parte da outra e essa parte é o final
        if(algumacoisa.endsWith(algumaOutracoisa)){
            System.out.println(algumacoisa + " é sufixo de " + algumaOutracoisa);
        }else if (algumaOutracoisa.endsWith(algumacoisa)){
            System.out.println(algumaOutracoisa + " é sufixo de " + algumacoisa);
        }else {
            System.out.println("As strings não são sufixo uma da outra");
        }

    }
    public static void exemplo6() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite alguma coisa: ");
        String algumacoisa=in.nextLine();
        System.out.println("Digite alguma outra coisa: ");
        String algumaOutracoisa=in.nextLine();

        //retorna o indice da primeira vez de  um valor e mostra a posição desse valor
        int posicao=algumacoisa.indexOf(algumaOutracoisa);
        System.out.println("A posição de "+algumaOutracoisa+" em "+algumacoisa+" é "+posicao);
    }
    public static void exemplo7() {
        Scanner in = new Scanner(System.in);
        //replace recebe 2 valores replace( valor q vamos substituir , valor a ser posto no valor a ser substituido)

        String cyphered="lala#lwve#-rwgra22lalang!#<3";
        String decyphered =cyphered.replace("w","o");
        decyphered=decyphered.replace("#"," ");
        decyphered=decyphered.replace("2","m");
        decyphered=decyphered.replace("lala","i");
        decyphered=decyphered.replace("-","p");
        System.out.println(decyphered);

    }
    public static void exemplo8() {
        Scanner in = new Scanner(System.in);
}}

