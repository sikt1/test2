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
		
		button=new JButton("버튼");
		contentpane.add(button,BorderLayout.NORTH);
		button.addActionListener(this);
		
		buttonEast = new JButton("동족");
		contentpane.add(buttonEast, BorderLayout.EAST);
		buttonEast.addActionListener(this);
		
		buttonSouth = new JButton("남족");
		contentpane.add(buttonSouth, BorderLayout.SOUTH);
		buttonSouth.addActionListener(this);
		
		buttonWest = new JButton("서족");
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
			System.out.println("북쪽 버튼이 클릭되었습니다.");
		}
		else if(src.equals(buttonSouth)){
			System.out.println("남쪽 버튼이 클릭되었습니다.");
		}
		System.out.println("입력된 텍스트 : " + input);
	}
}
