package objetos;

import objetos.avaliacao.Avaliacao;

import java.util.Scanner;

public abstract class Item {

    private String titulo;
    private String genero;
    private double valor;
    private Avaliacao[] avaliacoes = new Avaliacao[30];

    public void avaliar() {
        //o set ta pegando o que o usuario digitou
        //E na classe Avaliacao vamos usar ele usando o get
        Scanner in = new Scanner(System.in);
        Avaliacao a = new Avaliacao();
        System.out.print("Digite o nome do avaliador: ");
        a.setNome(in.nextLine());
        System.out.print("Digite uma nota de 0 a 10:");
        a.setRating(in.nextDouble());
        in.nextLine();
        System.out.print("informe o feedback: ");
        a.setFeedback(in.nextLine());
        //pegando tudo o que o usuarido digitou, lendo posição por posição
        for (int i = 0; i < getAvaliacoes().length; i++) {
            //checa se a posição i e nulla se for pega tudo o que o usu digitou e joga na posição A
            if (getAvaliacoes()[i] == null) {
                //joga a avaliação do usuario na posição nula
                getAvaliacoes()[i] = a;
                break;
            }
        }

    }

    public double getTotalRating() {
        //pegar o tatal de avaliaçoes
        //for (int i =0; i<getAvaliacoes().length;i++){
        //foreach passa posição por posição e armazena na variavel
        double soma = 0;
        int contador = 0;
        for (Avaliacao a : getAvaliacoes()) {
            if (a != null) {
                //checar se difirente de nulo se sim faz a soma
                soma += a.getRating();
                contador++;
            }

        }
    //retornando a medua
        return soma/contador;

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

    public Avaliacao[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
