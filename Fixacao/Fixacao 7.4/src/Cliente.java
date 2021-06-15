package cliente;

public class Cliente extends Pessoa{
    private double salario;

    public Cliente(String nome, int cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
    
    public void pedirEmprestimo() {
        super.setEmprestimo(2 * this.salario);
    }
}