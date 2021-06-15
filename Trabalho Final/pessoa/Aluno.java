package pessoa;

import java.util.ArrayList;
import turma.Turma;

public class Aluno extends Pessoa {
	private String curso;
	private int matricula;
  	private ArrayList<Turma> turmasMatriculado = new ArrayList<Turma>();

	// Gerador do número único da matricula
  	private static int protocoloStart = 12345;

    private static int protocolo(){
        int prt = protocoloStart;
        protocoloStart = protocoloStart + 127;
        return prt;
    }

	// Construtor
  	public Aluno(String nome, String cpf, String senha, String curso) {
		super(nome, cpf, senha);
		this.curso = curso;
		this.matricula = protocolo();
	}

	// Getters & Setters
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

	public String getCurso() {
		return this.curso;
	}

	public int getMatricula() {
        return this.matricula;
    }

	// Método para matricular o aluno, adiciona uma turma em seu array de turmas em que está matriculado
	public void matricular(Turma turma) {
		// Matricula o aluno, caso já esteja matriculado na mesma turma ou em outra (da mesma disciplina) imprime uma mensagem
		for (Turma t: turmasMatriculado) {
			if (t.getDisciplina() == turma.getDisciplina()) {
				System.out.println("\nAluno já matriculado nesta disciplina, não é possível cursar turmas diferentes\n");
				return;
			}
		}

		turmasMatriculado.add(turma);

		System.out.println("\nAluno matriculado com sucesso\n");
	}

	// Lista todas as turmas em que o aluno se matriculou
	public void listarTurmas() {
		if(turmasMatriculado.size() == 0) {
			System.out.println("\nAluno não matriculado neste semestre\n");
		}

		for(Turma t: turmasMatriculado) {
			System.out.println(String.format("======COMPROVANTE======\n%s",t.toString()));
		}

		System.out.println("=======================\n");
	}
	// Método para imprimir as informações da classe
    @Override
	public String toString() {
		return String.format("%s\nMatricula: %s\nCurso: %s\n", super.toString(), this.matricula, this.curso);
	}
}