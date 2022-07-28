package br.stefanini.orientacaoaobjetos;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Aluno 1");
		Aluno aluno2 = new Aluno("Aluno 2");
		
		Professor professor = new Professor("Professor 1");
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getTipo());
		
		System.out.println(professor.getNome());
		System.out.println(professor.getTipo());
		
		try {
			System.out.println(aluno.getNotaMedia());
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//System.out.println(aluno.calculoNotas(5.1f, 5.7f, 5.9f));
		aluno.addNota(5.1f);
		aluno.addNota(5.7f);
		aluno.addNota(5.9f);
		
		try {
			System.out.println(aluno.getNotaMedia());
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
