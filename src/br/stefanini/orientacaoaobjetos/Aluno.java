package br.stefanini.orientacaoaobjetos;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	
	ArrayList<Float> notas = new ArrayList<>();
	Float media = 0.0f;

	public Aluno(String nome) {
		super(nome);
		this.setTipo("aluno");
	}
	
	public void addNota(Float nota) {
		this.notas.add(nota);
	}
	
	private void calculoNotas() {
		for (Float nota : notas) {
			this.media += nota;
		}
		this.media /= (float) this.notas.size();
	}
	
	public Float getNotaMedia() throws Exception {
		if (this.notas.size() == 0) {
			throw new Exception("Aluno sem notas registradas");
		} else {
			calculoNotas();
			return media;
		}
	}

}
