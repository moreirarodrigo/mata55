package teste;

import colaborador.Gerente;

class Main {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Rodrigo", 123, 5400, "gerente");
		System.out.println(gerente.getNome());
	}
}
