import java.util.ArrayList;

public class ArrayListJava{
	public static void main(String[] args){
		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		cores.add(0, "Preto");
		cores.add("Amarelo");
		cores.add("Verde");
		cores.add("Cinza");
		
		System.out.println(cores.toString());
		System.out.println(cores.size());
		System.out.println(cores.get(2));
		System.out.println(cores.indexOf("Branco"));
	}
}
