package menu;

import java.util.Scanner;
import java.util.ArrayList;
import pessoa.*;
import turma.*;

public class Menu {
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	private ArrayList<Turma> turmas = new ArrayList<Turma>();
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

	// Método que apresenta a tela principal da aplicação
	public void menuPrincipal() throws NumberFormatException {
		Scanner sc = new Scanner(System.in);

		int opt = 0;

		while(opt != 3) {
			System.out.println("\nSISTEMA DE CADASTRO EM COMPONENTES CURRICULARES\n");

			System.out.println("[1] - Cadastro [2] - Login [3] - Sair");
			System.out.print("OPCAO: ");
			opt = Integer.parseInt(sc.nextLine());

			switch(opt) {
				case 1:
					cadastrar(sc);
					break;
				case 2:
					login(sc);
					break;
				case 3:
					System.out.println("Terminando aplicação...");
					break;
				default:
					System.out.println("Opção inválida");
			}
		}

		sc.close();
	}

	// Método que permite o login na aplicação
	public void login(Scanner sc) {
		System.out.println("\nLOGIN\n");
		System.out.print("CPF: ");
		String cpf = sc.nextLine();

		System.out.print("Senha: ");
		String senha = sc.nextLine();

		// realiza a busca pelo cpf e a senha do aluno
		for(Pessoa p: pessoas) {
			if(p.getCpf().equals(cpf) && p.getSenha().equals(senha)) {
				if(p instanceof Aluno) {
					Aluno aluno = (Aluno) p;
					try {
						menuAluno(sc, aluno);
					} catch (Exception e) {
						System.out.println("Entre com uma opção válida [1, 2, 3]");
					}
				}
			}
		}

		System.out.println("Senha incorreta ou Usuário não encontrado");
	}

	// Método que apresenta o menu de cadastros da aplicação
	public void cadastrar(Scanner sc) {
		int opt = 0;

		while(opt != 5) {
			System.out.println("\n[1] - Aluno\n[2] - Professor\n[3] - Disciplinas\n[4] - Turmas\n[5] - Voltar");

			System.out.print("OPCAO: ");
			opt = Integer.parseInt(sc.nextLine());

			switch(opt) {
				case 1:
					System.out.println("\nCADASTRO DE ALUNOS");
					cadastrarAluno(sc);
					break;
				case 2:
					System.out.println("\nCADASTRO DE PROFESSORES");
					cadastrarProfessor(sc);
					break;
				case 3:
					System.out.println("\nCADASTRO DE DISCIPLINAS");
					cadastrarDisciplina(sc);
					break;
				case 4:
					System.out.println("\nCADASTRO DE TURMAS");
					cadastrarTurma(sc);
					break;
			}
		}
	}

	// Método que permite cadastrar o aluno
	public void cadastrarAluno(Scanner sc) {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("CPF: ");
		String cpf = sc.nextLine();
		System.out.print("Senha: ");
		String senha = sc.nextLine();
		System.out.print("Curso: ");
		String curso = sc.nextLine();

		pessoas.add(new Aluno(nome, cpf, senha, curso));
	}

	// Método que permite cadastrar o professor
	public void cadastrarProfessor(Scanner sc) {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("CPF: ");
		String cpf = sc.nextLine();
		System.out.print("Departamento: ");
		String departamento = sc.nextLine();
		System.out.print("Cargo: ");
		String cargo = sc.nextLine();

		pessoas.add(new Professor(nome, cpf, departamento, cargo));
	}

	// Método que permite cadastrar a disciplina
	public void cadastrarDisciplina(Scanner sc) {
        System.out.print("Código: ");
		String codigo = sc.nextLine().toUpperCase();
		System.out.print("Componente Curricular: ");
		String componente = sc.nextLine();
		System.out.print("Carga Horaria: ");
		int ch = Integer.parseInt(sc.nextLine());
                    
        disciplinas.add(new Disciplina(codigo, componente, ch));
	}

	// Método que permite cadastrar a turma 
	public void cadastrarTurma(Scanner sc) {
		System.out.print("CPF do Professor:" );
		String cpf = sc.nextLine();
		Professor professor = getProfessor(cpf);
		if(professor == null) {
			System.out.println("Professor não cadastrado");
			return;
		}

		System.out.print("Código disciplina: ");
		String codigo = sc.nextLine().toUpperCase();
		Disciplina disciplina = getDisciplina(codigo);
		if(disciplina == null) {
			System.out.println("Disciplina não cadastrada");
			return;
		}
		
		System.out.print("Dia: ");
		String dia = sc.nextLine();

		System.out.print("Horario: ");
		String horario = sc.nextLine();

		turmas.add(new Turma(professor, disciplina, dia, horario));
	}

	// Getters (auxiliares para outros métodos)
	public Professor getProfessor(String cpf) {
		// Busca o professor pelo cpf
		for(Pessoa p: pessoas) {
			if(p instanceof Professor && p.getCpf().equals(cpf)) {
				Professor temp = (Professor) p;

				return temp;
			}
		}

		return null;
	}

	public Aluno getAluno(String cpf) {
		// Busca o aluno pelo cpf
		for(Pessoa p: pessoas) {
			if(p instanceof Aluno && p.getCpf().equals(cpf)) {
				Aluno temp = (Aluno) p;

				return temp;
			}
		}

		return null;
	}

	public Disciplina getDisciplina(String codigo) {
		// Busca a disciplina pelo código
		for(Disciplina d: disciplinas) {
			if(d.getCodigo().equals(codigo)) {
				return d;
			}
		}

		return null;
	}

	public Turma getTurma(String codigo, int numero) {
		// Busca a turma pelo código da disciplina e número da turma
		for(Turma t: turmas) {
			if(t.getNumero() == numero && t.getDisciplina().getCodigo().equals(codigo)) {
				return t;
			}
		}

		return null;
	}

	// Método que permite buscar turmas pelo código
	public void buscarTurmas(String codigo) {
		System.out.println("\n=====TURMAS=====\n");

		// Busca turmas pelo código
		for(Turma t: turmas) {
			if(t.getDisciplina().getCodigo().equals(codigo)) {
				System.out.print(t.toString());
			}
		}

		System.out.println("\n================\n");
	}

	// Método que apresenta o menu do aluno
	public void menuAluno(Scanner sc, Aluno aluno) throws NumberFormatException {
		int opt = 0;

		System.out.println(String.format("\nBEM VINDO: %s\nMATRICULA: %s - CURSO: %s\n", aluno.getNome(), aluno.getMatricula(), aluno.getCurso()));

		while(opt != 3) {
			System.out.println("[1] - Matricular\n[2] - Comprovante de Matricula\n[3] - Voltar");

			System.out.print("OPCAO: ");
			opt = Integer.parseInt(sc.nextLine());

			switch(opt) {
				case 1:
					if(turmas.size() == 0 || disciplinas.size() == 0) {
						System.out.println("\nNão há disciplinas cadastradas para esse semestre\n");
						break;
					}

					System.out.print("Codigo disciplina: ");
					String codigo = sc.nextLine().toUpperCase();

					buscarTurmas(codigo);

					System.out.print("Numero da turma: ");
					int numero = Integer.parseInt(sc.nextLine());

					Turma turma = getTurma(codigo, numero);

					aluno.matricular(turma);
					break;
				case 2:
					aluno.listarTurmas();
					break;
			}
		}
	}
}