package br.com.dio.exercícios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int [] numerosAleatorios = new int[20];

        for( int i=0; i<numerosAleatorios.length ; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero+1) + " ");
        }

        System.out.print("\nAntecessores dos Números Aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero-1) + " ");
        }
    }
}
