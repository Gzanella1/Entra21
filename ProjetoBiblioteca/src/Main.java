import objetos.DVD;
import objetos.Item;
import objetos.Livros;
import objetos.avaliacao.Avaliacao;
import objetos.item.Estante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Estante e = new Estante(5);
        Item item = null;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º item da estante: ");
            String itm = in.next();
            if (itm.equalsIgnoreCase("livro")) {
                item = new Livros();
                Livros itemL = ((Livros) item);
                System.out.print("Digite o autor do livro: ");
                itemL.setAutor(in.next());
                System.out.print("digite a quantidade de paginas: ");
                itemL.setQtdPaginas(in.nextInt());
                System.out.print("Digite o ano de publicação: ");
                itemL.setAnoPublicacao(in.nextInt());
                System.out.print("Digite a edição do livro: ");
                itemL.setEdicao(in.nextInt());

            } else if (itm.equalsIgnoreCase("dvd")) {
                item = new DVD();
                DVD dvd = ((DVD) item);
                System.out.println("Digite o ano de lançamento: ");
                dvd.setAnoLancamento(in.nextInt());
                System.out.println("Digite o nome do diretor: ");
                dvd.setDiretor(in.next());
                System.out.println("Digite a duração do DVD: ");
                dvd.setDuracao(in.nextDouble());
            } else {
                System.out.println("iten invalido!");
            }
            System.out.print("Digite o Titulo:");
            item.setTitulo(in.next());
            System.out.print("digite o genero: ");
            item.setGenero(in.next());
            System.out.print("Digite o valor :");
            item.setValor(in.nextDouble());
            e.adicionarItem(item);
        }
        int cont = 1;
        for (Item i : e.getItens()) {
            System.out.println(i.getTitulo());
            System.out.println(i.getGenero());
            System.out.println(i.getValor());

            if (i instanceof Livros) {
                System.out.print(((Livros) i).getAutor());
                System.out.print(((Livros) i).getQtdPaginas());
                System.out.println(((Livros) i).getAnoPublicacao());
                System.out.println(((Livros) i).getEdicao());
                System.out.println();
            } else if (i instanceof DVD) {
                System.out.println(((DVD) i).getAnoLancamento());
                System.out.println(((DVD) i).getDiretor());
                System.out.println(((DVD) i).getDuracao());
                System.out.println();
            }

            cont++;
        }
    }
}


//classe e um molde para o nosso objeto.
//o que é abstração, e desenvolver pedaco por pedaço focado em um unico objetivo
//acoplamento ?
// um codigo coeso ele faz o que tem que fazer com eficiencia
//heranca:qndo tenho uma classe que herda caracteristica de outra classe
//construtor e um metodo sem tipo de retorno nem void, ele cria o nosso obj dentro da classe
//encapsular: sempre privado  com get e set
//classe abstrata posui atributos de outras classe

//parametros passar valores de uma classe para outra
//quando der um new estante, na mani vai fazer tudo o que tiver no construtor


//agregação ?tem 1,
//associação? a main so ultiliza as clases
//composição: e parte de

//polimorfismo

//flecha preta um prescisa do outro
// flecha branca um pode existir sem o outro
//flecha normal herança