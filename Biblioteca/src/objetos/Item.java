package objetos;

import objetos.avaliacao.Avaliacao;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Item {
    private String titulo;
    private String genero;
    private double valor;
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    public void avaliar() {
        Scanner in = new Scanner(System.in);
        Avaliacao a = new Avaliacao();
        System.out.print("Informe o nome do avaliador: ");
        a.setNome(in.nextLine());
        System.out.println("Informe uma nota de 0 a 10: ");
        a.setRating(in.nextDouble());
        in.nextLine();
        System.out.print("Informe algum feedback (opcional): ");
        a.setFeedback(in.nextLine());
        this.avaliacoes.add(a);
    }
//total de avaliações
    public double getTotalRating() {
        //retorna a lista de avaliação convertendo tudo em
        //depois converte para double  somando tudo e dividindo pelo total de avaliação
        return this.avaliacoes.stream().mapToDouble(Avaliacao::getRating).sum()
                /this.avaliacoes.size();
    }

    //GETTES E SETTER

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Avaliacao> getAvaliacaos() {
        return avaliacaos;
    }

    public void setAvaliacaos(ArrayList<Avaliacao> avaliacaos) {
        this.avaliacaos = avaliacaos;
    }
}
