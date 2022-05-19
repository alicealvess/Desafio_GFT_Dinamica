package lendoValorPar;

public class Principal {
	public static void main(String[] args) {
		validaNumerosPares(1222);
	}

	private static void validaNumerosPares(int valor) {
		int totalPares = 0;
		char[] caracteres = Integer.toString(valor).toCharArray();

		if (caracteres.length < 4) {
			System.out.println("Não é permitido valor menor que 1000");
		} else if (caracteres.length > 4) {
			System.out.println("Nâo é permitido valor maior que 9999");
		} else {

			for (char unidade : caracteres) {

				if (Character.getNumericValue(unidade) % 2 == 0) {
					totalPares++;
				}
			}

			System.out.println(totalPares);
		}
	}

}
