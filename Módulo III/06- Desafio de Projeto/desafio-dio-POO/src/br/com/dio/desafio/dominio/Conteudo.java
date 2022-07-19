package br.com.dio.desafio.dominio;

public abstract class Conteudo { //classe abstract não pode ser instanciada

    protected static final double XP_PADRAO = 10d; // modificador de acesso protected (classes filhas), static quer dizer que podemos acessar o XP_PADRAO fora desta classe

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
