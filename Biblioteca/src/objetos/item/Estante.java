package objetos.item;

import objetos.Item;

import java.util.ArrayList;
import java.util.Locale;

public class Estante {
    private int capMaxima;
    private ArrayList<Item> itens = new ArrayList<>();

    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
    }

    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens() {
        return this.itens.size();
    }

    public Item buscarItem(String titulo) {
        //lista item transforma e string filtrando tudo onde o i
        return this.itens.stream().filter(i -> i.getTitulo().equalsIgnoreCase(titulo))
                .findFirst().orElse(null);
    }


    public boolean adicionarItem(Item item) {
        if (!estanteCheia()) {
            return this.itens.add(item);
        }
        return false;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public Item removerItem(int posicao) {
        return this.itens.remove(posicao);

    //GETTER & SETTER

    }
}
