package objetos.item;

import objetos.Item;

import java.util.Locale;

public class Estante {
    private int capMaxima;
    private Item[] itens;


    public Estante(int capacidadeMaxima) {
        setCapMaxima(capacidadeMaxima);
        setItens(new Item[capMaxima]);

    }

    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens() {
     //quando eu sei que eu tenho que passar em todas as posições
       int contador=0;
        for(Item i : this.getItens() ){
           if(i != null){
               contador++;
           }
       }
        return 0;
    }

    public Item buscarItem(String titulo) {
        for (Item i : this.getItens()){
            if(i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
            }
        }
        return null;
    }

    public boolean adicionarItem(Item item) {
       for (int i = 0; i< this.getItens().length; i++) {
            if (this.getItens()[i] == null) {
                this.getItens()[i] = item;
                return true;
            }
       }
        return false;
    }

    public Item removerItem(int posicao) {
        //armazena o item em uma variavel
       Item i =this.getItens()[posicao];
       //faz esse item virar nullo
       this.getItens()[posicao]=null;
       return i;
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
