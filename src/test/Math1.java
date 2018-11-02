package test;

public class Math1 {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		long result = Math.round(Math.PI);
		System.out.println(result);

		double randomvalue = Math.random();
		System.out.println("randomvalue"+randomvalue);
		System.out.println("randomvalue*100"+randomvalue*100);
		System.out.println("(int)randomvalue*100"+(int)randomvalue*100);

	}

}
