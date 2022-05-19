package valoresDeHospedagem;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospedagem hosp = new Hospedagem(10);
		HospedagemVip hospV = new HospedagemVip(10);
		
		hosp.printValor();
		hospV.printValor();		
		
	}


}
