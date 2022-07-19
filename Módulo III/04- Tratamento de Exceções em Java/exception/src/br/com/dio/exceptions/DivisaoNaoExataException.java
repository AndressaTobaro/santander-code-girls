package br.com.dio.exceptions;

public class DivisaoNaoExataException extends Exception{

    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}