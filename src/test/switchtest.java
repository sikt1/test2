package test;

import javax.swing.JOptionPane;

public class switchtest {

	public static void main(String[] args) {
		
		int jumsu;
		jumsu = Integer.parseInt(JOptionPane.showInputDialog("�����Է� : "));
		char hakjum;
		
		switch(jumsu){
		
		case 90 :
			hakjum = 'A';
			break;
			
		case 80 :
			hakjum = 'B';break;
			
		case 70 :
			hakjum = 'C';;break;
			
		case 60 :
			hakjum = 'D';break;
		default :
		hakjum = 'F';
		
			
		}
		System.out.println("������" +hakjum+ "�Դϴ�.");
	}

}
