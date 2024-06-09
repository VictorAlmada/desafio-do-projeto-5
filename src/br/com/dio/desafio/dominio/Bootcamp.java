package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	//atributos
	private String nome;
	private String descricao;
	private final LocalDate DATA_INICIO = LocalDate.now();
	private final LocalDate DATA_FINAL = DATA_INICIO.plusDays(45);
	private Set<Dev> devsIncritos = new HashSet<>(); 
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Dev> getDevsIncritos() {
		return devsIncritos;
	}
	public void setDevsIncritos(Set<Dev> devsIncritos) {
		this.devsIncritos = devsIncritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDATA_INICIO() {
		return DATA_INICIO;
	}
	public LocalDate getDATA_FINAL() {
		return DATA_FINAL;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DATA_FINAL, DATA_INICIO, conteudos, descricao, devsIncritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(DATA_FINAL, other.DATA_FINAL) && Objects.equals(DATA_INICIO, other.DATA_INICIO)
				&& Objects.equals(conteudos, other.conteudos) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsIncritos, other.devsIncritos) && Objects.equals(nome, other.nome);
	}
	
	
}
