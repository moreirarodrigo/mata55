import java.time.Year;

public class Jogador {
    private String nome;
    private String posicao;
    private int nascimento;
    private String nacionalidade;
    private double altura;
    private double peso;
    private int idade;
    
    public Jogador(String nome, String posicao,int nascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.nascimento = nascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        this.idade = Year.now().getValue() - this.nascimento;
    }

    public void getJogador()
    {
        System.out.println("Nome: "+this.nome+
        "\nPosicao: "+this.posicao+
        "\nNacionalidade: "+this.nacionalidade+
        "\nAltura: "+this.altura+
        "\nPeso: "+this.peso);
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void getAposentar(){
    	if(this.posicao.equals("defesa") && this.idade < 40) {
    		System.out.println("Se aposenta em: "+(40 - this.idade)+" anos");
    	}else if(this.posicao.equals("meio-campo") && this.idade < 38) {
        	System.out.println("Se aposenta em: "+(38 - this.idade)+" anos");
    	}else if(this.posicao.equals("atacante") && this.idade < 35) {
        	System.out.println("Se aposenta em: "+(35 - this.idade)+" anos");
    	}else {
    		System.out.println("Ja se aposentou");
    	}
    }
    
    public static void main(String[] args) {
    	Jogador jogador = new Jogador("Romario", "defesa", 1990, "Brasileiro", 1.80, 80);
    	jogador.getJogador();
    	System.out.println(jogador.getIdade()+" anos");
    	jogador.getAposentar();
    }
}
