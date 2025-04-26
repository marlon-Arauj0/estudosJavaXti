/**
 *Conceitos de variavel
 *@author Marlon Silva Araujo
*/ 
public class TiposPrimitivos {
  public static void main(String[] args){
  
    int idade = 20;
    double preco = 654.32;
    char sexo = 'M'; //apenas 1 caracter em aspas simples ''
    boolean casado = false;// 1 bit
    
    //unicode | IEEE 754
    //tamanho em bits e byte
    //Para Binario sempre usar prefixo 0b
    byte b = 127;//8 bits; 1 byte 
    short s = 32767;//16 bits; 2 byte
    int i = 2147483646;//32 bits; 4 byte
    long l = 9223372036854775807L;//64 bits; 8 byte 
    float f = 3402F;//IEEE 754 | 32 bits; 4 byte
    double d = 1797D;//IEEE 754 | 64 bits; 8 byte
    
    i = s;//Cast Implícito
    System.out.println(i);
    System.out.println(s);
        
    i = (int) l;//Cast Explícito ("assumo a perda de valores")
    System.out.println(i);
    System.out.println(l);   
  }
}
