package test;

public class Tobinary {

	public int[] tobinary(int input){

		int [] result= new int[31];
		int i=0;
		while(input>0){
			result[i] = input%2;
			i=i+1;
			input /=2;
		}
		return result;
	}

}
