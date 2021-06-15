package Loja;

import java.util.ArrayList;
import java.util.Scanner;
import Bebida.*;

public class Loja {
	private String nome;
	private String endereco;
	private String cnpj;
	ArrayList<Bebida> bebidas = new ArrayList<Bebida>();

	public Loja(String nome, String endereco, String cnpj) {
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void cadastrarBebida() {
		Scanner sc = new Scanner(System.in);

		int opt = 0;

		while(opt != 3) {
			System.out.println("1: Alcoolica - 2: Nao Alcoolica - 3: Finalizar");
			
			opt = sc.nextInt();

			String nome, tipo, embalagem;
			float preco, litros;

			switch(opt) {
				case 1:
					System.out.print("Nome: ");
					nome = sc.next();

					System.out.print("Tipo: ");
					tipo = sc.next();

					System.out.print("Embalagem: ");
					embalagem = sc.next();

					System.out.print("Preco: ");
					preco = sc.nextFloat();

					System.out.print("Litros: ");
					litros = sc.nextFloat();

					System.out.print("Teor Alcoolico: ");
					float teorAlcoolico = sc.nextFloat();

					bebidas.add(new BebidaAlcoolica(nome, tipo, embalagem, litros, preco, teorAlcoolico));

					break;
				case 2:
					System.out.print("Nome: ");
					nome = sc.next();

					System.out.print("Tipo: ");
					tipo = sc.next();

					System.out.print("Embalagem: ");
					embalagem = sc.next();

					System.out.print("Preco: ");
					preco = sc.nextFloat();

					System.out.print("Litros: ");
					litros = sc.nextFloat();

					System.out.print("Sabor: ");
					String sabor = sc.next();

					System.out.print("Com lactose? 1 - Sim, 2 - Nao: ");
					int lacOpc = sc.nextInt();

					switch(lacOpc) {
						case 1:
							bebidas.add(new BebidaNaoAlcoolica(nome, tipo, embalagem, litros, preco, sabor, true));
							break;
						case 2:
							bebidas.add(new BebidaNaoAlcoolica(nome, tipo, embalagem, litros, preco, sabor));
							break;
						default:
							System.out.println("Opçao invalida");
					}

					break;				
			}
		}
	}

	public float vender(Bebida bebida, int quantidade) {
		if(bebida instanceof BebidaAlcoolica) {
			if(quantidade > 50) {
				return bebida.getPreco() * quantidade * 0.1f;
			} else if (quantidade >= 30 && quantidade < 50) {				
				System.out.println("1: Desconto de 3% - 2: Desconto de 5%");

				Scanner sc = new Scanner(System.in);

				int opt = sc.nextInt();

				sc.close();

				switch(opt) {
					case 1:
						return bebida.getPreco() * quantidade * 0.03f;
					case 2:
						return bebida.getPreco() * quantidade* 0.05f;
					default:
						System.out.println("Escolha uma opção válida");
				}
			} else {
				return 0.0f;
			}
		} 

		return 0.0f;
	}

	public void pedido() {
		int i = 0;

		for(Bebida b: bebidas) {
			System.out.println(i++ + " - "  + b.getNome() + " - " + b.getTipo() + " - " + b.getEmbalagem() + " - " + b.getLitros() + " - " + b.getPreco());
		}

		Scanner sc = new Scanner(System.in);

		int opt = 0;

		while(opt != 2) {
			System.out.println("1 - Fazer pedido, 2 - Sair");
			
			opt = sc.nextInt();

			switch(opt) {
				case 1:
					System.out.println("Informe o indicie da bebida e a quantidade");

					System.out.print("Indicie: ");
					int index = sc.nextInt();

					System.out.print("Quantidade: ");
					int quantidade = sc.nextInt();

					float desconto = vender(bebidas.get(index), quantidade);

					float valorTotal = (bebidas.get(index).getPreco() * quantidade) - desconto;

					System.out.println("Nome: " + bebidas.get(index).getNome() + " Tipo: " + bebidas.get(index).getTipo() + " Valor unitario: " + bebidas.get(index).getPreco() + " Quantidade: " + quantidade + " Desconto: " + desconto + " Valor total: " + 	valorTotal);

					break;
			}
		}
	}
}