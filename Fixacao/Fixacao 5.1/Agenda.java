import java.util.ArrayList;

class Contato {
    String nome;
    int telefone;

    Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    String getNome() {
        return this.nome;
    }

    int getTelefone() {
        return this.telefone;
    }
}

class Agenda {
    ArrayList<Contato> contatos = new ArrayList<Contato>();

    void addContato(Contato contato) {
        contatos.add(contato);
    }

    void listaContatos() {
        for (Contato c: contatos) {
            System.out.println("Nome: " + c.getNome() + ", Telefone: " + c.getTelefone());
        }
    }

    void removeContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome() == nome) {
                contatos.remove(i);
            }
        }
    }

    void removeContato(int tel) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getTelefone() == tel) {
                contatos.remove(i);
            }
        }
    }

    void alteraTelefone(String nome, int tel) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome() == nome) {
                contatos.get(i).setTelefone(tel);
            }
        }
    }

    int qtdContatos() {
        return contatos.size();
    }

}

public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Rodrigo", 35353035);
        Contato c2 = new Contato("Woody", 35353035);
        Contato c3 = new Contato("Rick", 35353035);
        Contato c4 = new Contato("Jack", 35353035);
        Contato c5 = new Contato("Alice", 35353035);

        Agenda agenda = new Agenda();

        System.out.println(agenda.qtdContatos());

        agenda.addContato(c1);
        agenda.addContato(c2);
        agenda.addContato(c3);
        agenda.addContato(c4);
        agenda.addContato(c5);

        agenda.listaContatos();

        agenda.alteraTelefone("Rodrigo", 40028922);

        System.out.println(c1.getNome() + ", " + c1.getTelefone());

        agenda.removeContato("Rick");

        System.out.println(agenda.qtdContatos());

        agenda.listaContatos();
    }
}
