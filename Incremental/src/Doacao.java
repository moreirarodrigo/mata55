package pessoa;

public class Doacao {
    private Doador doador;
    private String tipo_doacao;
    private String descricao;
    private String estado_doacao;
    private int quantidade;
    private boolean pode_ser_entregue;
    static private int gerador_protocolo = 12345;
    private int protocolo;

    public Doacao(Doador doador, String tipo, String descricao, String estado, int quantidade, boolean pode_ser_entregue) {
        this.doador = doador;
        this.tipo_doacao = tipo;
        this.descricao = descricao;
        this.estado_doacao = estado;
        this.quantidade = quantidade;
        this.pode_ser_entregue = pode_ser_entregue;
        gerador_protocolo += 127;
        this.protocolo = gerador_protocolo;
    }

    // Setters
    void setDoador(Doador doador) {
        this.doador = doador;
    }

    void setTipo(String tipo) {
        this.tipo_doacao = tipo;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    void setEstado(String estado) {
        this.estado_doacao = estado;
    }

    void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    void setEntrega(boolean entrega) {
        this.pode_ser_entregue = entrega;
    }

    void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

    // Getters
    Doador getDoador() {
        return this.doador;
    }

    String getTipo() {
        return this.tipo_doacao;
    }

    String getDescricao() {
        return this.descricao;
    }

    String getEstado() {
        return this.estado_doacao;
    }

    int getQuantidade() {
        return this.quantidade;
    }

    boolean getEntrega() {
        return this.pode_ser_entregue;
    }

    int getProtocolo() {
        return this.protocolo;
    }

    // Métodos
    void tamanhoDoacao() {
        if (this.quantidade < 20) {
            System.out.println("pequena");
        } else if (this.quantidade >= 20 && this.quantidade <= 50) {
            System.out.println("média");
        } else {
            System.out.println("grande");
        }
    }
}
