package comparacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto(1, "Arroz", 3.0);
		Produto p2 = new Produto(1, "Bala", 1.0);
		Produto p3 = new Produto(1, "Feijão", 6.0);
		Produto p4 = new Produto(1, "Lasanha", 5.0);
		Produto p5 = new Produto(1, "Toamate", 4.0);

		// Set<Produto> produtos = new TreeSet<>();
		//Set<Produto> produtos = new TreeSet<Produto>(new DescricaoComparator());
		List<Produto> produtos = new ArrayList<>();

		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);

		Collections.sort(produtos, new DescricaoComparator());

		for (Produto produto : produtos) {
			System.out.println(produto);
		}

	}
}
