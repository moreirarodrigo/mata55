package heranca;

class Professor extends Pessoa {
	private String disciplina;

	Professor(String nome, String endereco, String disciplina) {
		super(nome, endereco);
		this.disciplina = disciplina;
	}

	void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	String getDisciplina() {
		return this.disciplina;
	}
}
