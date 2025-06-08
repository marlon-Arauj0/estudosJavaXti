public class FluxoIfElse{
	public static void main(String[] args){
	  int numero = 10;
	
	  if ((numero % 2) == 0) {
		  System.out.println("Par");
	  } else {
		  System.out.println("Impar");
		}
		System.out.println("------------------------");
		
		int idade = 61;
		
		if (idade <= 11) {
		    System.out.println("Crianca");
		} else if (idade > 11 && idade <= 18) {
		    System.out.println("Adolecente");
		} else if (idade > 18 && idade <= 60) {
		    System.out.println("Adulto");
		} else {
		    System.out.println("Melhor idade");
		}
		
		System.out.println("------------------------");
		
		double nota = 6.7;
		
		if (nota >= 7) {
		  System.out.println("Aprovado");
		} else {
		  System.out.println("Reprovado");
		  if (nota >= 6) {
		    System.out.println("mais pode fazer a recuperação");
		  }
		}
	}
}
