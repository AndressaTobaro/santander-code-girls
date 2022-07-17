package dio.santandercodegirl.relacoes.exercicio2;

class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

//        Vendedor vendedor_ = (Vendedor) new Funcionario(); //Downcast, evitar!!
    }
}
