public class Explicacao {
    public static void main(String[] args) {
        boolean achou = false;
        String[] palavras = {"abc", "def", "ghi"};
        char letraProibida = 'a';

        for (String palavra : palavras) {

            for (int i = 0; i <= palavra.length(); i++) {
                achou = palavra.charAt(i) == letraProibida;

                if (achou) {
                    break;
                }
            }
            if (achou) {
                break;
            }
        }
        if(achou) {
            System.out.println();
        } else {
            System.out.println();
        }
    }
}