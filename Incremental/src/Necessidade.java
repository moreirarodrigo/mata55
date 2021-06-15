package pessoa;

public class Necessidade {
    private Beneficiario beneficiario;
    private String tipo_necessidade;
    private String descricao_necessidade;
    private int quantidade;

    Necessidade(Beneficiario beneficiario, String tipo_necessidade, String descricao_necessidade, int quantidade) {
        this.beneficiario = beneficiario;
        this.tipo_necessidade = tipo_necessidade;
        this.descricao_necessidade = descricao_necessidade;
        this.quantidade = quantidade;
    }

    // Setters
    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setTipo(String tipo_necessidade) {
        this.tipo_necessidade = tipo_necessidade;
    }

    public void setDescricao(String descricao_necessidade) {
        this.descricao_necessidade = descricao_necessidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Getters
    public Beneficiario getBenefeciario() {
        return this.beneficiario;
    }

    public String getTipo() {
        return this.tipo_necessidade;
    }

    public String getDescricao() {
        return this.descricao_necessidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
