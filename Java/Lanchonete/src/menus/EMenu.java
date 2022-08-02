package menus;


import com.sun.tools.javac.Main;

public enum EMenu  {
    X_SALADA(1 ," X-Salada"),
    X_BURGUER(2, "X-BURGUER"),
    MISTO_QUENTE(3,"MISTO QUENTE"),
    HOTDOG(4,"HOT DOG"),
    MINI_PIZZA(5,"MINI PIZZA"),
    PIZZA(6,"PIZZA");

    private int Opcao;
    private String descricao;

    EMenu(int valor, String descricao) {
        Opcao = valor;
        this.descricao = descricao;
    }


}
