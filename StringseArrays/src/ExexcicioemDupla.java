import java.util.Scanner;

public class ExexcicioemDupla {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String respostaspossiveis = "abcde";
        System.out.print("Digite o número de alunos da turma: ");
        int nalunos= in.nextInt();
        String[] nomealunos=new String[nalunos];
        double[] notas= new double[nalunos];
        System.out.print("Digite o número de questões da prova: ");
        int nquestoes= in.nextInt();
        double nquestoesd = nquestoes;
        System.out.println();
        String[] gabarito= new String[nquestoes];
        for(int i=0;i <nquestoes;i++){
            System.out.printf("Digite o gabarito da questão %d: ",i+1);
            gabarito[i]= in.next();
        }
        System.out.println();
        for(int i=0;i<nalunos;i++) {
            String[] resposta = new String[nquestoes];
            System.out.print("Digite o nome do(a) aluno(a): ");
            nomealunos[i]= in.next();
            for (int j = 0; j < nquestoes; j++) {
                System.out.printf("Digite a resposta do(a) %s para a quetão %d: ",nomealunos[i],j+1);
                resposta[j]= in.next();
                if(!respostaspossiveis.contains(resposta[j])){
                    boolean respostavalida = false;
                    while(!respostavalida){
                        System.out.print("Resposta inválida, informe uma nova: ");
                        resposta[j]=in.next();
                        if(respostaspossiveis.contains(resposta[j])){
                            respostavalida=true;
                        }
                    }
                }
                if(resposta[j].equalsIgnoreCase(gabarito[j])){
                    notas[i]+=(10/nquestoesd);
                }
            }
            System.out.println();
        }
        for(int i=0;i<nalunos;i++){
            System.out.printf("A nota do(a) %s é: %.2f",nomealunos[i],notas[i]);
            System.out.println();
        }
    }
}
