package imovel;

public class Terreno extends Imovel {
    private String areaDeLocalizacao;

    public Terreno(int numeroInscricao, String endereco, float areaTotal,
        float valor, char localizacao, Beneficiario beneficiario, String areaDeLocalizacao) {
        super(numeroInscricao, endereco, areaTotal, valor, localizacao,
            beneficiario);
        this.areaDeLocalizacao = areaDeLocalizacao;
    }

    @Override
    public float calculaTaxa() {
        float taxa = super.calculaTaxa();
        if (areaDeLocalizacao == "preservacao ambiental") {
            taxa += taxa * 0.2;
        }
        if (areaDeLocalizacao == "area rural") {
            taxa -= taxa * 0.1;
        }
        return taxa;
    }

    public void setAreaDeLocalizacao(String areaDeLocalizacao) {
        this.areaDeLocalizacao = areaDeLocalizacao;
    }
    
    public String getAreaDeLocalizacao() {
        return this.areaDeLocalizacao;
    }
}