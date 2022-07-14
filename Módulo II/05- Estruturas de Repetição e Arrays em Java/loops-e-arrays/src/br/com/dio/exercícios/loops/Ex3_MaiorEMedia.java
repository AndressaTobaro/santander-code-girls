package br.com.dio.exercícios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;


            count = count + 1;
        }while(count < 5); //enquanto o count for menor que 5 continue pedindo numero

        System.out.println("Maior número: " + maior);
        System.out.println("Media: " + (soma/5));

    }
}
