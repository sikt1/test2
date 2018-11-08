package test.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Makewindow implements ActionListener{

	JFrame frame;
	JButton button;
	JButton buttonEast;
	JButton buttonSouth;
	JButton buttonWest;
	JTextField inputtext;
	public Makewindow(String title){
		frame=new JFrame(title);
		frame.setBounds(100,100,1000,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		Container contentpane = frame.getContentPane();
		contentpane.setLayout(new BorderLayout());
		
		button=new JButton("��ư");
		contentpane.add(button,BorderLayout.NORTH);
		button.addActionListener(this);
		
		buttonEast = new JButton("����");
		contentpane.add(buttonEast, BorderLayout.EAST);
		buttonEast.addActionListener(this);
		
		buttonSouth = new JButton("����");
		contentpane.add(buttonSouth, BorderLayout.SOUTH);
		buttonSouth.addActionListener(this);
		
		buttonWest = new JButton("����");
		contentpane.add(buttonWest, BorderLayout.WEST);
		buttonWest.addActionListener(this);
		
		inputtext = new JTextField();
		contentpane.add(inputtext, BorderLayout.CENTER);
		
		
		frame.validate();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = inputtext.getText();
		
		Object src = e.getSource();
		if (src.equals(button)){
			System.out.println("���� ��ư�� Ŭ���Ǿ����ϴ�.");
		}
		else if(src.equals(buttonSouth)){
			System.out.println("���� ��ư�� Ŭ���Ǿ����ϴ�.");
		}
		System.out.println("�Էµ� �ؽ�Ʈ : " + input);
	}
}
