import java.util.Scanner;

public class CalculoImc {

  public static void main (String[] args) {
  	
  	Scanner s = new Scanner(System.in);
  	
  	System.out.println("Informe seu peso");
  	double peso = s.nextDouble();
  	
  	System.out.println("informe sua altura em METROS");
  	double altura = s.nextDouble();
  	
  	double imc = peso / (altura * altura);
  	System.out.println(imc);
  	
  	if (imc < 20){
  		System.out.println("Abaixo do peso");  	
  	} else if (imc <= 25){
  		System.out.println("Peso ideal");
  	} else if (imc <= 30){
  		System.out.println("Sobrepeso");
  	} else if (imc <= 35){
  		System.out.println("Obesidade Moderada");
  	} else if (imc <= 40){
  		System.out.println("Obesidade Severa");
  	} else if (imc < 50){
  		System.out.println("Obesidade Mórbida");
  	} else {
  		System.out.println("Super-Obesidade");
  	}
  }
}
