package Bebida;

public class BebidaNaoAlcoolica extends Bebida {
	private String sabor;
	private boolean comLactose;

	public BebidaNaoAlcoolica(String nome,String tipo, String embalagem, float litros, float preco, String sabor, boolean comLactose) {
		super(nome, tipo, embalagem, litros, preco);
		this.sabor = sabor;
		this.comLactose = comLactose;
	}

	public BebidaNaoAlcoolica(String nome,String tipo, String embalagem, float litros, float preco, String sabor) {
		super(nome, tipo, embalagem, litros, preco);
		this.sabor = sabor;
		this.comLactose = false;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getSabor() {
		return this.sabor;
	}

	public void setComLactose(boolean comLactose) {
		this.comLactose = comLactose;
	}

	public boolean getComLactose() {
		return this.comLactose;
	}

	@Override
	public float precoFinal() {
		if(this.comLactose == true) {
			return super.precoFinal() + (super.precoFinal() * 0.05f);
		}

		return super.precoFinal();
	}
}