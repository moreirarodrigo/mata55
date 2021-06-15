package pessoa;

public class Professor extends Pessoa {
	private String departamento;
	private String cargo;

	// Construtores
	public Professor(String nome, String cpf, String senha, String departamento, String cargo) {
		super(nome, cpf);
		this.departamento = departamento;
		this.cargo = cargo;
	}

  	public Professor(String nome, String cpf, String senha, String departamento) {
		super(nome, cpf);
		this.departamento = departamento;
		this.cargo = "Substituto";
	}

	// Getters & Setters
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public String getCargo() {
		return this.cargo;
	}
	
	// Método para imprimir as informações da classe
	@Override
	public String toString() {
		return String.format("%s\nDepartamento: %s\nCargo: %s", super.toString(), this.departamento, this.cargo);
	}
}