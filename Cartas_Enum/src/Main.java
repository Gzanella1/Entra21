import carta.Carta;
import carta.Naipe;
import carta.ValorCarta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Carta> baralho =new ArrayList<>();
        for (Naipe n : Naipe.values()) {
            for (ValorCarta vc : ValorCarta.values()) {
                var c = new Carta();
                c.setValorCarta(vc);
                c.setNipe(n);
                baralho.add(c);
            }
        }
        for (Carta c : baralho) {
            System.out.println(c.getNipe().getNaipe()+" "+c.getValorCarta()+" "+c.getNipe().getNaipe());
        }
    }
    }

