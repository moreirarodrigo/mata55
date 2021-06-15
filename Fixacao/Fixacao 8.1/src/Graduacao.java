package Classes;

public class Graduacao extends Cursos {
    private int disciplinasObrigatorias;
    private int disciplinasOptativas;
    private static double taxaMatricula = 0.1;

    public Graduacao(int codigo, String nome, String area, int numVagas, 
            int disciplinasObrigatorias, int disciplinasOptativas) {
        super(codigo, nome, area, numVagas);
        this.disciplinasObrigatorias = disciplinasObrigatorias;
        this.disciplinasOptativas = disciplinasOptativas;
    }

    @Override
    public double calculaPrecoCurso() {
        return 150.0 * (disciplinasObrigatorias + disciplinasOptativas);
    }

    public int getDisciplinasObrigatorias() {
        return disciplinasObrigatorias;
    }

    public void setDisciplinasObrigatorias(int disciplinasObrigatorias) {
        this.disciplinasObrigatorias = disciplinasObrigatorias;
    }

    public int getDisciplinasOptativas() {
        return disciplinasOptativas;
    }

    public void setDisciplinasOptativas(int disciplinasOptativas) {
        this.disciplinasOptativas = disciplinasOptativas;
    }

    public static double getTaxaMatricula() {
        return taxaMatricula;
    }

    public static void setTaxaMatricula(double taxaMatricula) {
        Graduacao.taxaMatricula = taxaMatricula;
    }
}