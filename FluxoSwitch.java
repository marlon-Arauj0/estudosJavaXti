public class FluxoSwitch {
	public static void main(String[] args){
	
	char sexo = 'M';
	
	switch(sexo) {
		case 'M' :
			System.out.println("Macho");
			break;
		case 'F' :
			System.out.println("Femea");
			break;
		default:
			System.out.println("Outros");
		}
		
	System.out.println("--------------------");
	
	String tecnologia = "cobol";
	
	switch(tecnologia) {
	  case "java":
	  case "cobol":
	  case "python":
	    System.out.println("Linguagem de Programação");
	    break;
	  case "mariadb":
	  case "oracle":
	  case "mysql":
	    System.out.println("Banco de Dados");
	    break;
	  default:
	    System.out.println("Tecnologia desconhecida");
	  }
	}
}
