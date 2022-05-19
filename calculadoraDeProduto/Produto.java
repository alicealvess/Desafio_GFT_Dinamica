package calculadoraDeProduto;

public class Produto {

	private String nome;
	private double valor;
	private int quantidade;
	private int percentual;
	
	public Produto(String nome, int qtd, double valor) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = qtd;
	}
	
	public double calcularValorFinal() {
		return getValor() * getQuantidade() + acressimoPercentual(getPercentual());		
	}
	
	public double acressimoPercentual(int percent) {
		return percent * ((getValor() * getQuantidade()) / 100); 
	}

	public int getPercentual() {
		return percentual;
	}

	public void setPercentual(int percentual) {
		this.percentual = percentual;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
	

}
