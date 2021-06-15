package colaborador;

public class Gerente extends Colaborador {
	private String cargo;

	public Gerente(String nome, int matricula, double salario, String cargo) {
		super(nome, matricula, salario);
		this.cargo = cargo;	
	}

	public double getSalario() {
		return this.salario * 1.10; 
	}

 	public String getCargo() {
		return this.cargo;
	}
}
