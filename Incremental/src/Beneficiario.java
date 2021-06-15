package pessoa;

public class Beneficiario extends Pessoa{
	private String email;

	public Beneficiario(String nome, String tipo, String cpf_cnpj, String telefone, int data_nascimento, String email, String rua, int numero, String complemento, String bairro) {
		super(nome, tipo, cpf_cnpj, telefone, data_nascimento, rua, numero, complemento, bairro);
		this.email = email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	@Override
	public void verificaIdade() {
	    if (super.getTipo() == "fisica") {
	        if (2021 - super.getDataNascimento() >= 18) {
	            System.out.println("Beneficiario maior de idade");
	        } else {
	            System.out.println("Beneficiario menor de idade");
	        }
	    } else {
	        System.out.println("Metodo invalido. O beneficiario e uma pessoa juridica");
	    }
	}

	@Override
	public String toString() {
		return String.format("%s\nEmail: %s", super.toString(), this.getEmail());
	}
}
