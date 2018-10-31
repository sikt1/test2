package test;

public class main {

	public static void main(String[] args) {
		Tobinary bin = new Tobinary();
		int[] result = bin.tobinary(10);

		boolean start = false;
		for(int i = result.length-1; i>=0; i--){
			if(start==false && result[i]>0){
				start = true;
			}
			if(start){
				System.out.print(result[i]);
			}
		}
	}

}
