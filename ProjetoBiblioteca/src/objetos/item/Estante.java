package objetos.item;

import objetos.Item;

public class Estante {
    private int capMaxima;
    private Item[] itens;

    //parametros passar valores de uma classe para outra
    //Construtor constroi um objeto
    //quando der um new estante, na mani vai fazer tudo o que tiver no construtor
    //agregação ?
    public Estante(int capacidadeMaxima) {
        setCapMaxima(capacidadeMaxima);
        setItens(new Item[capMaxima]);

    }

    public boolean estanteCheia() {
        return quantidadeItens() == capMaxima;
    }

    public int quantidadeItens() {
        //todo
        return 0;
    }

    public Item buscarItem(String titulo) {
        //todo
        return null;
    }

    public boolean adicionarItem(Item item) {
        //todo
        return false;
    }

    public Item removerItem(int posicao) {
        //todo
        return null;
    }

    //GETTER & SETTER
    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}
