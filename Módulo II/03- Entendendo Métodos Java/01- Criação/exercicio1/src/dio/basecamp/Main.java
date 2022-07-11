package dio.basecamp;

public class Main {

    public static void main(String[] args) {

        //Caluculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5, 2.5);

        //Mensagens
        System.out.println("Exercício mensagens");
        Mensagens.obterMensagem(9);
        Mensagens.obterMensagem(14);
        Mensagens.obterMensagem(1);

        //Emprestimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
