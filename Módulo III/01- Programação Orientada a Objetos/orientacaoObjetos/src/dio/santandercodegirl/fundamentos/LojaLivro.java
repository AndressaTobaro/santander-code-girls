package dio.santandercodegirl.fundamentos;

import java.util.ArrayList;
import java.util.List;

public class LojaLivro {
    public static void main(String[] args) {
        List<Livro> livrosLoja = new ArrayList<>(){{
            add(new Livro("As coisas que você só vê quando desacelera", "Haemin Sunim", "autoajuda", "Sextante", 256));
            add(new Livro("Quando ninguém estpa olhando", "Alyssa Cole", "suspense", "Intrínsica", 400));
            add(new Livro("O poder do agora", "Eckart Tolle", "autoajuda", "Sextante", 224));
        }};

        System.out.println(livrosLoja);
    }
}

class Livro implements Comparable<Livro>{
    public String titulo;
    public String autor;
    public String assunto;
    public String editora;
    public Integer paginas;

    public Livro(String titulo, String autor, String assunto, String editora, Integer paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.assunto = assunto;
        this.editora = editora;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getEditora() {
        return editora;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", assunto='" + assunto + '\'' +
                ", editora='" + editora + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public int compareTo(Livro livro) {
        return this.getTitulo().compareToIgnoreCase(livro.getTitulo());
    }


}