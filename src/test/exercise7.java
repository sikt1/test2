package test;


import javax.swing.JOptionPane;

public class exercise7 {

	public static void main(String[] args) {
		exercise7 exr = new exercise7();
		exr.practice06();
	}
	public void practice04(){
		System.out.println("5���� ���� ������ �Է��Ͻʽÿ�.");
		int[] scoreArray = new int[5];
		for(int i=0; i<scoreArray.length; i++){
			scoreArray[i] = Integer.parseInt(JOptionPane.showInputDialog("�Է�"));

		}
		for(int j=0; j<scoreArray.length; j++){
			System.out.println((j+1)+"��° ����� ������"+scoreArray[j] + "�Դϴ�");
		}
		int maxsore=0;
		for(int k=0; k<scoreArray.length; k++){
			if( scoreArray[k]>maxsore  ){
				maxsore = scoreArray[k];
			}
		}
		System.out.println("�������������"+maxsore+"���Դϴ�.");
	}

	public void practice05(){
		System.out.println("�Է�.");
		int[] scoreArray = new int[5];
		for(int i=0; i<scoreArray.length; i++){
			scoreArray[i] = Integer.parseInt(JOptionPane.showInputDialog("�Է�"));

		}

		for(int n =scoreArray.length-1; n>=0; n--){


			System.out.println(scoreArray[n]);


		}


		public void practice06(){
			System.out.println("�Է�.");
			int[] scoreArray = new int[10];
			for(int i=0; i<scoreArray.length; i++){
				scoreArray[i] = Integer.parseInt(JOptionPane.showInputDialog("�Է�"));
				System.out.print(scoreArray[i]);

			}
			int k=0;
			k =  Integer.parseInt(JOptionPane.showInputDialog("�Է�"));
			System.out.println(k);

			System.out.println(scoreArray[k-1]);

			



		}



	}