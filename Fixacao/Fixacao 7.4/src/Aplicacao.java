package aplicacao;

import cliente.*;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Corretora corretora = new Corretora();

        corretora.cadastrarCliente();

        corretora.listarClientes();
    }
}