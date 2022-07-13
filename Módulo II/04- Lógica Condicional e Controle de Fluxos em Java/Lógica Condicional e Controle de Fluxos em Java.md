# Lógica Condicional e Controle de Fluxos em Java

## Operadores  Relacionais


**O QUE SÃO OPERADORES RELACIONAIS**

"São símbolos especiais quais são capazes de realizar comparações entre determinados operandos e, em seguida, retornar um resultado"

Tipos:
 - Similidaridade: igual, diferente
 - Tamanho: maior, maior igual, menor, menor igual

**UTILIZAÇÃO**

Similaridade
 - Igualdade: determina se um operando é igual ao outro
- Diferença: determina se um operando não é igual ao outro

Simbologia:
 - Igualdade: ==
 - Difreneça: !=

Tamanho (grandezas):
 - Maior: determina se um operando é maior do que o outro
- Maior igual: determina se um operando é maior ou igual a outro

Simbologia:
 - Maior: >
 - Maior igual: >=

Tamanho (grandezas):
 - Menor: determina se um operando é menor do que o outro
- Menor igual: determina se um operando é menor ou igual a outro

Simbologia:
 - Maior: <
 - Maior igual: <=

**Exercitando**

Criar  um simples projeto no IntelliJ para realizar as comparações dos slides anterior, além de utilizar os demais tipos de dados não apresentados. 

## Operadores Lógicos

**O QUE SÃO OPERADORES LÓGICOS?**

"São símbolos especiais quais são capazes de realizar comparaçõs lógicas entre operandos lógicos ou expressões e, em seguida, retornar um resultado"

Tipos:
 - Conjunção
 - Disjunção
 - Disjunção Exclusiva
 - Negação

**COMO UTILIZAR OPERADORES LÓGICOS**

 - **Conjunção**: operação lógica que só é verdadeira quando ambos os operandos ou expressões envolvidas são verdade
 - Simbologia: &&
 - Terminologia: and(e)
 
 - **Disjunção**: operação lógica que só é falsa quando ambos os operandos ou expressões envolvidas são falsos
 - Simbologia: ||
 - Terminologia: or(ou)

 - **Disjunção Exclusiva**: operação que só é verdadeira quando ambos os operandos ou expressões são opostos
 - Simbologia: ^
 - Terminologia: xor

 - **Negação**: operação que inverte o valor lógico de um operando ou expressão
 - Simbologia: !
 - Terminologia: inversão

**EXEMPLOS, BOAS PRÁTICAS E EXERCITANDO**

"A utilização dos operadores lógicos depende da necessidade e do tipo de decisão que precisa ser tomada."

NÃO SÃO OPERADORES LÓGICOS:
 - Operadores bitwise: & e |
 - Operadores shift: ~, >>, >>>, <<

**BOAS PRÁTICAS**
 - Crie variáveis auxiliares para guardar resultados intermediários


(salarioMensal<mediaSalario) && (quantidadeDependentes>=mediaDependentes)

pode ser

(salarioBaixo) && (muitosDependentes)

boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

EXERCITANDO

Criar um simples projeto no IntelliJ e codificar os exemplos dos slides anteriores para compreender as operações lógicas. Utilize operandos e expressões.

## Controle de Fluxo

**O QUE É CONTROLE DE FLUXO?**

"São estruturas que tem capacidade de direcionar o fluxo de execução do código"

Tipos:
 - Decisão: if, if-else, if-else-if, switch e operador ternário
 - Repetição: for, while, do while
 - Interrupção: break, continue e return

**Criando estruturas de controle de fluxo**

Tipos:
 - Decisão: estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução
 - opções: if(se), switch(escolha) e operador ternário

IF

Tipos:
 - Decisão: if, if-else, if-else-if, if-else-if-else

Operador ternário

Muito parecido com o if (estrutura exemplo: condição ? true : false;)

Obs: Evite ao máximo usar o operador ternário

SWITCH

Tipos:
 - Decisão: escolha

Vai avaliar uma variável, quais o valores que a variável pode ter.

**BOAS PRÁTICAS**

 - Switch é para valores exatos e if para expressões booleanas (se for avaliar somente uma variável use o switch, se caso for usar mais variáveis, use o if)
 - Evitar usar o default do switch para "cases genéricos" (default é usado quando se tem o valor inválido, não pode ser usado de forma genérica)
 - Evitar o efeito "flecha" dos if's
 - Evitar muitos if's aninhados
 - Usar a boa prática da aula 2 para diminuir o tamanho if

EXERCÍCIO

Criar um simples projeto no IntelliJ e criar variáveis e expressões para usar nas estruturas if e switch.

Com if, exiba o nome do mês do ano de acordo com seu núumero. Evite o efeito "flecha". Faça também outro if que verifque se o mês é julho, dezembro ou janeiro, para assim exibir o texto "Férias".

Com switch use String para a partir do dia da semana, exibir seu número. Ainda no switch, faça outro exemplo one, se uma variável inteira for entre 1 e 3 exibir o texto "Certo". Se for 4 exibir "Errado", se for 5 "Talvez". Pra demais valores exibir "Valor indefinido".

## Blocos, tipos e uso



**BLOCOS**

Conceituação: "É um grupo de 0 ou mais códigos quais trabalham em conjunto para executar uma operação".

Tipos:
 - Locais: dentro de métodos
 - Estáticos: dentro de classes (orientação a objeto)
 - Instância: dentro de classes (orientação a objeto)

Criação:
 - Locais (tudo o que estiver dentro de chaves é um bloco, quando se tem só uma linha de execução não é obrigatório abrir chaves)

{

    ...
}


