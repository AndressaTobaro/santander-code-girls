package dio.santandercodegirls;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int habitantes = input.nextInt();
        int brancos = input.nextInt();
        int nulos = input.nextInt();
        int validos = input.nextInt();


        int pBrancos = (brancos * 100)    / habitantes;
        int pNulos = (nulos * 100)   / habitantes;
        int pValidos = (validos * 100)   / habitantes;


        System.out.println("Brancos: " + pBrancos + "%");

        System.out.println("Nulos: " + pNulos + "%");

        System.out.println("Validos: " + pValidos + "%");

    }
}
