import Loja.*;

class Main {
  public static void main(String[] args) {
    Loja loja = new Loja("Bar de Dona Zeca", "Na esquina", "40028922");

    loja.cadastrarBebida();

    loja.pedido();
  }
}