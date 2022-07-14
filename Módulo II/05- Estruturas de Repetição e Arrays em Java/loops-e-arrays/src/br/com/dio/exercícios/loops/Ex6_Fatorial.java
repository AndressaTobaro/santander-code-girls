package br.com.dio.exercícios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");

        for( int i = fatorial ; i>=1 ; i-- ) { //SHIFT+F9 (DEBUG)
            multiplicacao = multiplicacao*i;
        }

        System.out.print(multiplicacao);
    }
}
