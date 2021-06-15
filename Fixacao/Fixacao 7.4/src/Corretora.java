package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Corretora {
    private ArrayList<Pessoa> clientes = new ArrayList<Pessoa>();

    public void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);

        String nome;
        int cpf;
        double salario;
        double bonus;

        int opt = 0;

        System.out.println("CADASTRAR CLIENTES");

        while(opt != 4) {
            System.out.println("\n1 - Desempregado\n2 - Empregado\n3 - Chefia\n4 - Sair");

            opt = sc.nextInt();

            switch(opt) {
                case 1:
                    System.out.println("Nome: ");
                    nome = sc.next();

                    System.out.println("CPF: ");
                    cpf = sc.nextInt();

                    cadastrarCliente(nome, cpf);

                    break;
                case 2:
                    System.out.println("Nome: ");
                    nome = sc.next();

                    System.out.println("CPF: ");
                    cpf = sc.nextInt();

                    System.out.println("Salário: ");
                    salario = sc.nextDouble();

                    cadastrarCliente(nome, cpf, salario);

                    break;
                case 3:
                    System.out.println("Nome: ");
                    nome = sc.next();

                    System.out.println("CPF: ");
                    cpf = sc.nextInt();

                    System.out.println("Salário: ");
                    salario = sc.nextDouble();

                    System.out.println("Bônus: ");
                    bonus = sc.nextDouble();

                    cadastrarCliente(nome, cpf, salario, bonus);

                    break;
            }
        }

    }

    public void cadastrarCliente(String nome, int cpf) {
        clientes.add(new Pessoa(nome, cpf));
    }

    public void cadastrarCliente(String nome, int cpf, double salario) {
        clientes.add(new Cliente(nome, cpf, salario));
    }

    public void cadastrarCliente(String nome, int cpf, double salario, double bonus) {
        clientes.add(new Chefe(nome, cpf, salario, bonus));
    }

    public void listarClientes() {
        System.out.println("LISTAR CLIENTES");

        for(Pessoa cliente: clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Emprestimo: " + cliente.getEmprestimo());
        }
    }
}