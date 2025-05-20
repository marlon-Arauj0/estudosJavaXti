public class OperadorLogico {

	public static void main (String[] args) {
		int x = 6;
		
		//AND
		System.out.println((x >= 5) && (x <= 10));
		
		//OR
		System.out.println((x >= 1) || (x <= 5));
		
		//NOT
		System.out.println(!(x >= 5));
		
	}

}
