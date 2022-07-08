# Instalação JDK e Git 

Links e passo a passo no [GitHub da Camila Cavalcante](https://github.com/cami-la/curso-dio-dominando-ides-java).

## Sistema Operacional Windows 

### JDK

1. Aperte o botão windows + R e pesquise CMD
2. Para pequisar se tem instalado java na máquina, escreva no prompt de comandos: **java --version**
3. Para pequisar se tem instalado git na máquina, escreva no prompt de comandos: **git --version**
4. [Azul - Java Dowload](https://www.azul.com/downloads/?package=jdk#download-openjdk)
5. Buscar Java 11 (LTS) - seu sistema operacional
6. Baixar o arquivo .zip
7. Criar uma pasta com o nome Java em: C:\Program Files
8. Abrir o arquivo zipado no Dowloads e clicar em "Extrair tudo"
9. Selecionar a pasta criada com o nome Java
10. Clicar em Extrair
11. Copiar endereço da pasta
12. Configurar agora para que o sistema entenda onde o Java está instalado na máquina
13. Abrir Propriedades do Sitema
14. Avançados
15. Variáveis de Ambiente
16. Novo
17. Nome da Variável: JAVA_HOME
18. Valor da variável: colar o endereço da pasta extraída
18. Ok
19. Ir em Variáveis do Sistema
20. Selecionar Path
21. Editar
22. Novo
23. Colar o endereço da pasta extraída + \bin (no final do endereço)
24. Mover para cima (até o topo)
25. Ok

### GIT

1. [Dowload Git Windows](https://git-scm.com/download/win)
2. Instalador
3. Git Bash
4. git --version (para confirmar a instalação)
5. Configuração do nome e email para versionamento
6. git config --global user.name _"Nome"_
7. git config --list (listando as configurações para confirmar o nome)
8. git config --global user.email _email@email.com_ (setar o mesmo email do seu github)
