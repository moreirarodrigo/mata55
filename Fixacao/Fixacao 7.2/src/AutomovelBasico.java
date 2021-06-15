public class AutomovelBasico extends Automovel {
    private boolean retrovisorDoLadoDoPassageiro;
    private boolean limpadorDoVidroTraseiro;
    private boolean radioAMFM;

    public AutomovelBasico(String m, String c, byte comb, boolean r, boolean l, boolean af) {
        super(m, c, comb);
        this.retrovisorDoLadoDoPassageiro = r;
        this.limpadorDoVidroTraseiro = l;
        this.radioAMFM = af;
    }

    public AutomovelBasico(String m, String c, byte comb) {
        super(m, c, comb);
        this.retrovisorDoLadoDoPassageiro = true;
        this.limpadorDoVidroTraseiro = true;
        this.radioAMFM = true;
    }

    @Override
    public float quantoCusta() {
        float preco = super.quantoCusta();

        if(this.retrovisorDoLadoDoPassageiro == true) {
            preco += 280f;
        }

        if(this.limpadorDoVidroTraseiro == true) {
            preco += 650f;
        }

        if(this.radioAMFM == true) {
            preco += 190f;
        }

        return preco;
    }

    @Override
    public String toString() {
        String resultado = super.toString();

        if(this.retrovisorDoLadoDoPassageiro == true) {
            resultado += "Com retrovisor do lado direito\n";
        }

        if(this.limpadorDoVidroTraseiro == true) {
            resultado += "Com limpador traseiro\n";
        }

        if(this.radioAMFM == true) {
            resultado += "Com radio\n";
        }

        return resultado;
    }
}