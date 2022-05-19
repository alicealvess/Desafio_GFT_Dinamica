package calculadoraDeProduto;

public class Eletronico extends Produto{
	
	public Eletronico(String nome, int qtd, double valor) {
		super(nome, qtd, valor);
	}

	@Override
	public double calcularValorFinal() {
		// TODO Auto-generated method stub
		setPercentual(15);
		return super.calcularValorFinal();
	}
}
