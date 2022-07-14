package br.com.dio.exercícios.arrays;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int [] vetor = {-5, -6, 15,50,8,4}; // forma de declarar um vetor unidimensional em java setado com elementos dentro.

        System.out.print("Vetor: ");

        int count = 0;
        while(count < vetor.length) { //vetor.length retorna a quantidade de elementos no vetor
            System.out.print(vetor[count] + " ");
            count ++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length -1); i>=0; i --){
            System.out.print(vetor[i] + " ");
        }
    }
}
