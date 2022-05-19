package calculadoraDeProduto;
import java.util.ArrayList;
import java.util.List;

public class Principal {

public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(new Eletronico("Ventilador", 3, 320));
		produtos.add(new Eletronico("Computador", 2, 3999));
		produtos.add(new Movel("Mesa", 2, 270));
		produtos.add(new Produto("Caderno", 10, 10.50));
		produtos.add(new Movel("Cadeira", 2, 234.25));
		produtos.add(new Produto("Caneta", 15, 0.70));		
		
		Caixa cx = new Caixa();
		
		cx.calcularTotal(produtos);		

	}

}
