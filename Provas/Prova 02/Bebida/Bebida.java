package Bebida;

public abstract class Bebida {
	private String nome;
	private String tipo;
	private String embalagem;
	private float litros;
	private float preco;
	private static float ipi = 0.2f;

	public Bebida(String nome,String tipo, String embalagem, float litros, float preco) {
		this.nome = nome;
		this.tipo = tipo;
		this.embalagem = embalagem;
		this.litros = litros;
		this.preco = preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

	public String getEmbalagem() {
		return this.embalagem;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPreco() {
		return this.preco;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

	public float getLitros() {
		return this.litros;
	}

	private float getIpi() {
		return ipi;
	}

	public float precoFinal() {
		return this.preco + (this.preco * this.getIpi());
	}
}