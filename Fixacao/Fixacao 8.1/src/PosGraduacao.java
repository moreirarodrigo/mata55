package Classes;

public class PosGraduacao extends Cursos {
    public enum Nivel {
        ESPECIALIZACAO, MESTRADO, DOUTORADO
    };

    private int cargaHoraria;
    private Nivel NIVEL;
    private static double taxaMatricula = 0.1;

    public PosGraduacao(int codigo, String nome, String area, int numVagas, int cargaHoraria, Nivel NIVEL) {
        super(codigo, nome, area, numVagas);
        this.cargaHoraria = cargaHoraria;
        this.NIVEL = NIVEL;
    }

    @Override
    // da pra user um switch aqui só pra ficar mais bonitinho
    public double calculaPrecoCurso() {
        switch (this.NIVEL) {
            case ESPECIALIZACAO:
                return 200.0 * cargaHoraria;
            default:
                return 175.0 * cargaHoraria;
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Nivel getNIVEL() {
        return NIVEL;
    }

    public void setNIVEL(Nivel NIVEL) {
        this.NIVEL = NIVEL;
    }

    public static double getTaxaMatricula() {
        return taxaMatricula;
    }

    public static void setTaxaMatricula(double taxaMatricula) {
        PosGraduacao.taxaMatricula = taxaMatricula;
    }
}