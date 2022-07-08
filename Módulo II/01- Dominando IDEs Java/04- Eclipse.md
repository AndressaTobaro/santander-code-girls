# Eclipse

## Criando seu Primeiro Projeto

 - Ao iniciar a IDE, selecione a pasta onde serão salvos seus projetos (para buscar é só clicar em Browse)
 - Para abrir o console selecione window -> show view -> console
 - Para olhar outras perspectivas pressione (CTRL + 3) ou lupa de pesquisar. Ex: escreva git e selecione Perspective.
 - (CTRL + N) - selecione Java project (criando novo projeto java)
 - selecionar a pasta src do novo projeto e clicar (CTRL + N)
 - Selecionar ou buscar class
 - selecionar a opção avoid.. ou escrever no arquivo dentro do public class: main e CTRL+espaço
 - escrever sysout e CTRL+ espaço
- Run as - java aplication

## Atalhos

 - Mudar o tema: window -> preferences -> general -> appearance -> Theme: Dark
 - Alterar tamanho da fonte: window -> preferences -> general -> appearance -> colors and fonts -> pasta Java -> Java editor text font -> editar
 - para mudar nome do pacote: selecione o pacote e pressione F2
 - Gerar contuct: CTRL + 3 -> buscar constru -> selecionar: Comands:Generate Constructor using fields 
 - Getter and Setters: CTRL + 3 -> buscar getter -> selecionar: Comands:Generate Getters and Setters
 - Equals: CTRL + 3 -> buscar equals -> selecionar: Comands:Generate hashCode() and equals()
 - CTRL + 3 -> buscar tostring -> selecionar: Comands:Generate tostring
 - Para mover uma linha de código inteira: ALT + seta
 - Refatorar (identação): CTRL + SHIFT + F
 - Importar classe: CTRL+ SHIFT + O
 - Para comentar: CTRL+SHIFT+C

## Git e GitHub

   - Lembrete: cada ponto do pacote é uma pasta
   - New Repository
   - IDE Eclipse -> selecionar primeiro projeto java -> botão direito -> team -> share project -> criar novo repositorio .git
   - IDE Eclipse -> selecionar primeiro projeto java -> botão direito -> team -> commit
   - Mudar perspectiva git -> gitstaging -> staged Changes -> Commit message -> commit and push ->Colar URI do repositorio gitHub -> autenticar usuario e senha
_Sem IDE_
    - Prompt de comando -> entrar na pasta onde está o código (comando cd)
    - git init (comando que inicia o versionamento)
    - git add . (adicionando tudo dentro da pasta)
    - git commit -m "First Commit" (comitando)
    - git remote add origin uri(http....)
    - git push origin master

## Debug

- CTRL+D (para apagar a linha)
- CTRL +1 (adicionar função)
- Break point + Botão direito -> debug as -> java aplication -> mudar de perspectiva debug
- Resume (F8)
- CTRL+F2 - encerrar o programa
- F5 entrar no método que está dando erro


 - Editar Java: Build Path -> Configure Build Path -> Java Build Path
