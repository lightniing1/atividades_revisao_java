package br.stefanini.aula4.matriz;

class Aluno {
	
	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

public class Matriz {

	public static void main(String[] args) {
		Aluno[] matrizAlunos = new Aluno[5];
		
		matrizAlunos[0] = new Aluno("Aluno 1");
		matrizAlunos[1] = new Aluno("Aluno 2");
		matrizAlunos[2] = new Aluno("Aluno 3");
		matrizAlunos[3] = new Aluno("Aluno 4");
		matrizAlunos[4] = new Aluno("Aluno 5");
		
		for (Aluno aluno : matrizAlunos ) {
			System.out.println(aluno.getNome());
		}

	}

}
