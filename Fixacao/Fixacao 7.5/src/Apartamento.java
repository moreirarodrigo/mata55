package imovel;

public class Apartamento extends Imovel {
    float areaPrivativa;
    char padraoConstrutivo;
    
    public Apartamento(int numeroInscricao, String endereco, float areaTotal, float valor, char localizacao, Beneficiario beneficiario, float areaPrivativa, char padraoConstrutivo) {
        super(numeroInscricao, endereco, areaTotal, valor, localizacao,
            beneficiario);
        this.areaPrivativa = areaPrivativa;
        this.padraoConstrutivo = padraoConstrutivo;
    }

    @Override
    public float calculaTaxa() {
        float taxa = super.calculaTaxa();

        if (this.areaPrivativa >= 300) {
            taxa += 0.05f;
        }

        switch (this.padraoConstrutivo) {
            case 'A':
                taxa += 0.005f;
                break;
            case 'B':
                taxa += 0.002f;
                break;
            case 'C':
                taxa += 0.001f;
                break;
            default:
                break;
        }

        return taxa;
    }
}