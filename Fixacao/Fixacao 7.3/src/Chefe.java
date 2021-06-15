package empresa;

public class Chefe extends Funcionario {
    private byte bonus;
    
    public Chefe(String nome, String funcao, double salario, byte bonus) {
        super(nome, funcao, salario);
        this.bonus = bonus;
    }

    public byte getBonus(){
        return bonus;
    }

    public void setBonus(byte bonus){
        this.bonus = bonus;
    }

    @Override
    public double getSalario(){
        return super.getSalario() + super.getSalario() * this.bonus;
    }

    @Override
    public void promoverFuncionario(String funcao, double salario){
        super.promoverFuncionario(funcao, salario);
        this.bonus += 1;
    }

    @Override
        public double pedirEmprestimo(){
        return 0.4* super.getSalario() + 0.1*this.bonus;
    }
}