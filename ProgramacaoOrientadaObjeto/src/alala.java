import classes.Sanduiche;

import java.util.Scanner;

public class alala {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = "terminar";
        int contNaopode = 0, InfantilA = 0, InfantilB = 0, JuvenilA = 0, JuvenilB = 0, Master = 0, AdultoA = 0, AdultoB = 0;

        while (nome != "terminar") {
            System.out.println("digite o nome do competidor ");
            String Nome = in.next();
            System.out.println("digite a idade");
            int idade = in.nextInt();

            if (idade < 6) {
                System.out.println(" Não poderá participar");
                contNaopode++;

            } else if (idade >= 7 && idade <= 9) {

                System.out.println("Infantil A");
                InfantilA++;

            } else if (idade >= 10 && idade <= 11) {
                System.out.println("Infantil B");
                InfantilB++;

            } else if (idade >= 12 && idade <= 14) {
                System.out.println("Juvenil A");
                JuvenilA++;
            } else if (idade >= 15 && idade <= 17) {
                System.out.println("Juvenil B");
                JuvenilB++;

            } else if (idade >= 18 && idade <= 22) {
                System.out.println("Master");
                Master++;

            } else if (idade >= 23 && idade <= 27) {
                System.out.println("Adulto A");
                AdultoA++;

            } else if (idade >= 28 && idade <= 30) {
                System.out.println("Adulto B");
                AdultoB++;
            } else {
                System.out.println(" Idade inválida para participar da competição, digite novamente");
                contNaopode++;
            }
        }
        System.out.println("Número de pessoas que não poderão partiacipar:" + contNaopode);
        System.out.println("Número de pessoas que poderão partiacipar:" + InfantilA);
        System.out.println("Número de pessoas que poderão partiacipar: " + InfantilB);
        System.out.println("Número de pessoas que poderão partiacipar: " + JuvenilA);
        System.out.println("Número de pessoas que poderão partiacipar: " + JuvenilB);
        System.out.println("Número de pessoas que poderão partiacipar: " + Master);
        System.out.println("Número de pessoas que poderão partiacipar: " + AdultoA);
        System.out.println("Número de pessoas que poderão partiacipar: " + AdultoB);


    }
}
