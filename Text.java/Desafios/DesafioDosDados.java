import java.util.Random;
import java.util.Scanner;

public class DesafioDosDados{
	public static void main(String[] args){	
	
	  int dadoUm = primeiro();
	  int dadoDois = segundo();
	  
		//qual o Palpite ?
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o seu primeiro palpite ?");
		int palpiteDadoUm = s.nextInt();
		System.out.println("Qual o seu segundo palpite ?");
		int palpiteDadoDois = s.nextInt();
		
		int palpiteSomatotia = palpiteDadoUm + palpiteDadoDois;
		System.out.println("Soma dos palpites: " + palpiteSomatotia);
		
		//qual o valor do dado ?
		
		System.out.println("Resultado do primeiro dado: " + dadoUm);
		System.out.println("Resultado do segundo dado: " + dadoDois);
		System.out.println("Soma dos dados: " + (dadoUm + dadoDois));
		
		//Palpite esta correto ?
		
		if (palpiteDadoUm == dadoUm){
		  System.out.println("Acertou o palpite do primeiro dado");
		} else {
		  System.out.println("Errou o palpite do primeiro dado");
		}
		
		if (palpiteDadoDois == dadoDois){
		  System.out.println("Acertou o palpite do segundo dado");
		} else {
		  System.out.println("Errou o palpite do segundo dado");
		}
		
		if (palpiteSomatotia == (dadoUm + dadoDois)){
		  System.out.println("Acertou o palpite da somatoria dos dados");
		} else {
		  System.out.println("Errou o palpite da somatoria dos dados");
		}
	}
	
	static Random r = new Random();
	
	private static int primeiro(){
		return r.nextInt(6) + 1;
	}
		
	private static int segundo(){
	  return r.nextInt(6) + 1;
	}
} 
