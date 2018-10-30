package test;

import javax.swing.JOptionPane;

public class excersise1 {

	public static void main(String[] args) {
		excersise1 exr = new excersise1();
		exr.practice06();
	}

	public void practice06(){
		System.out.println("입력.");

		int k=0;
		k =  Integer.parseInt(JOptionPane.showInputDialog("입력"));
		System.out.println(k);



		int[] scoreArray = new int[k];
		for(int i=0; i<scoreArray.length; i++){
			scoreArray[i] = Integer.parseInt(JOptionPane.showInputDialog("입력"));
			System.out.print(scoreArray[i]);

		}
		System.out.println();
		System.out.println("입력");

		int n=0;
		n =  Integer.parseInt(JOptionPane.showInputDialog("입력"));
		System.out.println(n);



		int[] scoreArray1 = new int[n];
		for(int j=0; j<scoreArray1.length; j++){
			scoreArray1[j] = Integer.parseInt(JOptionPane.showInputDialog("입력"));

			System.out.print(scoreArray1[j]);


		}
		System.out.println();

		int m=k;
		System.out.println(scoreArray[m-1]);

		int a=n;
		System.out.println(scoreArray1[a-1]);
		
	/*	int count =0;
		for(m=0; m<k; m++){
			for(a=0; a<n; a++) {
			if(scoreArray[m]==scoreArray1[n-1]){
				count ++;
				
			}
			}
		}
		System.out.println("같은수는" + count + "개 입니다."); */
		
		
	/*	for( m=scoreArray1[0]; m<=n; m++) {
			for(int v=scoreArray[0]; v<=k; v++) {
				
				if (m==v) {
					
					System.out.print( "1");
					
				}
				else 
					
				System.out.print("0");

			}  
			
			

		}	*/
		
		
		
		

	}
}



