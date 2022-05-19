package calculadoraDeProduto;

public class Movel  extends Produto {
	
	public Movel(String nome, int qtd, double valor) {
		super(nome, qtd, valor);
	}

	@Override
	public double calcularValorFinal() {

		if (getValor() < 10) {
			setPercentual(11);
		} else 
		if (getValor() > 10) {
			setPercentual(5);
		}

		return super.calcularValorFinal();
	}

}
