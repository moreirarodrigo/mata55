package pessoa;

import java.util.ArrayList;

public class Doador extends Pessoa{
    private ArrayList<Doacao> doacoes = new ArrayList<Doacao>();

    public Doador(String nome, String tipo, String cpf_cnpj, String telefone, int data_nascimento, String rua, int numero, String complemento, String bairro) {
        super(nome, tipo, cpf_cnpj, telefone, data_nascimento, rua, numero, complemento, bairro);
    }

    @Override
    public void verificaIdade() {
        if (super.getTipo() == "fisica") {
            if (2021 - super.getDataNascimento() >= 18) {
                System.out.println("Doador maior de idade");
            } else {
                System.out.println("Doador menor de idade");
            }
        } else {
            System.out.println("Metodo invalido. O doador e uma pessoa juridica");
        }
    }

    public void addDoacao(Doacao doacao) {
        if (doacoes.contains(doacao)) {
            System.out.println("Doacao já cadastrada\n");
        } else {
            doacoes.add(doacao);
            System.out.println("Doação adicionada com sucesso");
            System.out.println("Protocolo :" + doacao.getProtocolo() + "\n");
        }
    }

    public void listaDoacoes() {
        if(doacoes.size() == 0) {
            System.out.println("Não há doações cadastradas\n");
        } else {
            for (Doacao d : doacoes) {
                System.out.println(String.format("Doações: \nTipo: %s\nDescrição: %s\nEstado: %s\nQuantidade: %d\nEntrega: %b\nProtocolo: %d\n", d.getTipo(), d.getDescricao(), d.getEstado(), d.getQuantidade(), d.getEntrega(), d.getProtocolo()));
            }
        }
    }

    public void alteraDoacao(Doacao doacao, String descricao) {
        if(doacoes.contains(doacao)) {
            int index = doacoes.indexOf(doacao);
            doacoes.get(index).setDescricao(descricao);
        } else {
            System.out.println("Doação não cadastrada");
        }
    }

    public void removeDoacao(int protocolo) {
        for (Doacao doacao: doacoes) {
            if(doacao.getProtocolo() == protocolo) {
                doacoes.remove(doacao);
                System.out.println("Doação removida com sucesso\n");    
                return;
            }
        }
        System.out.println("Doacao já removida ou não cadastrada\n");   
    }

    public int quantidadeDoacoes() {
        return doacoes.size();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
