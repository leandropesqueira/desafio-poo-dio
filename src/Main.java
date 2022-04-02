import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(7);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro");
        devLeandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Leandro: " + devLeandro.getConteudosInscritos());
        devLeandro.progredir();
        devLeandro.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Leandro: " + devLeandro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Leandro: " + devLeandro.getConteudosConcluidos());
        System.out.println("XP: " + devLeandro.calcularTotalXp());

        System.out.println("-------------------------");

        Dev devPatricia = new Dev();
        devPatricia.setNome("Patricia");
        devPatricia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Patrícia: " + devPatricia.getConteudosInscritos());
        devPatricia.progredir();
        devPatricia.progredir();
        devPatricia.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Patrícia: " + devPatricia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Patrícia: " + devPatricia.getConteudosConcluidos());
        System.out.println("XP: " + devPatricia.calcularTotalXp());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
    }
}
