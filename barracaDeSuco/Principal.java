package barracaDeSuco;

public class Principal {
	

	private static double valorLitro = 10;
	
	public static void main(String[] args) {
		valorTotalSuco(2, 'L');
	}
	
	public static void valorTotalSuco(int litros, char suco) {

		if ((litros <=2) && (suco == 'L')) {
			System.out.println(valorPago(3 * litros));	
		}
		
		if ((litros >=5) && (suco == 'L')) {
			System.out.println(valorPago(5 * litros));	
		}
 
		if ((litros <=2) && (suco == 'T')) {
			System.out.println(valorPago(4 * litros));	
		}		

		if ((litros >=5) && (suco == 'T')) {
			System.out.println(valorPago(6 * litros));	
		}		
		
		
	}
	
	private static double valorPago(int percentual) {
		return valorLitro - (valorLitro * percentual / 100);
	}
}
