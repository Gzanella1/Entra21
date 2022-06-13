import objetos.DVD;
import objetos.Item;
import objetos.Livros;
import objetos.avaliacao.Avaliacao;
import objetos.item.Estante;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    static Estante e = new Estante(5);
    static Item item = null;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu\n1 - Adicionar item \n2 - Buscar e tratar retorno \n   - avaliar\n   - ver avaliações \n3 - Remover \n4 - Mostrar itens da estante \n0 - Sair");
            int escolha = in.nextInt();

            switch (escolha) {
                case 1:
                    addItem();
                    break;
                case 2:
                    buscarItem();
                    break;
                case 3:
                    removerItem();
                    break;
                case 4:
                    mostrarItem();
                    break;
                case 0:
                    sair();
                    break;
            }
            if (escolha == 0) {
                break;
            }
        }
    }

    public static void addItem() {
        for (int i = 0; i < 2; i++) {
            while (true) {
                System.out.print("Digite o " + (i + 1) + "º item da estante: ");
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
                    System.out.print("Digite o ano de lançamento: ");
                    dvd.setAnoLancamento(in.nextInt());
                    System.out.print("Digite o nome do diretor: ");
                    dvd.setDiretor(in.next());
                    System.out.print("Digite a duração do DVD: ");
                    dvd.setDuracao(in.nextDouble());

                } else {
                    System.out.println("iten invalido!");
                    continue;
                }
                System.out.print("Digite o Titulo:");
                item.setTitulo(in.next());
                System.out.print("digite o genero: ");
                item.setGenero(in.next());
                System.out.print("Digite o valor :");
                item.setValor(in.nextDouble());
                e.adicionarItem(item);
                System.out.println();

                if (!e.adicionarItem(item)) {
                    System.err.println("Não foi possivel adicionar o item na estante!");


                } else {
                    System.out.print("item adicionado!!!!\n");

                    System.out.print("deseja voltar oa menu (s/n): ");
                    String soun = in.next();
                    if (soun.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                break;
            }
        }
    }

    public static void buscarItem() {
        if (item == null) {
            System.out.println("sem item na estante!!");
        } else {
            System.out.print("informe o titulo da obra: ");
            Item i = e.buscarItem(in.nextLine());
            if (item == null) {
                System.out.println("esse item não existe na estante:");
            } else {
                while (true) {
                    System.out.println("Menu\n1 - Avaliar \n2 - ver avaliaçãoes  \n  0 - voltar ao menu ");
                    int escolha = in.nextInt();

                    if (escolha == 0) {
                        break;
                    }
                    switch (escolha) {
                        case 1:
                            additem1(i);break;
                        case 2:
                            veravaliacoes(i);break;
                        default:
                            System.out.println("inssira uma oção valida: ");

                    }
                }

            }
        }
    }

    public static void additem1(Item i) {
        int cont = 0;
        for (Avaliacao avaliacao : item.getAvaliacoes()) {
            if (avaliacao != null) {
                cont++;
            }
        }
        if (cont == item.getAvaliacoes().length) {
            System.out.println("O numero maximo de avaliações foi alcansado ");
        } else {
            item.avaliar();
        }
    }

    public static void veravaliacoes(Item i) {
        System.out.println();
        System.out.println("Avaliaçãoes\n");
        for (Avaliacao avaliacao : item.getAvaliacoes()) {
            if (avaliacao != null) {
                System.out.println(avaliacao.getNome()+": ");
                System.out.println("avaliação: " + avaliacao.getRating());
                System.out.println("feedback: " + avaliacao.getFeedback()+"\n");
            }
        }
        System.out.println("---------------------");
        System.out.println("classificação fonal: "+ item.getTotalRating());
        System.out.println();
    }

    public static void removerItem() {

    }

    public static void mostrarItem() {
        //Mostra itens
        int cont = 1;
        for (Item ite : e.getItens()) {

            if (ite instanceof Livros) {
                System.out.println("LIVRO");
                System.out.println("Autor:" + ((Livros) ite).getAutor());
                System.out.println("Número de paginas: " + ((Livros) ite).getQtdPaginas());
                System.out.println("Ano de publicação: " + ((Livros) ite).getAnoPublicacao());
                System.out.println("Edição do livro: " + ((Livros) ite).getEdicao());


            } else if (ite instanceof DVD) {
                System.out.println("DVD");
                System.out.println("Ano lançamento: " + ((DVD) ite).getAnoLancamento());
                System.out.println("Diretor: " + ((DVD) ite).getDiretor());
                System.out.println("Duração do DVD: " + ((DVD) ite).getDuracao());
            }
            System.out.println("Titulo: " + ite.getTitulo());
            System.out.println("Genero: " + ite.getGenero());
            System.out.println("Valor: " + ite.getValor());
            System.out.println();
            cont++;
        }

    }

    public static void sair() {

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

//interface
