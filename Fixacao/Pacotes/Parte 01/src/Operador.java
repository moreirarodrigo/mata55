package colaborador;

public class Operador extends Colaborador {
	private String cargo;

	public Operador(String nome, int matricula, double salario, String cargo) {
		super(nome, matricula, salario);
		this.cargo = cargo;	
	}

	public double getSalario() {
		return this.salario * 1.30; 
	}

	public String getCargo() {
		return this.cargo;
	}
}
