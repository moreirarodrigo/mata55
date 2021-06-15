package imovel;

public class Imovel {
    private int numeroInscricao;
    private String endereco;
    private float areaTotal;
    private float valor;
    private char localizacao;
    private Beneficiario beneficiario;

    public Imovel(int numeroInscricao, String endereco, float areaTotal,
        float valor, char localizacao, Beneficiario beneficiario) {
        this.numeroInscricao = numeroInscricao;
        this.endereco = endereco;
        this.areaTotal = areaTotal;
        this.valor = valor;
        this.localizacao = localizacao;
        this.beneficiario = beneficiario;
    }

    public float calculaTaxa() {
        switch (this.localizacao) {
            case 'A':
                return (this.valor * (0.002f));
            case 'B':
                return (this.valor * (0.0015f));
            case 'C':
                return (this.valor * (0.001f));
            case 'D':
                return (this.valor * (0.005f));
            default:
                return 0;
        }
    }
    
    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public char getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(char localizacao) {
        this.localizacao = localizacao;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }
}