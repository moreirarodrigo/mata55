package cliente;

public class Pessoa {
    private String nome;
    private int cpf;
    private double emprestimo;

    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return this.cpf;
    }

    public double getEmprestimo() {
        return this.emprestimo;
    }

    public void pedirEmprestimo() {
        setEmprestimo(1000);
    }
}