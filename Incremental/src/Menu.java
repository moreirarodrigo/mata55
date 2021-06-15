package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;
import pessoa.*;

public class Menu {
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void menuPrincipal() {
		Scanner sc = new Scanner(System.in);

		int opt = 0;

		while(opt != 4) {
			System.out.println("\n1 - Pessoa\n2 - Doacao\n3 - Necessidade\n4 - Sair");

			opt = sc.nextInt();

			switch(opt) {
				case 1:
					menuPessoa();
					break;
				case 2:
					// não implementado pois tenho que realizar mudanças no código
					//menuDoacao();
					break;
				case 3:
					menuNecessidade();
					break;
				case 4:
					System.out.println("Saindo da aplicação");
					break;
				default:
					System.out.println("Opção inválida");
			}
		}
	}

	private void menuPessoa() {
		Scanner sc = new Scanner(System.in);

		int opt = 0;

		while(opt != 3) {
			System.out.println("\n1 - Cadastrar\n2 - Listar\n3 - Voltar");

			opt = sc.nextInt();

			switch(opt) {
				case 1:
					System.out.println("\n1 - Doador\n2 - Beneficiário");

					String nome, tipo, cpf_cnpj, telefone, rua, complemento, bairro;
					int data_nascimento, numero;

					int opc = sc.nextInt();

					switch(opc) {
						case 1:
							System.out.print("Nome: ");
							nome = sc.next();

							System.out.print("Tipo: ");
							tipo = sc.next();

							System.out.print("CPF(CPNJ): ");
							cpf_cnpj = sc.next();

							System.out.print("Telefone: ");
							telefone = sc.next();

							System.out.print("Data de nascimento: ");
							data_nascimento = sc.nextInt();

							System.out.print("Rua: ");
							rua = sc.next();

							System.out.print("Número: ");
							numero = sc.nextInt();

							System.out.print("Complemento: ");
							complemento = sc.next();

							System.out.print("Bairro: ");
							bairro = sc.next();


							for(Pessoa pessoa: pessoas) {
								if(pessoa.getCpfCnpj().equals(cpf_cnpj)) {
									System.out.println("Usuário já cadastrado");
									break;
								}
							}

							pessoas.add(new Doador(nome, tipo, cpf_cnpj, telefone, data_nascimento, rua, numero, complemento, bairro));

							break;
						case 2:
							System.out.print("Nome: ");
							nome = sc.next();

							System.out.print("Tipo: ");
							tipo = sc.next();

							System.out.print("CPF(CPNJ): ");
							cpf_cnpj = sc.next();

							System.out.print("Telefone: ");
							telefone = sc.next();

							System.out.print("Data de nascimento: ");
							data_nascimento = sc.nextInt();

							System.out.print("Email: ");
							String email = sc.next();

							System.out.print("Rua: ");
							rua = sc.next();

							System.out.print("Número: ");
							numero = sc.nextInt();

							System.out.print("Complemento: ");
							complemento = sc.next();

							System.out.print("Bairro: ");
							bairro = sc.next();

							for(Pessoa pessoa: pessoas) {
								if(pessoa.getCpfCnpj().equals(cpf_cnpj)) {
									System.out.println("Usuário já cadastrado");
									break;
								}
							}

							pessoas.add(new Beneficiario(nome, tipo, cpf_cnpj, telefone, data_nascimento, email, rua, numero, complemento, bairro));
							break;
					}

					break;
				case 2:
					System.out.print("CPF(CNPJ): ");
					cpf_cnpj = sc.next();

					for(Pessoa pessoa: pessoas) {
						if(pessoa.getCpfCnpj().equals(cpf_cnpj)) {
							System.out.println(pessoa.toString());
							break;
						} 
					}
					System.out.println("Usuário não encontrado ou não cadastrado");
					break;
			}
		}
	}

	// private void menuDoacao() {
	// 	Scanner sc = new Scanner(System.in);

 //        int opt = 0;

 //        while(opt != 4) {
 //            System.out.println("1 - Adicionar doação\n2 - Remover doação\n3 - Listar doações\n4 - Encerrar aplicação\n");

 //            opt = sc.nextInt();

 //            switch(opt) {
 //                case 1:
 //                    String tipo = sc.next();
 //                    String descricao = sc.next();
 //                    String estado = sc.next();
 //                    int quantidade = sc.nextInt();
 //                    boolean entrega = sc.nextBoolean();

 //                    Doacao doacao = new Doacao(doador, tipo, descricao, estado, quantidade, entrega);
 //                    doador.addDoacao(doacao);
 //                    break;
 //                case 2:
 //                    int protocolo = sc.nextInt();
 //                    doador.removeDoacao(protocolo);
 //                    break;
 //                case 3:
 //                    doador.listaDoacoes();
 //                    break;
 //                case 4:
 //                    System.out.println("Encerrando a aplicação\n");
 //                    break;
 //                default: 
 //                    System.out.println("Entre com uma opção válida\n");
 //                    break;
 //            }
 //        }
	// }

	private void menuNecessidade() {
		System.out.println("Menu necessidade");
	}
}