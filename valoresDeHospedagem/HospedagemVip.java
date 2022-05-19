package valoresDeHospedagem;

public class HospedagemVip extends Hospedagem {

private static double valorAdicional = 10;
	
	public HospedagemVip(double valor) {
		super(valor + valorAdicional);
	}
}
