import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {
    private String placa;
    private String modelo;
    private int dataAQ;
    public static  Scanner in = new Scanner(System.in);
    public static ArrayList<Manutencao> manutencaos = new ArrayList<>();



    public void veiculo(){
        System.out.println("digite a placa do seu veiculo: ");
        setPlaca(in.nextLine());
        System.out.println("Digite o modelo do veiculo: ");
        setModelo(in.nextLine());
        System.out.println("digite a data de aquisição ");
        setDataAQ(in.nextInt());
    }

    public int repeteServico(){
        System.out.println("Informe a descrição: ");
        String descrico=in.nextLine();
        int qtdmanutencao=0;
        for (Manutencao manutencao:this.getManutencaos()) {
            if(manutencao.getDescricao().equalsIgnoreCase(descrico)){
                qtdmanutencao++;
            }
        }
        return qtdmanutencao;
    }






//geteer e seteers
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDataAQ() {
        return dataAQ;
    }

    public void setDataAQ(int dataAQ) {
        this.dataAQ = dataAQ;
    }


    public static ArrayList<Manutencao> getManutencaos() {
        return manutencaos;
    }

    public static void setManutencaos(ArrayList<Manutencao> manutencaos) {
        Veiculo.manutencaos = manutencaos;
    }
}
