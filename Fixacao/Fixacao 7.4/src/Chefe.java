package cliente;

public class Chefe extends Cliente {
    private double bonus;
    
    public Chefe(String nome, int cpf, double salario, double bonus) {
        super(nome, cpf, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void pedirEmprestimo() {
       super.setEmprestimo(2 * super.getSalario() + (super.getSalario() * this.bonus));
    }
}