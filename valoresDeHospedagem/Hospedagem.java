package valoresDeHospedagem;

public class Hospedagem {
	
private double valor;
	
	public void printValor() {
		System.out.println(getValor());
	}
	
	public Hospedagem(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
