import java.util.Scanner;

public class Manutencao {
    public String descricao;
    private double custo;
    private int tempo;
    private int numero;

    public void manutencao(){
        Scanner in = new Scanner(System.in);
        System.out.println("digite a descrição:");
        String manut=in.nextLine();
        System.out.println("digite o tempo ");
        int tempo =in.nextInt();
        System.out.println("digite a o custo da manutenção :");
        double custo=in.nextDouble();
        in.nextLine();
        System.out.println("digite o numero ");
        int nmro=in.nextInt();
    }
    private String IndicedeSucatemento(){
        if(tempo>0 && tempo<=20){
            System.out.println("O indicie de sucateamento é 0");
        } else if (tempo>=21 && tempo<=50) {
            System.out.println("O indicie de sucateamento é 0,5");
        } else if (tempo>=51 && tempo<=80) {
            System.out.println("O indicie de sucateamento é 1,0");
        } else if (tempo>=81 && tempo<=120) {
            System.out.println("O indicie de sucateamento é 1,5");
        }else{
            System.out.println("O indicie de sucateamento é 2,0");
        }
    return
    }




    private boolean custoDiario(){
        return true;
    }
    private boolean c(){
        return true;
    }


    //GETTER E SETERS
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
