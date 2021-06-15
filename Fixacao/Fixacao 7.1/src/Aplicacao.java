package heranca;

class Aplicacao {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Rodrigo", "Casa");
		Estudante estudante = new Estudante("Rodrigo Estudante", "Universidade", "UFBA", "5 Semestre");
		Professor professor = new Professor("Rodrigo Professor", "Universidade", "Programação Orientada a Objetos");
		EstudanteInternacional estudanteInternacional = new EstudanteInternacional("Rodrigo Internacional", "Universidade", "UFBA", "4 Semestre", "Bósnia");
		
		System.out.println("Nome: " + pessoa.getNome() + " Endereço: " + pessoa.getEndereco());
		System.out.println("Nome: " + estudante.getNome() + " Endereço: " + estudante.getEndereco() + " Escola: " + estudante.getEscola() + " Serie: " + estudante.getSerie());
		System.out.println("Nome: " + professor.getNome() + " Endereço: " + professor.getEndereco() + " Disciplina: " + professor.getDisciplina());
		System.out.println("Nome: " + estudanteInternacional.getNome() + " Endereço: " + estudanteInternacional.getEndereco() + " Escola: " + estudanteInternacional.getEscola() + " Serie: " + estudanteInternacional.getSerie() + " País: " + estudanteInternacional.getCountry());
	}
}
