public class AutomovelLuxo extends Automovel {
    private boolean cameraDeRe;
    private boolean airbag;
    private static final byte NUMEROMAXIDEPRESTACOES = 36;

    public AutomovelLuxo(String m, String c, byte comb, boolean cr, boolean ab) {
        super(m, c, comb);
        this.cameraDeRe = cr;
        this.airbag = ab;
    }

    public AutomovelLuxo(String m, String c, byte comb) {
        super(m, c, comb);
        this.cameraDeRe = true;
        this.airbag = true;
    }

    @Override
    public float quantoCusta() {
        float preco = super.quantoCusta();

        if(this.airbag == true) {
            preco += 1280f;
        }

        if(this.cameraDeRe == true) {
            preco += 1650f;
        }

        return preco;
    }

    @Override
    public String toString() {
        String resultado = super.toString();

        if(this.cameraDeRe == true) {
            resultado += "Com câmera de ré\n";
        }

        if(this.airbag == true) {
            resultado += "Com airbag\n";
        }

        return resultado;
    }
}
