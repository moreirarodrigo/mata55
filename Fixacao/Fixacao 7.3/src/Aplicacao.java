package aplicacao;
import java.util.Scanner;
import empresa.*;

class Main {
    static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);

        // Criação da empresa
        System.out.println("Cadastre a sua empresa");

        System.out.print("Razão Social: ");
        String razaoSocial = sc.nextLine();

        System.out.print("CNPJ: ");
        int cnpj = sc.nextInt();

        Empresa empresa = new Empresa(cnpj, razaoSocial);

        int opt = 0;

        while(opt != 3) {
            System.out.println("\n1 - Cadastrar funcionário\n2 - Imprimir folha de pagamento\n3 - Encerrar aplicação\n");

            opt = sc.nextInt();

            switch(opt) {
                case 1:
                    // Contratação de funcionario
                    System.out.print("Nome: ");
                    String nome = sc.next();

                    System.out.print("Cargo: ");
                    String cargo = sc.next();

                    System.out.print("Salário: ");
                    double salario = sc.nextDouble();

                    empresa.contratarFuncionario(nome, cargo, salario);
                    break;
                
                case 2:
                    // Imprimir a folha de pagamento
                    empresa.imprimirFolha();
            }
        }
    }

    public static void main(String[] args) {
        menuPrincipal();
    }
}