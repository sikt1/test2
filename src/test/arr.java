package test;

import javax.swing.JOptionPane;

public class arr {

	public static void main(String[] args) {

		int count=0; 
		int inputnum = Integer.parseInt(JOptionPane.showInputDialog("횟수를입력하세요"));
		
		int arr[]=new int[inputnum];
		for(int i = 0; i<inputnum; i++){
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("값을입력하세요:"));
		}
		
		for(int i=0; i<arr.length;i++){
			if(arr[i]%2==0){
				count ++;
			}
		}
		System.out.println("짝수의 갯수는" + count + "입니다.");
	}

}
