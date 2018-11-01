package test;

import javax.swing.JOptionPane;

public class test1 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("입력하세요.");
		System.out.println("input : " + input);
		int num = Integer.parseInt(input);
		System.out.println("num :" + num);
		
		String input2 = JOptionPane.showInputDialog("입력하세요.");
		System.out.println("input2 : " + input2);
		int num2 = Integer.parseInt(input2);
		System.out.println("num2 :" + num2);
		
		if (num > num2)
		System.out.println("1");
		else if (num <= num2)
		System.out.println("0");
		
		

	}

}
