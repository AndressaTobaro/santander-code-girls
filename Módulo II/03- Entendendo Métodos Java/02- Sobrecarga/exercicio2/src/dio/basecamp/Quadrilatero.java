package dio.basecamp;

public class Quadrilatero {

    public static void area(double lado) { //Assinatura = 1 nome + 1 parâmetro
        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) { //Assinatura = 1 nome + 2 parâmetros

        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) { //Assinatura = 1 nome + 3 parâmetro

        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) { // mudando o tipo de parâmetros de double para float

        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }
}
