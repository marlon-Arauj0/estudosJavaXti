import java.util.Scanner;

public class Fibonacci {

    public static void main (String[] args){
        int primeiroValor = 0;
        int segundoValor = 1;

        while (segundoValor < 2585){
            System.out.println(segundoValor);
            segundoValor = segundoValor + primeiroValor;
            primeiroValor = segundoValor - primeiroValor;
        }
    }

}
