import desafio.poo.Bootcamp;
import desafio.poo.Curso;
import desafio.poo.Dev;
import desafio.poo.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso - Introdução ao Java");
        curso1.setDescricao("Aprenda o básico e essêncial para que se possa aprender Java.");
        curso1.setCargaHoraria(3);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso - Introdução ao Java Script");
        curso2.setDescricao("Aprenda o básico do Java Script com este curso.");
        curso2.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Se aprofunde ainda mais em Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java e Java Script com este bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe:" + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Felipe:" + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Felipe:" + devFelipe.getConteudosConcluidos());
        System.out.println("XP:" + devFelipe.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
