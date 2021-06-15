package pessoa;

public class Pessoa {
    private String nome;
    private String tipo;
    private String cpf_cnpj;
    private String telefone;
    private int data_nascimento;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;

    public Pessoa(String nome, String tipo, String cpf_cnpj, String telefone, int data_nascimento, String rua, int numero, String complemento, String bairro) {
        this.nome = nome;
        this.tipo = tipo;
        this.cpf_cnpj = cpf_cnpj;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCpfCnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public void setTelefone(String telefone) {
	    this.telefone = telefone;
	}

    public void setDataNascimento(int data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getCpfCnpj() {
        return this.cpf_cnpj;
    }

    public String getTelefone() {
		return this.telefone;
	}

    public int getDataNascimento() {
        return this.data_nascimento;
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void verificaIdade() {
	    if (this.tipo == "fisica") {
	        if (2021 - this.data_nascimento >= 18) {
	            System.out.println("Pessoa maior de idade");
	        } else {
	            System.out.println("Pessoa menor de idade");
	        }
	    } else {
	        System.out.println("Metodo invalido. A Pessoa e uma pessoa juridica");
	    }
	}

    public String toString() {
        return String.format("Nome: %s\nTipo: %s\nCPF(CNPJ): %s\nTel.: %s\nNascimento: %d", this.getNome(), this.getTipo(), this.getCpfCnpj(), this.getTelefone(),this.getDataNascimento());
    }
}