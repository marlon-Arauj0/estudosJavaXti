import java.util.Scanner;
public class Entrada {

  public static void main (String[] args) {
    
    //System.out.println(args[0]);
    
    Scanner s = new Scanner(System.in);
    System.out.println("Qual seu nome? ");
    String nome = s.nextLine();
    System.out.println("Bem Vindo: " + nome);
  }
}
