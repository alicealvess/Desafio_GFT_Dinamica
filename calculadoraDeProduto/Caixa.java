package calculadoraDeProduto;
import java.util.List;

public class Caixa {

		public void calcularTotal(List<Produto> produtos) {
			String impressao;
			for (int i = 0; i < produtos.size(); i++) {
				impressao = produtos.get(i).getNome() +'|'+
					    	produtos.get(i).getQuantidade() +'|'+
					    	produtos.get(i).getValor() +'|'+ 
						    produtos.get(i).calcularValorFinal();
				
				System.out.println(impressao);
			}
		}
}

