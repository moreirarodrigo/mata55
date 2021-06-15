package imovel;

public class Casa extends Imovel {
    private char padraoConstrutivo;
    
    public Casa(int numeroInscricao, String endereco, float areaTotal,
        float valor, char localizacao, Beneficiario beneficiario, char padraoConstrutivo) {
        super(numeroInscricao, endereco, areaTotal, valor, localizacao,
            beneficiario);
        this.padraoConstrutivo = padraoConstrutivo;
    }

    @Override
    public float calculaTaxa() {
        float taxa = super.calculaTaxa();
        if (super.getAreaTotal() >= 400) {
            taxa += taxa * 0.005;
        }
        if (this.getPadraoConstrutivo() == 'A') {
            taxa += taxa * 0.0015;
        }
        return taxa;
    }

    public char getPadraoConstrutivo() {
        return this.padraoConstrutivo;
    }

    public void setPadraoConstrutivo(char padraoConstrutivo) {
        this.padraoConstrutivo = padraoConstrutivo;
    }
}