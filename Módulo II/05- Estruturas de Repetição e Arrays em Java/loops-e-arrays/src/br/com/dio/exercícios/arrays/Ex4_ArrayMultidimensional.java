package br.com.dio.exercícios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {

    public static void main(String[] args) {

        Random random = new Random();

        int [][] M = new int [4][4];//1[linha] 2[coluna]

        for(int i=0; i< M.length; i++) {
            for(int j=0; j<M[i].length;j++) { //i=1ªlinha j=cada coluna da 1ªlinha
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha: M) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
