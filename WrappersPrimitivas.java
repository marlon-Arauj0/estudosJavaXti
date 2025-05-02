public class WrappersPrimitivas {
  public static void main(String[] args){
  
    Integer idade = 20;
    Double preco = 12.36; //String
    double d = preco.doubleValue(); //Convertendo valor Wrapper para outro tipo
    int i = preco.intValue(); //Convertendo valor Wrapper para outro tipo
    
    Boolean casado = true;
    
    //CONVERSAO ESTATICA
    double d1 = Double.parseDouble("123.456");
    int i1 = Integer.parseInt("123");//converte String em um Valor inteiro
    float f1 = Float.parseFloat("3.14F");
    
    int i2 = Integer.valueOf("101011",2);
    System.out.println(i2);
    
  }
}
