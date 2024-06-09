package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	// atributos
	private LocalDate data;

	// construtor
	public Mentoria() {
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	// toString
	@Override
	public String toString() {
		return "{" + getTitulo() + ", " + getDescricao() + ", " + data + "}";
	}

	// métodos
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}

}
