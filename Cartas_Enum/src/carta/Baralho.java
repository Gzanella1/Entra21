package carta;

import java.util.ArrayList;

public class Baralho {
    public static Carta c =new Carta();
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho() {

        for (Naipe n : Naipe.values()) {
            int valorCarta=1;
            for (ValorCarta vc : ValorCarta.values()) {
                Carta c = new Carta();
                c.setValorCarta(vc);
                c.setNipe(n);
                c.setValorCarta(valorCarta);
                cartas.add(c);
            }
        }
        for (Carta c : baralho) {
            System.out.println(c.getNipe().getNaipe()+" "+c.getValorCarta()+" "+c.getNipe().getNaipe());
        }


    }

    public void shuffle() {



    }

    public Carta getCartaFromTop() {
    }

    public Carta getCartaBottom(){

    }

    public Carta searchCard(Naipe naipe, ValorCarta valor) {

    }

    public Carta searchCard(Naipe naipe, int valorReal) {

    }



    //GETTER E SETTERS
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}
