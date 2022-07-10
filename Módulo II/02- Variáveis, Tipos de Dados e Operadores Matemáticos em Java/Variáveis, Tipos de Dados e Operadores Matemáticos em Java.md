# Variáveis, Tipos de Dados e Operadores Matemáticos em Java

## Conceituação e Criação

**Variável: "Um espaço na memória do computador, onde se pode guardar valores."**

Existem 4 tipos de Variáveis na linguagem Java:
 - Instância: objeto
 - Classe: classe
 - Local: dentor de métodos (método main)
 - Parâmetro: Na assinatura do método

**PADRÃO DE DEFINIÇÃO:**

<?visibilidade?><?modificador?>tipo nome<?=valorInicial?>;

V: "public", "protected" e "private"

M: "static" e "final" (valor constante)

T: tipo de dado

N: nome que é fornecido a variável (Java: linguagem fortemente tipada)

VI: valor inicial caso se deseje

_Obs: O que estiver entre ? é opcional ao criar uma variável, dependendo do tipo e necessidade_

**CONVENÇÕES E REGRAS:**
 - Não devem começar com números;
 - Embora permitido, "$" e "_" devem ser evitados;
 - São case-sensitive;
 - Sem espaços;
 - Não pode ser as palavras reservadas do Java.

**BOAS PRÁTICAS**
 - Sempre começar com letra minúscula
 - Nomes expressivos
 - Notação camelo
 - Quando constante(final) maiúscula e separada por "_"

## Tipos de dados

**CONCEITUAÇÃO**

**Dados: "São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente."**

Tipificação:
 - Estática(forte) vs Dinâmica(fraco)
 - Primitivo vs Composto

**Estática:** quando a linguagem obriga a definir o tipo da variável já no momento da sua criação.

**Dinâmica:** não é obrigado a definir o tipo da variável durante sua criação, durante execução da aplicação a linguagem vai detectar o valor da variavel e a partir desse momento vai definir que a variável é daquele tipo.

**Primitivo:** tipos de dados mais básicos que uma linguagem pode fornecer, são atomico e homogeneos (numéricos, textuais).

**Composto:** ligado a orientação a objeto, é heterogêneo, composto por vários tipos de dados primitivos ou compostos.

**Opções de tipos:**
 - Textual
 - Numeral
 - Lógico
 - Objeto

**NUMERAL**
 - byte: -128 até 127
 - short: -32.768 até 32.767
 - int (32): -2.147.483.648 até 2.147.483.647
 - long (64): -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807
 - float (32): +/- 3.40282347E+38F
 - double (64): +/- 1.79769313486231570E+308

**TEXTUAL**
 - char: caracteres de 16-bit unicode ('')
 - String: um tipo "especial" ("")

**LÓGICO**
 - boolean: true e false

**Valor Default**
 - byte: 0
 - short: 0
 - int: 0
 - long: 0L
 - float: 0.0f
 - double: 0.0d
 - char: '\u0000'
 - String (e objetos): null
 - boolean: false

**BOAS PRÁTICAS**

Usar de forma adequada cada tipo de dado para cada informação.

## Operadores Aritméticos

**Operadores Aritméticos:** "São símbolos especiais quais são capazes de realizar ações específicas em um, dois ou mais operandos e, em seguida, retornar um resultado."

**Tipos:**
 - pós-fixado: exp++ (soma 1) ou exp-- (subtrai 1)
 - prefixado: ++exp (primeiro soma 1 depois avalia aexpressão) ou --exp (primeiro subtrai 1 depois avalia aexpressão)
 - aritmético: +, -, *, / e %
 - atribuição: =, +=, -=, *=, /= e %=

**Precedência**

 - Pós-fixado (exp++, exp--)
 - Prefixado(++exp, --exp)
 - Multiplicativo(*, /, %)
 - Aditivo(+,-)
 - Atribuição(=, +=, -=, *=, /=, %=)

## Conversões (casting)

**Casting:** "É a transformação de uma determinada variável de tipo menos específico para o tipo mais específico ou vice-versa."

**Tipos:**
 - Upcast (implícito) - promoção de um tipo de dado de menor capacidade de armazenamento para um tipo maior.
 - Downcast (explícito) - promoção de um tipo de dado de maior capacidade de armazenamento para um tipo menor (possíveis perdas de dados)



