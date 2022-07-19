import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);

//        Conteudo conteudo = new Curso(); //polimorfismo: tudo o que tenho em conteudo tem em Curso, mas nem tudo o que tenho em Curso tenho em Conteudo
//        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAndressa = new Dev();
        devAndressa.setNome("Andressa");
        devAndressa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andressa" + devAndressa.getConteudosInscritos());

        devAndressa.progredir();
        devAndressa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Andressa" + devAndressa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Andressa" + devAndressa.getConteudosConcluidos());
        System.out.println("XP: " + devAndressa.calcularTotalXp());

        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
