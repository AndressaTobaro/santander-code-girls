package br.com.dio.santandercodegirls;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        if((n>=0)&&(n<=10000)){System.out.println((n+1)*(n+2)/2);}

    }
}
