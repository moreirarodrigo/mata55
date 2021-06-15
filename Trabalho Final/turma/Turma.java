package turma;

import pessoa.Professor;

public class Turma {
	private Professor professor;
	private Disciplina disciplina;
	private String dia;
	private String horario;
	private int numero;

	// Gerador do número único da turma
	private static int numeroStart = 1;

	private static int numeroTurma() {
		int temp = numeroStart;
		numeroStart += 1;
		return temp;
	}

	// Construtor
	public Turma(Professor professor, Disciplina disciplina, String dia, String horario) {
		this.professor = professor;
		this.disciplina = disciplina;
		this.dia = dia;
		this.horario = horario;
		this.numero = numeroTurma();
	}

	// Getters & Setters
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return this.professor;
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public String getDia() {
		return this.dia;
	}

	public String getHorario() {
		return this.horario;
	}

	public int getNumero() {
		return this.numero;
	}

	// Método para imprimir as informações da classe
	@Override
	public String toString() {
		return String.format("%s\nProfessor: %s\nDia: %s\nHorario: %s\nNumero: %s\n", this.getDisciplina().toString(),this.professor.getNome(), this.dia, this.horario, this.numero);
	}
}
