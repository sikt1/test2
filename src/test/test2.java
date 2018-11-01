package test;

import javax.swing.JOptionPane;

public class test2 {

	public static void main(String[] args) {

		for(int i=0; i<100; i++){

			String input = JOptionPane.showInputDialog("입력하세요.");
			System.out.println("input : " + input);
			int num = Integer.parseInt(input);
			

			if (num==0)break;
			else if (num>0);
			
			System.out.println(num);

		}
		
	}

}


