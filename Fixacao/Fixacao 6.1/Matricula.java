import java.util.ArrayList;
import java.util.Scanner;

class Matricula {
	static private ArrayList<Atendente> atendentes = new ArrayList<Atendente>();
	static private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	static private int num = 12345;

	Matricula() {
		num = 12345;
	}

	public void cadastrarAtendente(Atendente atendente) {
		if (atendentes.contains(atendente)) {
			System.out.println("Atendente já cadastrado\n");
		} else {
			atendentes.add(atendente);
			System.out.println("Atendente cadastrado com sucesso\n");
		}
	}

	public void matricularAluno(String nome, String curso) {
		if (atendentes.size() == 0) {
			System.out.println("Aguarde o seu atendente chegar\n");
			return;
		}

		for(Atendente atendente: atendentes) {
			if(atendente.getCurso().equals(curso)) {
				Aluno aluno = new Aluno(nome, curso);
				aluno.setMatricula(num += 127);
				alunos.add(aluno);
				return;
			}
		}

		System.out.println("Aguarde o seu atendente chegar\n");

	}

	void listarAlunos() {
		if(alunos.size() == 0) {
			System.out.println("Não há alunos matriculados\n");
		} else {
			for(Aluno a: alunos) {
				System.out.println(String.format("Nome: %s, Curso: %s, Matricula: %d\n", a.getNome(), a.getCurso(), a.getMatricula()));
			}
		}
	}
}

class Atendente {
	private String nome;
	private String curso;

	Atendente(String nome, String curso) {
		this.nome = nome;
		this.curso = curso;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	void setCurso(String curso) {
		this.curso = curso;
	}

	String getNome() {
		return this.nome;
	}

	String getCurso() {
		return this.curso;
	}
}

class Aluno {
 	private String nome;
 	private String curso;
 	private int matricula;

 	Aluno(String nome, String curso) {
 		this.nome = nome;
 		this.curso = curso;
 	}

 	void setNome(String nome) {
 		this.nome = nome;
 	}

 	void setCurso(String curso) {
 		this.curso = curso;
 	}

 	void setMatricula(int matricula) {
 		this.matricula = matricula;
 	}

 	String getNome() {
 		return this.nome;
 	}

 	String getCurso() {
 		return this.curso;
 	}

 	int getMatricula() {
 		return this.matricula;
 	}
}

class Main {
 	public static void main(String[] args) {
 		Matricula matricula = new Matricula();

 		Scanner sc = new Scanner(System.in);

 		int continuar = 0;

 		while(continuar != 1) {
 			System.out.println("1 - Cadastrar atendente\n2 - Matricular aluno\n3 - Listar alunos\n4 - Continuar? Sim = 0 Não = 1\n");

			int opt = sc.nextInt();

 			switch(opt) {
	 			case 1:
	 				String nome_atendente = sc.next();
	 				String curso_responsavel = sc.next();
	 				Atendente atendente = new Atendente(nome_atendente, curso_responsavel);
	 				matricula.cadastrarAtendente(atendente);
	 				break;
	 			case 2:
	 				String nome = sc.next();
	 				String curso = sc.next();
	 				matricula.matricularAluno(nome, curso);
	 				break;
	 			case 3:
	 				matricula.listarAlunos();
	 				break;
	 			case 4:
	 				continuar  = sc.nextInt();
	 				break;
	 			default:
	 				System.out.println("Opção inválida\n");
 			}
 		}
 	}
}