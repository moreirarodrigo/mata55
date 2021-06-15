package turma;

public class Disciplina {
	private String codigo;
	private String nome;
	private int ch;

	// Construtor
	public Disciplina(String codigo, String nome, int ch) {
		this.codigo = codigo;
		this.nome = nome;
		this.ch = ch;
	}

	// Getters & Setters
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public int getCh() {
		return this.ch;
	}
	
	// Método para imprimir as informações da classe
	@Override
	public String toString() {
		return String.format("Código: %s\nComponente Curricular: %s\nCH: %d", this.codigo, this.nome, this.ch);
	}
}