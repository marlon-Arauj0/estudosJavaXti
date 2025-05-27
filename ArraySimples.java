import java.util.Arrays;

public class ArraySimples {
	public static void main(String[] args) {
	
		String[] paises = {"Brasil","Russia","Estados Unidos", "Canada"};
		System.out.println(Arrays.toString(paises));
		System.out.println(paises.length);
		
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		Double[] valoresdouble = {12.35, 365.58, 695.96};
		System.out.println(valoresdouble[1].doubleValue());
	}
}
