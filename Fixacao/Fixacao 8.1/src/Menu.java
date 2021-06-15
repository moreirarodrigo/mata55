package Classes;

import java.util.Scanner;

public class Menu {
  public void menuPrincipal() {
    Scanner sc = new Scanner(System.in);

    int opt = 0;

    do {

        System.out.println("[1] Calcular preço de Graduação\n" +
                               "[2] Calcular preço de Pos-Graduação\n" +
                               "[3] Terminar menu");

        opt = Integer.parseInt(sc.nextLine());
        
        switch(opt) {
            case 1:
                calculaPrecoGraduacao(sc);
            case 2:
				calcularPrecoPosGraduacao(sc);
            case 3:
                System.out.println("Saindo da aplicação");
            break;
        }
    } while (opt != 3);
  }

    public void calcularPrecoPosGraduacao(Scanner scanner) {
        System.out.print("Você estudou aqui na graduação? (S/n): ");
        boolean graduacao = scanner.nextLine().equalsIgnoreCase("S");

        System.out.print("Carga Horaria do Curso de Pos-Graduação de escolha: ");
        int cargaHoraria = Integer.parseInt(scanner.nextLine());
        
		System.out.print("Nivel da graduacao [1] ESPECIALIZACAO [2] MESTRADO [3] DOUTORADO: ");
        int opcoesNivel = Integer.parseInt(scanner.nextLine());

        PosGraduacao.Nivel[] niveis =  {
                    PosGraduacao.Nivel.ESPECIALIZACAO, 
                    PosGraduacao.Nivel.MESTRADO, 
                    PosGraduacao.Nivel.DOUTORADO};
        PosGraduacao.Nivel NIVEL = niveis[opcoesNivel -1];

        PosGraduacao dummy = new PosGraduacao(0, "temp", "temp", 0, cargaHoraria, NIVEL);
        double taxa = graduacao && NIVEL == PosGraduacao.Nivel.ESPECIALIZACAO ? 0 : PosGraduacao.getTaxaMatricula();
        double preco = dummy.calculaPrecoCurso();
        double desconto = graduacao ? 0.05 : 0;

        System.out.printf("Preço do Curso: R$ %.2f\n", preco * (1 - desconto));
        System.out.printf("Taxa do curso: %.2f %%\n", taxa * 100);
    }

    public void calculaPrecoGraduacao(Scanner scanner) {
        System.out.print("Você possui irmão na faculdade? (S/n): ");
        boolean irmao = scanner.nextLine().equalsIgnoreCase("S");

        System.out.print("Quantidade de disciplinas obrigatorias: ");
        int obrigatorias = Integer.parseInt(scanner.nextLine());

        System.out.print("Quantidade de disciplinas optativas: ");
        int optativas = Integer.parseInt(scanner.nextLine());

        Graduacao dummy = new Graduacao(0, "temp", "temp", 0, obrigatorias, optativas);
        double preco = dummy.calculaPrecoCurso();
        double taxa = irmao ? 0 : Graduacao.getTaxaMatricula();

        System.out.printf("Preço do Curso: R$ %.2f\n", preco);
        System.out.printf("Taxa do curso: %.2f %%\n", taxa * 100);
    }
}