public class Contrato {
  int numero;
  int valor;
  int qntd_meses;
  int qntd_prestacoes_pagas;
  int qntd_prestacoes_atraso;
  int juros_prestacao;
  int meses_despejo;
  String status;
  Fiador fiador;

  Contrato(int numero, int valor, int qntd_meses, int qntd_prestacoes_pagas, int qntd_prestacoes_atraso,
      int juros_prestacao, int meses_despejo, String status, Fiador fiador) {
    this.numero = numero;
    this.valor = valor;
    this.qntd_meses = qntd_meses;
    this.qntd_prestacoes_pagas = qntd_prestacoes_pagas;
    this.qntd_prestacoes_atraso = qntd_prestacoes_atraso;
    this.juros_prestacao = juros_prestacao;
    this.meses_despejo = meses_despejo;
    this.status = status;
    this.fiador = fiador;
  }

  int getValorPrestacao() {
    return this.valor;
  }

  float calcularPrestacao() {
    return this.valor + (this.valor * this.juros_prestacao);
  }
}
