package test;

import javax.swing.JOptionPane;

public class hakjum2 {

	public static void main(String[] args) {

		int jumsu;
		char hakjum;
		jumsu = Integer.parseInt(JOptionPane.showInputDialog("�����Է� : "));
		
		if(jumsu >= 90){
			hakjum = 'A';
			}
		else if (jumsu >= 80){
			hakjum = 'B';
			}
		else if (jumsu >= 70){
			hakjum = 'C';
			}
		else if (jumsu >= 80){
			hakjum = 'D';
			}

		else{
		hakjum = 'f';
	}System.out.println("����� ������ "+hakjum +"�Դϴ�" );
	}

}
