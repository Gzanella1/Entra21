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
        Estante e = new Estante(5);
        boolean loop = true;
        while (loop) {
            EMenu opcao = escolherOpcao();
            switch (opcao) {
                case SAIR: loop = false;
                    break;
                case ADICIONAR_ITEM: adicionarItem(e);
                    break;
                case BUSCAR_ITEM: buscarItemETratarRetorno(e);
                    break;
                case REMOVER_ITEM: removerItem(e);
                    break;
                case MOSTRAR_ITENS: mostarItens(e);
                    break;
                default:
                    System.out.println("Opção não implementada!");
            }
        }
        System.out.println("Programa finalizado!");
    }

    public static EMenu escolherOpcao() {
        EMenu escolha = null;
        while (escolha == null) {
            System.out.println("Selecione uma opção");
            for (EMenu menu : EMenu.values()) {
                System.out.printf("(%d) - %s\n", menu.getValorOpcao(), menu.getDescricao());
            }
            escolha = EMenu.getByValorOpcao(in.nextInt());
            in.nextLine();
            if (escolha == null) {
                System.err.println("Selecione uma opção válida!");
            }
        }
        return escolha;
    }

    // Adicionar item na estante
    public static void adicionarItem(Estante e) {
        if (e.estanteCheia()) {
            System.err.println("Sua estante está cheia! Não é possível adicionar mais itens!");
        } else {
            Item i = null;
            int escolha = -1;
            while (escolha < 0 || escolha > 1) {
                System.out.print("Informe o item que deseja adicionar (0 - Livro / 1 - DVD): ");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 1) {
                    System.err.println("Selecione uma opção válida");
                }
            }
            in.nextLine();
            if (escolha == 0) {
                i = new Livros();
            } else {
                i = new DVD();
            }
            System.out.print("Informe o título: ");
            i.setTitulo(in.nextLine());
            System.out.print("Informe o gênero: ");
            i.setGenero(in.nextLine());
            System.out.print("informe o valor: R$");
            i.setValor(in.nextDouble());
            in.nextLine();
            if (i instanceof Livros) {
                Livros l = ((Livros) i);
                System.out.print("Informe o autor: ");
                l.setAutor(in.nextLine());
                System.out.print("Informe a quantidade de páginas: ");
                l.setQtdPaginas(in.nextInt());
                System.out.print("Informe o ano de publicação: ");
                l.setAnoPublicacao(in.nextInt());
                System.out.println("Informe a edição: ");
                l.setEdicao(in.nextInt());
                in.nextLine();
            } else {
                DVD dvd = ((DVD) i);
                System.out.println("Informe o diretor: ");
                dvd.setDiretor(in.nextLine());
                System.out.println("Informe o ano de lançamento: ");
                dvd.setAnoLancamento(in.nextInt());
                System.out.println("Informe a duração");
                dvd.setDuracao(in.nextDouble());
            }
            if (!e.adicionarItem(i)) {
                System.err.println("Não foi possível adicionar o item na estante!");
            } else {
                System.out.println("Item adicionado com sucesso!");
            }
        }
    }

    public static void buscarItemETratarRetorno(Estante e) {
        System.out.print("Informe o título para busca: ");
        Item i = e.buscarItem(in.nextLine());
        if (i == null) {
            System.err.println("O título buscado não existe na estante!");
        } else {
            int escolha = -1;
            while (escolha < 0 || escolha > 2) {
                System.out.println(i.getTitulo()+ " encontrado! Ações disponíveis: ");
                System.out.println("(1) - Ver avaliações");
                System.out.println("(2) - Avaliar");
                System.out.println("(0) - Voltar");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 2) {
                    System.err.println("Selecione uma opção válida");
                }
            }
            in.nextLine();
            switch (escolha) {
                case 0:
                    System.out.println("Retornando...");
                    break;
                case 1:
                    mostarAvaliacoes(i);
                    break;
                case 2:
                    i.avaliar();
                    break;
            }
        }
    }

    public static void mostarAvaliacoes(Item i) {
        for (Avaliacao a : i.getAvaliacoes()) {
            if (a != null) {
                System.out.println("Autor: "+a.getNome());
                System.out.println("avaliação: "+a.getRating());
                System.out.println("Comentário: ");
                System.out.println(a.getFeedback());
                System.out.println("--------------------");
            }
        }
        System.out.println("Classificação final: "+i.getTotalRating());
    }

    public static void removerItem(Estante e) {
        if (e.quantidadeItens() == 0) {
            System.err.println("Não é possível remover itens de uma estante vazia!");
        } else {
            int posicao = -1;
            while(posicao < 0 || posicao > e.getCapMaxima()) {
                System.out.print("Informe a posição do item para remover: ");
                posicao = in.nextInt();
                if (posicao < 0 || posicao > e.getCapMaxima()) {
                    System.err.println("Selecione uma opção válida!");
                }
            }
            in.nextLine();
            Item i = e.removerItem(posicao);
            if (i != null) {
                System.out.println("Item "+i.getTitulo()+" removido!");
            }
        }
    }

    public static void mostarItens(Estante e) {
        if (e.quantidadeItens() == 0) {
            System.out.println("Estante vazia!");
        } else {
            for (int i = 0; i < e.getCapMaxima(); i++) {
                Item item = e.getItens()[i];
                if (item != null) {
                    System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");
                }
            }
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

//interface
