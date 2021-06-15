package aplicacao;

public class Colaborador {
	private String nome;
	private int matricula;
	private float salario;
	private String cargo;

	Colaborador(String nome, int matricula, float salario, String cargo) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.cargo = cargo;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	void setSalario(float salario) {
		this.salario = salario;
	}
	
	void setCargo(String cargo) {
		this.cargo = cargo;
	}

	String getNome() {
		return this.nome;
	}

	int getMatricula() {
		return this.matricula;
	}

	double getSalario() {
		return this.salario;
	}
	
	String getCargo() {
		return this.cargo;
	}

	void aumentarSalario() {
		switch(this.cargo) {
			case "colaborador" :
				this.salario = this.salario * 1.05f;
				break;
			case "gerente" :
				this.salario = this.salario * 1.10f;
				break;
			case "operador" :
				this.salario = this.salario * 1.30f;
				break;
		}
	}
}
