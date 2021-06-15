package Bebida;

public class BebidaAlcoolica extends Bebida {
	private float teorAlcoolico;
	private static float imposto = 0.02f;

	public BebidaAlcoolica(String nome,String tipo, String embalagem, float litros, float preco, float teorAlcoolico) {
		super(nome, tipo, embalagem, litros, preco);
		this.teorAlcoolico = teorAlcoolico;
	}

	public BebidaAlcoolica(String nome,String tipo, String embalagem, float litros, float preco) {
		super(nome, tipo, embalagem, litros, preco);
		this.teorAlcoolico = 0.03f;
	}

	public void setTeorAlcoolico(float teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public float getTeorAlcoolico() {
		return this.teorAlcoolico;
	}

	public float getImposto() {
		return imposto;
	}

	@Override
	public float precoFinal() {
		return super.precoFinal() + (super.precoFinal() * this.getImposto());
	}
	
}