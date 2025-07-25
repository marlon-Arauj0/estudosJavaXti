import java.util.ArrayList;
import java.util.Scanner;

public class FluxoWhileDoWhile {
	public static void main(String[] args) {
		ArrayList<String> produtos = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus produtos: Para sair, escreva Fim");

		String produto = s.nextLine();

		while (!produto.equalsIgnoreCase("Fim")) {
			produtos.add(produto);
			produto = s.nextLine();
		}

		System.out.println("Produtos listados:");
		System.out.println(produtos);
	}
}