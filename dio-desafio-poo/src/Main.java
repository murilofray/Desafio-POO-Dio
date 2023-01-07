
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author muril
 */
public class Main {

    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso java");
        cursoJava.setDescricao("descrição curso java");
        cursoJava.setCargaHoraria(8);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("curso spring");
        cursoSpring.setDescricao("descrição curso spring");
        cursoSpring.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Orange Tech + | BackEnd");
        bootcamp.setDescricao("Descrição Bootcamp Orange Tech + | BackEnd");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoSpring);
        bootcamp.getConteudos().add(mentoria);

        Dev devMurilo = new Dev();
        devMurilo.setNome("Murilo");
        devMurilo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Murilo:" + devMurilo.getConteudosInscritos());
        devMurilo.progredir();
        devMurilo.progredir();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Murilo:" + devMurilo.getConteudosInscritos());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Conteúdos Concluídos Murilo:" + devMurilo.getConteudosConcluidos());
        System.out.println("------------------------------------------------------------------");
        System.out.println("XP:" + devMurilo.calcularTotalXp());

        System.out.println("------------------------------------------------------------------");

        Dev devBrenno = new Dev();
        devBrenno.setNome("Brenno");
        devBrenno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Brenno:" + devBrenno.getConteudosInscritos());
        devBrenno.progredir();
        devBrenno.progredir();
        devBrenno.progredir();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Brenno:" + devBrenno.getConteudosInscritos());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Conteúdos Concluidos Brenno:" + devBrenno.getConteudosConcluidos());
        System.out.println("------------------------------------------------------------------");
        System.out.println("XP:" + devBrenno.calcularTotalXp());

    }
}
