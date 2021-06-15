package aplicacao;

import java.util.Scanner;
import java.util.ArrayList;

public class Aplicacao {
	public static void main(String[] args) {
		ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			String nome = sc.nextLine();
			int matricula = Integer.parseInt(sc.nextLine());
			float salario = Float.parseFloat(sc.nextLine());
			String cargo = sc.nextLine();
			
			Colaborador c = new Colaborador(nome, matricula, salario, cargo);
			
			colaboradores.add(c);
		}
	
		sc.close();
		
		for (Colaborador c: colaboradores) {
			c.aumentarSalario();
		}
		
		for (Colaborador c: colaboradores) {
			System.out.println(String.format("Nome: %s, Matricula: %d, Salario: %.2f, Cargo: %s", c.getNome().charAt(0), c.getMatricula(),c.getSalario(),c.getCargo()));
		}
	}
}
