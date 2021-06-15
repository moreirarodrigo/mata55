import java.util.ArrayList;

class Onibus {
  String placa;
  int capacidade;
  String dataRevisao;
  String nomeMotorista;
  boolean status;
  Linha linha;

  Onibus(String placa, int capacidade, String dataRevisao, String nomeMotorista, boolean status, Linha linha) {
    this.placa = placa;
    this.capacidade = capacidade;
    this.dataRevisao = dataRevisao;
    this.nomeMotorista = nomeMotorista;
    this.status = status;
    this.linha = linha;
  }

  Onibus(String placa, int capacidade, String dataRevisao, Linha linha) {
    this.placa = placa;
    this.capacidade = capacidade;
    this.dataRevisao = dataRevisao;
    this.status = false;
    this.linha = linha;
  }

  // Setters
  void setPlaca(String placa) {
    this.placa = placa;
  }

  void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  void setDataRevisao(String dataRevisao) {
    this.dataRevisao = dataRevisao;
  }

  void setNome(String nomeMotorista) {
    this.nomeMotorista = nomeMotorista;
  }

  void setStatus(boolean status) {
    this.status = status;
  }

  void setLinha(Linha linha) {
    this.linha = linha;
  }

  // Getters
  String getPlaca() {
    return this.placa;
  }

  int getCapacidade() {
    return this.capacidade;
  }

  String getDataRevisao() {
    return this.dataRevisao;
  }

  String getNome() {
    return this.nomeMotorista;
  }

  boolean getStatus() {
    return this.status;
  }

  Linha getLinha() {
    return this.linha;
  }
}

class Linha {
  String codigo;
  String cidadePartida;
  String cidadeDestino;
  ArrayList<Onibus> listaOnibus = new ArrayList<Onibus>();

  Linha(String codigo, String cidadePartida, String cidadeDestino) {
    this.codigo = codigo;
    this.cidadePartida = cidadePartida;
    this.cidadeDestino = cidadeDestino;
  }

  Linha(String codigo, String cidadePartida, String cidadeDestino, ArrayList<Onibus> listaOnibus) {
    this.codigo = codigo;
    this.cidadeDestino = cidadeDestino;
    this.cidadePartida = cidadePartida;
    this.listaOnibus = listaOnibus;
  }

  // Setters
  void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  void setPartida(String partida) {
    this.cidadePartida = partida;
  }

  void setDestino(String destino) {
    this.cidadeDestino = destino;
  }

  void setOnibus(ArrayList<Onibus> onibus) {
    this.listaOnibus = onibus;
  }

  // Getters
  String getCodigo() {
    return this.codigo;
  }

  String getPartida() {
    return this.cidadePartida;
  }

  String getDestino() {
    return this.cidadeDestino;
  }

  ArrayList<Onibus> getOnibus() {
    return this.listaOnibus;
  }

  void addOnibus(Onibus onibus) {
    if (this.listaOnibus.contains(onibus)) {
      System.out.println("Onibus já adicionado");
    } else {
      this.listaOnibus.add(onibus);
    }
  }

  boolean removeOnibus(Onibus onibus) {
    for (Onibus o : listaOnibus) {
      if (o == onibus) {
        this.listaOnibus.remove(o);
        return true;
      }
    }

    return false;
  }

  boolean removeOnibus(String placa) {
    for (Onibus o : listaOnibus) {
      if (o.getPlaca() == placa) {
        this.listaOnibus.remove(o);
        return true;
      }
    }

    return false;
  }

  void imprimeLinha() {
    System.out.println("Codigo: " + this.getCodigo() + ", Partida: " + this.getPartida() + ", Destino: " + this.getDestino() + ", Quantidade de onibus: " + this.quantidadeOnibus());
  }

  void imprimeOnibus() {
    for (Onibus o : listaOnibus) {
      System.out.println("Placa: " + o.getPlaca() + ", Capacidade: " + o.getCapacidade() + ", Ultima Revisao: "
          + o.getDataRevisao() + ", Motorista: " + o.getNome() + ", Status: " + o.getStatus());
    }
  }

  void imprimeOnibus(boolean status) {
    for (Onibus o : listaOnibus) {
      if (o.getStatus() == status) {
        System.out.println("Placa: " + o.getPlaca() + ", Capacidade: " + o.getCapacidade() + ", Ultima Revisao: "
            + o.getDataRevisao() + ", Motorista: " + o.getNome() + ", Status: " + o.getStatus());
      }
    }
  }

  int quantidadeOnibus() {
    return listaOnibus.size();
  }
}

class Main {
  public static void main(String[] args) {
    Linha barra1 = new Linha("1340", "Salvador", "Cajazeiras");
    Onibus o1 = new Onibus("35353035", 50, "30/05/1995", "Josisvaldo", true, barra1);
    Onibus o2 = new Onibus("35353035", 50, "30/05/1995", "Josiscreuson", false, barra1);
    Onibus o3 = o2;

    System.out.println("Adicionando onibus");
    barra1.addOnibus(o1);
    barra1.addOnibus(o2);
    barra1.addOnibus(o3);

    System.out.println("Imprime Linha");
    barra1.imprimeLinha();

    System.out.println("Todos os onibus");
    barra1.imprimeOnibus();
    System.out.println("Onibus ativos");
    barra1.imprimeOnibus(true);
    System.out.println("Onibus inativos");
    barra1.imprimeOnibus(false);

    System.out.println("Removendo onibus por referencia");
    barra1.removeOnibus(o2);

    System.out.println("Removendo onibus por placa");
    barra1.removeOnibus("35353035");

    barra1.imprimeLinha();
  }
}
