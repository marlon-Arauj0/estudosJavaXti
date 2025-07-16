public class LoopsFor{
	public static void main(String[] args){
	  String texto1= "";
	  for(int i=10; i>0; i--){
			  texto1 += i + ",";
		  }
	  System.out.println(texto1);
	  
	  System.out.println("--------------------------");
	  
	  String texto2= "";
	  for(int i=0; i<10; i++){
			  texto2 += i + ",";
		  }
	  System.out.println(texto2);
	  
	  System.out.println("--------------------------");
	  
    int tamanho = 5;
	  for (int x = 0; x<tamanho; x++){
	    for(int i = 0 ; i<tamanho; i++){
	      System.out.print("* ");
	    }
	    System.out.println();
	  }
	}
}

