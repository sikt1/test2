package test;

public class test4 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=20; i++) {
			for(int j=1; j<20; j++) {

			i+=j;	
			
			sum+=i;
			}
			System.out.println(sum);

		}
		
		

	}

}
