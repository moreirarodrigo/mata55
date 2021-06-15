package pessoa;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String senha;

    public Pessoa(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    
	// Construtor
	public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

	// Getters & Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getSenha() {
        return this.senha;
    }

	// Método para imprimir as informações da classe
    @Override
    public String toString() {
        return String.format("Nome: %s\nCPF: %s", this.nome, this.cpf);
    }
}