public class ArrayMultidimensional{

	public static void main(String [] args){
		String [] uma = {"marlon", "vitoria", "vera", "wellinton"};
		System.out.println(uma[2]);
		
		String [][] duas = {
			{"Marlon", "M", "SP"},
			{"Vitoria", "F", "BA"},
			{"Vera","F", "RJ"},
			{"wellinton","M", "MG"}
		};
		System.out.println(duas.length); //tamanho do Array
		System.out.println(duas[0].length); //tamanho do Array intern
		System.out.println("--------------------");
		System.out.println(duas[0][1]);
		System.out.println(duas[1][2]);
	}
}
