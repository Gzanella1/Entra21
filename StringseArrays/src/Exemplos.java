import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Exemplos {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //exemplo1();
        //exemplo2();
        //exemplo3();
        //exemplo4();
        //exemplo5();
        //exemplo6();
        //exemplo7();
        //exemplo8();
        //exemplo9();
        //exemplo10();
        exemplo11();


    }

    public static void exemplo1() {

    }

    public static void exemplo2() {
        //Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumacoisa = in.nextLine();
        System.out.println("Digite alguma outra coisa: ");
        String algumaOutracoisa = in.nextLine();

        //equald mostra se é Exatamente igual ex: se comecar com maiuscula ele so vai ser verdadeiro se o que ele quer verificar comecar com maiuscula
        if (algumacoisa.equals(algumaOutracoisa)) {
            System.out.println("São exatamente iguais");
            // o equalsignoreCase te mostra se igual independente se é maiuscula ou minuscula
        } else if (algumacoisa.equalsIgnoreCase(algumaOutracoisa)) {
            System.out.println("São iguais independente da case");
        } else {
            System.out.println("São diferentes");
        }

    }

    public static void exemplo3() {
        //Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumacoisa = in.nextLine();
        System.out.println("Digite alguma outra coisa: ");
        String algumaOutracoisa = in.nextLine();

        if (algumacoisa.contains(algumaOutracoisa)) {
            System.out.println(algumaOutracoisa + " faz parte de " + algumacoisa);
        } else if (algumaOutracoisa.contains(algumacoisa)) {
            System.out.println(algumaOutracoisa + " faz parte de " + algumacoisa);
        } else {
            System.out.println("nenhuma Strig faz parte da outra");

        }
    }

    public static void exemplo4() {
        //Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumacoisa = in.nextLine();
        System.out.println("Digite alguma outra coisa: ");
        String algumaOutracoisa = in.nextLine();

        //o Start With verifica se uma String faz parte da outra e essa parte é o começo
        if (algumacoisa.startsWith(algumaOutracoisa)) {
            System.out.println(algumacoisa + " é prefixo de " + algumaOutracoisa);
        } else if (algumaOutracoisa.startsWith(algumacoisa)) {
            System.out.println(algumaOutracoisa + " é prefixo de " + algumacoisa);
        } else {
            System.out.println("As strings não são prefxo uma da outra");
        }

    }

    public static void exemplo5() {
        //Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumacoisa = in.nextLine();
        System.out.println("Digite alguma outra coisa: ");
        String algumaOutracoisa = in.nextLine();

        //o endsWit verifica se uma String faz parte da outra e essa parte é o final
        if (algumacoisa.endsWith(algumaOutracoisa)) {
            System.out.println(algumacoisa + " é sufixo de " + algumaOutracoisa);
        } else if (algumaOutracoisa.endsWith(algumacoisa)) {
            System.out.println(algumaOutracoisa + " é sufixo de " + algumacoisa);
        } else {
            System.out.println("As strings não são sufixo uma da outra");
        }
    }

    public static void exemplo6() {
        //Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumacoisa = in.nextLine();
        System.out.println("Digite alguma outra coisa: ");
        String algumaOutracoisa = in.nextLine();

        //retorna o indice da primeira vez de  um valor e mostra a posição desse valor
        int posicao = algumacoisa.indexOf(algumaOutracoisa);
        System.out.println("A posição de " + algumaOutracoisa + " em " + algumacoisa + " é " + posicao);
    }

    public static void exemplo7() {
        //Scanner in = new Scanner(System.in);
        //replace recebe 2 valores replace( valor q vamos substituir , valor a ser posto no valor a ser substituido)
        String cyphered = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = cyphered.replace("w", "o");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.out.println(decyphered);
    }

    //Código Morse
    public static void desencriptar() {
        in.nextLine();
        System.out.print("Digite uma expressão encriptada com código morse: ");
        String palavra = in.nextLine();
        String decifrado = palavra.replace("-.-.--", "!").replace("--..--", ",")
                .replace(".----", "1").replace("..---", "2").replace("...--", "3")
                .replace("....-", "4").replace(".....", "5").replace("-....", "6")
                .replace("--...", "7").replace("---..", "8").replace("----.", "9")
                .replace("-----", "0").replace("-...", "b").replace("-.-.", "c")
                .replace("..-.", "f").replace("....", "h").replace(".---", "j")
                .replace(".-..", "l").replace(".--.", "p").replace("--.-", "q")
                .replace("...-", "v").replace("-..-", "x").replace("-.--", "y")
                .replace("--..", "z").replace("-..", "d").replace("--.", "g")
                .replace("-.-", "k").replace("---", "o").replace(".-.", "r")
                .replace("...", "s").replace("..-", "u").replace(".--", "w")
                .replace(".-", "a").replace("..", "i").replace("--", "m")
                .replace("-.", "n").replace(".", "e").replace("-", "t")
                .replace("*", " ");
        //System.out.println(decifrado);
        for (int i = 0; i < decifrado.length(); i++) {
            if (decifrado.charAt(i) != '|') {
                System.out.print(decifrado.charAt(i));
            }
        }
    }

    public static void encriptar() {
        int par = 0;
        in.nextLine();
        System.out.print("Digite uma frase para encriptar: ");
        String palavra = in.nextLine();
        char[] palavrab = new char[palavra.length() * 2];
        for (int i = 0; i < palavra.length() * 2; i++) {
            if (i % 2 == 0) {
                palavrab[i] = palavra.charAt(par);
                par++;
            } else {
                palavrab[i] = '|';
            }
        }
        palavra = String.valueOf(palavrab);
        String decifrado = palavra.replace("1", ".----").replace("2", "..---").replace("3", "...--")
                .replace("4", "....-").replace("5", ".....").replace("6", "-....")
                .replace("7", "--...").replace("8", "---..").replace("9", "----.")
                .replace("0", "-----").replace("b", "-...").replace("c", "-.-.")
                .replace("f", "..-.").replace("h", "....").replace("j", ".---")
                .replace("l", ".-..").replace("p", ".--.").replace("q", "--.-")
                .replace("v", "...-").replace("x", "-..-").replace("y", "-.--")
                .replace("z", "--..").replace("d", "-..").replace("g", "--.")
                .replace("k", "-.-").replace("o", "---").replace("r", ".-.")
                .replace("s", "...").replace("u", "..-").replace("w", ".--")
                .replace("a", ".-").replace("i", "..").replace("m", "--")
                .replace("n", "-.").replace("e", ".").replace("t", "-")
                .replace(" ", "*");

        System.out.println(decifrado);

    }

    public static void exemplo10() {
        System.out.println("Digite o valor corespondente: \n1-Encriptar \n2-Desencritpar");
        int valor = in.nextInt();
        if (valor == 1) {
            encriptar();
        } else if (valor == 2) {
            desencriptar();
        } else {
            System.out.println("Número invalido!");
        }
//.--.|.-|.-.|.-|-...|.|-.|...|-.-.--|*|...-|---|-.-.|.|...|*|.--.|.-|...|...|.-|.-.|.-|--|*|-..|.-|*|.--.|.-.|..|--|.|..|.-.|.-|*|..-.|.-|...|.|-.-.--|
    }

    public static void exemplo11() {
        while (true) {
        boolean valida = false;
        String frase = "";
        System.out.print("Digite 1 para encriptar e 2 para desencriptar: ");
        int valor = in.nextInt();
        if(valor!=1&&valor!=2){
            while(!valida) {
                System.out.print("Valor inválido! Digite novamente: ");
                valor = in.nextInt();
                if (valor == 1 || valor == 2) {
                    valida = true;
                }
            }
        }
        if (valor == 1) {
            in.nextLine();
            System.out.print("Digite uma frase para encriptá-la!: ");
            frase = in.nextLine();
            System.out.println(Encriptar(frase.toLowerCase()));
        } else {
            in.nextLine();
            System.out.print("Digite algo em código morse para ser desencriptado: ");
            frase = in.nextLine();
            String desencriptado = Desencriptar(frase);
            for (int i = 0; i < desencriptado.length(); i++) {
                if (desencriptado.charAt(i) != '|') {
                    System.out.print(desencriptado.charAt(i));
                }
            }
            System.out.println();
        }
            System.out.print("DESEJA TENTAR NOVAMENTE? (Y/N): ");
            String retry = in.nextLine();
            if(!retry.equalsIgnoreCase("Y")&&!retry.equalsIgnoreCase("N")){
                while(true){
                    System.out.print("Alternativa inválida, digite novamente: ");
                    retry = in.nextLine();
                    if (retry.equalsIgnoreCase("y")||retry.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            if (retry.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    public static String Encriptar(String frase){
        int par = 0;
        char[] palavrab = new char[frase.length() * 2];
        for (int i = 0; i < frase.length() * 2; i++) {
            if (i % 2 == 0) {
                palavrab[i] = frase.charAt(par);
                par++;
            } else {
                palavrab[i] = '|';
            }
        }
        frase = String.valueOf(palavrab);
        String encriptada = frase.replace("1", ".----").replace("2", "..---").replace("3", "...--")
                .replace("4", "....-").replace("5", ".....").replace("6", "-....")
                .replace("7", "--...").replace("8", "---..").replace("9", "----.")
                .replace("0", "-----").replace("b", "-...").replace("c", "-.-.")
                .replace("f", "..-.").replace("h", "....").replace("j", ".---")
                .replace("l", ".-..").replace("p", ".--.").replace("q", "--.-")
                .replace("v", "...-").replace("x", "-..-").replace("y", "-.--")
                .replace("z", "--..").replace("d", "-..").replace("g", "--.")
                .replace("k", "-.-").replace("o", "---").replace("r", ".-.")
                .replace("s", "...").replace("u", "..-").replace("w", ".--")
                .replace("a", ".-").replace("i", "..").replace("m", "--")
                .replace("n", "-.").replace("e", ".").replace("t", "-")
                .replace(" ", "*");
        return encriptada;
    }

    public static String Desencriptar(String frase){
        String decifrado = frase.replace("-.-.--", "!").replace("--..--", ",")
                .replace(".----", "1").replace("..---", "2").replace("...--", "3")
                .replace("....-", "4").replace(".....", "5").replace("-....", "6")
                .replace("--...", "7").replace("---..", "8").replace("----.", "9")
                .replace("-----", "0").replace("-...", "b").replace("-.-.", "c")
                .replace("..-.", "f").replace("....", "h").replace(".---", "j")
                .replace(".-..", "l").replace(".--.", "p").replace("--.-", "q")
                .replace("...-", "v").replace("-..-", "x").replace("-.--", "y")
                .replace("--..", "z").replace("-..", "d").replace("--.", "g")
                .replace("-.-", "k").replace("---", "o").replace(".-.", "r")
                .replace("...", "s").replace("..-", "u").replace(".--", "w")
                .replace(".-", "a").replace("..", "i").replace("--", "m")
                .replace("-.", "n").replace(".", "e").replace("-", "t")
                .replace("*", " ");
        return decifrado;
    }
}

