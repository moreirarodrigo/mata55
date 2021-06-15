public class Fiador {
  private String nome;
  private int cpf;
  private float renda_mensal;

  Fiador(String nome, int cpf, float renda_mensal) {
    this.nome = nome;
    this.cpf = cpf;
    this.renda_mensal = renda_mensal;
  }

  float getRenda() {
    return this.renda_mensal;
  }

  void setRenda(float renda_mensal) {
    this.renda_mensal = renda_mensal;
  }

  public static void main(String[] args) {
    Fiador fiador = new Fiador("Rodrigo", 123456789, 4505.50f);

    System.out.println(fiador.getRenda());
  }
}