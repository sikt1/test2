package test;

import javax.swing.JOptionPane;

public class arr {

	public static void main(String[] args) {

		int count=0; 
		int inputnum = Integer.parseInt(JOptionPane.showInputDialog("Ƚ�����Է��ϼ���"));
		
		int arr[]=new int[inputnum];
		for(int i = 0; i<inputnum; i++){
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("�����Է��ϼ���:"));
		}
		
		for(int i=0; i<arr.length;i++){
			if(arr[i]%2==0){
				count ++;
			}
		}
		System.out.println("¦���� ������" + count + "�Դϴ�.");
	}

}
