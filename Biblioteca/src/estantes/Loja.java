package estantes;

import java.util.HashMap;
import java.util.Scanner;

public class Loja {

    private HashMap<String, Estante> estantes = new HashMap<>();


    public Loja(){
        Scanner in=new Scanner(System.in);
        for(String i :estantes.keySet()){
            System.out.println("digite o nome da Estante a ser add: ");
            String novaEstante=in.nextLine();

            if(i.equalsIgnoreCase(novaEstante)){
                System.out.println("Estante Já existente !");
              break;

            }else {
                System.out.println("digite a descrição: ");
                System.out.println("estante add");
                //estantes.put(novaEstante,);
            }
        }
    }










    public HashMap<String, Estante> getEstantes() {
        return estantes;
    }

    public void setEstantes(HashMap<String, Estante> estantes) {
        this.estantes = estantes;
    }
}
