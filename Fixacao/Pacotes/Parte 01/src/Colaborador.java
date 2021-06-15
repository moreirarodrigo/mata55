package colaborador;

public class Colaborador {
	protected String nome;
	protected int matricula;
	protected double salario;

	public Colaborador(String nome, int matricula, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public double getSalario() {
		return this.salario;
	}

	public void aumentarSalario() {
		this.salario = this.salario * 1.05;
	}
}
