package empresa;

import java.util.ArrayList;

public class Empresa {
    private static int cnpj;
    private static String razaoSocial;
    private ArrayList<Funcionario> Funcionarios = new ArrayList<Funcionario>();

    public Empresa(int cnpj, String razaoSocial) {
        this.cnpj = cnpj;this.razaoSocial = razaoSocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void contratarFuncionario(String nome, String funcao, double
    salario) {
        Funcionario funcionario = new Funcionario(nome, funcao, salario);
        Funcionarios.add(funcionario);
    }

    public void contratarFuncionario(String nome, String funcao, double
    salario, byte bonus) {
        Funcionario funcionario = new Chefe(nome, funcao, salario, bonus);
        Funcionarios.add(funcionario);
    }

    public void imprimirFolha() {
        System.out.println("CNPJ: " + this.cnpj);

        System.out.println("Razão Social: " + this.razaoSocial);

        for(Funcionario funcionario: Funcionarios){
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Bônus: " + funcionario.pedirEmprestimo());
        }
    }
}