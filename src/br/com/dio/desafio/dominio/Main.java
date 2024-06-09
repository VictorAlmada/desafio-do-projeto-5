package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição Curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setData(LocalDate.now());
		
		Conteudo conteudo = new Curso();
		
		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
 		System.out.println("Conteúdos Incritos " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
 		devCamila.progredir();
 		devCamila.progredir();
 		System.out.println("Conteúdos Incritos " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
 		System.out.println("Conteúdos Concluidos " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
 		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
 		System.out.println("Conteúdos Incritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
 		devJoao.progredir();
 		devJoao.progredir();
 		devJoao.progredir();
 		System.out.println("Conteúdos Incritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
 		System.out.println("Conteúdos Concluidos " + devJoao.getNome() + ": " + devCamila.getConteudosConcluidos());
 		System.out.println("XP: " + devJoao.calcularTotalXp());


		
	}
}
