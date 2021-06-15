package Classes;

public abstract class Cursos {
  private int codigo;
  private String nome;
  private String area;
  private int numVagas;
  private static double taxa_matricula = 0.1;
  
  public Cursos(int codigo, String nome, String area, int numVagas) {
    this.codigo = codigo;
    this.nome = nome;
    this.area = area;
    this.numVagas = numVagas;
  }

  public abstract double calculaPrecoCurso();

  public static double getTaxaMatricula() {
    return taxa_matricula;
  }

  public static void setTaxaMatricula(double taxa_matricula) {
    Cursos.taxa_matricula = taxa_matricula;
  }
}