package classes.pedido;

import classes.lanche.*;

public class Pedido {
    //criando uma lista de objetos da classe lanche
    private Lanche[] lanche = new Lanche[10];

    public Lanche[] getLanche() {
        return lanche;
    }

    public void setLanche(Lanche[] lanche) {
        this.lanche = lanche;
    }

    public void imprimirComanda() {


        //checa se todas as posições estão nulas, ou se possui algum pedido
        for (Lanche l : this.getLanche()) {
            //verifica se a posição a sima é nula
            if (l != null) {
                //se não for nulo
                //checa se é uma minipizza e uma pizza(pq pizza extend da mini pizza)
                if (l instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza) l);
                    System.out.println("====" + l.getTipo() + "-" + ((MiniPizza) l).getSabor());
                    if (mp.isBordarecheada()) {
                        System.out.println("--COM BORDA " + mp.getSaborborda().toUpperCase() + "--");
                    }
                    if (l instanceof Pizza) {
                        System.out.println("Tamanho: " + ((Pizza) l).getTamanho());
                    }
                } else {
                    System.out.println("====" + l.getTipo() + "====");
                }
                if (l instanceof XBurguer) {
                    if (((XBurguer) l).isAberto()) {
                        System.out.println("--LANCHE ABERTO--");
                    }
                }
                System.out.printf("valor: R$%.2f\n", l.getValor());
                System.out.println("Ingrediente-");
                //percore todos os ingredientes do objeto
                for (String ingrediente : l.getIngredientes()) {
                    if (ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }
                if (l instanceof Sanduiche) {
                    Sanduiche s = (Sanduiche) l;
                    if (s.getAdicionais()[0] != null) {
                        System.out.println("-ADICIONAIS-");
                        for (String adicional : s.getAdicionais()) {
                            if (adicional != null) {
                                System.out.println(adicional);
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("-------------------------------");
    }

    public double calcularValorTotal() {
        double vlrTotal = 0;
        //for(Lanche l : this.getvalor()){
        //vlrtotal += l.getValor();

        for (int i = 0; i < lanche.length; i++) {
            if (this.lanche[i] != null) {
                vlrTotal = vlrTotal + lanche[i].getValor();

            }
        }
        return vlrTotal;
    }

    public void adicionarLanche(Lanche lanche) {
        for (int i = 0; i < 10; i++) {
            if (this.lanche[i] == null) {
                this.lanche[i] = lanche;
                break;
            }
        }
    }
}
