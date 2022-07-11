# Entendendo Métodos Java

**CONCEITUAÇÃO DE MÉTODOS**

"É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este ´eexecutado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento"

**DEFINIÇÃO**

Padrão de definição: < ?visibilidade? >< ?tipo ?>< ?modificador? >retorno nome(< ?parâmetros? >)<?exceções?>corpo

 - exceções: erros que o método pode desparar, acontecimentos inesperados.
 - o que está entre ?? é opcional
 - o nome, () e o corpo são itens obrigatórios para definição de um método

Onde:
**V**: "public", "protected" ou "private" (orientação a objeto)

T: concreto ou abstrato (orientação a objeto)

M: "static" ou "final" (orientação a objeto)

**R**: tipo de dado ou "void" (int, long, float...)

**N**: nome que é fornecido ao método (regras das variáveis)

**P**: parâmetros que pode receber (entre parenteses)

E: exceções que pode lançar (erros que podem desparar)

**C**: código que possui ou vazio (orientação a objeto)

**Exemplo:**

public String getNome(){...}

public double calcularTotalNota() {...}

public int verificarDistancia(int cordenada1, int cordenada2){...}

public abstract void executar(); - (corpo vazio para métodos)

public void alterarFabricante(Fabricante fabricante){...} - (dados primitivo)

public Relatorio gerarDadosAnaliticos(Cliente cliente, List< Compra > compras) {...} - (dados complexos)

**public static R N(P) {}** - (estrtura mais utilizada nos exemplos)

**UTILIZAÇÃO**

Passa-se uma mensagem atravé de uma classe ou objeto.

nome_da_classe.nome_do_metodo(); ou nome_da_classe.nome_do_metodo(...);

nome_do_objeto.nome_do_metodo(); ou nome_do_objeto.nome_do_metodo(...);

_Math.random(); ou Math.sqrt(4);_

_usuario.getEmail(); ou usuario.alterarEndereco(endereço);_

**CONCEITOS INERENTES AOS MÉTODOS E BOAS PRÁTICAS NA SUA CRIAÇÃO**

**Particularidades**
 - Assinatura: é a forma de identificar unicamente o método
    
        Ass = nome + parâmetros

        Método:
            public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3){...}
        
        Assinatura:
            calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3)

            Obs: Se o método não tiver parâmetros, a assinatura será só o nome e os (). Será uma lista de parâmetros vazia.

 - Construtor e Destrutor: são métodos especiais usados na Orientação a Objetos.
 - Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe.

 - Passagem de parâmetros:
   - Por valor(cópia)
   - Por referência (endereço)

_Exemplo_

int i = 10;

public void fazerAlgo(int i){

    i=i+10;
    
    System.out.println("Valor de i dentro: " + i); //i=20
}

System.out.println("Valor de i fora: " + i); //i=10

**Boas Práticas**
 - Nomes devem ser descritivos, mas curtos
 - Notação camelo

verificarSaldo(); executarTransferencia(...); existeDebito();
 
 - Deve possuir entre 80 e 120 linhas
 - Evite lista de parâmetro longas
 - Visibilidades adequadas

**Exercitando**
  
  Cria uma aplicação que resolva as seguintes situações:

  - Calucle as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
  - A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
  - Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam nos valores.

 Observações:
  
  - Tente ao máximo criar métodos que trabalhem sozinhos ou em conjunto
  - Pode chamar um método dentro de outro
  - Pode passar como parâmetro, a chamada de um outro método

    Anotações:
     - É possível chamar um método a partir de uma classe por causa do "static"


**SOBRECARGA**

**Como usar sobrecargas**

**"Sobrecarga é a capacidade de definir métodos para diferentes contextos, mas preservando seu nome."**

Para realizar a sobrecarga é só usar o mesmo método com parâmetros diferentes.

Alterar a assinatura do método:

**Ass= nome+parâmetros**

converterParaInteiro(float f);

converterParaInteiro(double d);

converterParaInteiro(String S);

converterParaInteiro(float f, RoundType rd);

converterParaInteiro(double d, RoundType rd);

converterParaInteiro(String s, RoundType rd);

_converterParaInteiro(RoundType rd, String s);_

_converterParaInteiro();_

**Sobrecarga x Sobrescrita**

- Sobrescrita está relacionada a orientação a objeto, que está ligado a herança, outro conceito ligado a orientação a objeto.
- Ambas atuam no método

**EXERCITANDO**

Cria uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.

Obs: Use sobrecarga


**RETORNOS**

**Funcionamento, considerações, uso de retornos e apresentação de exercício**

RETURN
 - É uma instrução de interrupção
 - É muito atrelado aos métodos

Funcionamento:

O método exectua seu retorno quando:
 - Completa todas suas instruções internas
 - Chega a uma declaração explicita de retorno
 - Lança uma exceção

Considerações:
 - O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto
 - O tipo de dado do retunr deve ser compatível com o do método
 - Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução

Exemplos:

public String getMensagem() {
    retunr "Olá!";
}

public double getJuros() {
    retunr 2.36;
}

public int getParcelas() {
    retunr 1.36f; *Não é um inteiro, saria erro
}

public void setIdade() {
    retunr 10; *quando é void usar "return;" não pode retornar um valor
}

public void executar() {
    
    ...

    return;

    ...
} *o return poderia estar dentro de um if, ou seja tudo o que estivesse antes do return seria executado, e se o return fosse true, tudo o que estivesse abaixo não seria executado, mas se o if fosse falso o return não seria executado e o método continuaria sua execução, ou seja, o return não interferiria na execução.

**Exercitando**

Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. Agora faça os métodos retornarem valores

