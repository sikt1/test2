package test;

public class test3 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=99; i++) {

			if(i%2==0) {
				sum-=i;
			}
			else {
				sum+=i;
			}

		}



		System.out.println(sum);




	}

}


