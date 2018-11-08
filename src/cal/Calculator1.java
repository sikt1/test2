package cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator1 implements ActionListener {

	JTextField inputnumber01;
	JTextField inputnumber02;
	JLabel result;
	JButton btnplus;
	JButton btnminus;
	JButton btnmul;
	JButton btnDiv;

	public Calculator1(){

		JFrame frame = new JFrame("계산기");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200,200,500,500);
		frame.setVisible(true);
		init(frame);

	}
	public void init(JFrame root){
		JPanel parent = new JPanel();
		parent.setBackground(Color.yellow);
		parent.setLayout(new GridLayout(4, 1));
		root.getContentPane().add(parent);

		inputnumber01= new JTextField(5);
		inputnumber01.setHorizontalAlignment(JTextField.CENTER);
		inputnumber01.setFont(new Font(null,Font.BOLD,20));
		JPanel operandPanel = new JPanel();
		operandPanel.setBackground(Color.RED);
		inputnumber02 = new JTextField(5);
		inputnumber02.setHorizontalAlignment(JTextField.CENTER);
		inputnumber02.setFont(new Font(null,Font.BOLD,20));
			
		result = new JLabel("결과 : ");
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setFont(new Font(null,Font.BOLD,20));
		
		operandline(operandPanel);
		
		parent.add(inputnumber01);
		parent.add(inputnumber02);
		parent.add(operandPanel);
		parent.add(result);
		root.validate();
	}
	public void operandline(JPanel parent){
		
		parent.setLayout(new GridLayout(1,4));
		
		btnplus = new JButton("+");
		btnplus.setFont(new Font(null,Font.BOLD,20));
		btnplus.addActionListener(this);
		
		btnminus = new JButton("-");
		btnminus.setFont(new Font(null,Font.BOLD,20));
		btnminus.addActionListener(this);
		
		btnmul= new JButton("*");
		btnmul.setFont(new Font(null,Font.BOLD,20));
		btnmul.addActionListener(this);
		
		btnDiv = new JButton("/");
		btnDiv.setFont(new Font(null,Font.BOLD,20));
		btnDiv.addActionListener(this);
		
		parent.add(btnplus);
		parent.add(btnminus);
		parent.add(btnmul);
		parent.add(btnDiv);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	String input1= inputnumber01.getText();
	String input2= inputnumber02.getText();
	
	Object src = arg0.getSource();
	
	if (src.equals(btnplus)){
		
		int plus = Integer.parseInt(input1) + Integer.parseInt(input2);
		
		System.out.println("값은 : " + plus);
		result.setText("값은 : " + plus);
	}
	else if (src.equals(btnminus)){
		int minus = Integer.parseInt(input1) - Integer.parseInt(input2);
		System.out.println("값은 : " + minus);
		result.setText("값은 : " + minus);
	}
	else if (src.equals(btnmul)){
		int mul = Integer.parseInt(input1) * Integer.parseInt(input2);
		System.out.println("값은 : " + mul);
		result.setText("값은 : " + mul);
	}
	else if (src.equals(btnDiv)){
		double Div = Integer.parseInt(input1) / Integer.parseInt(input2);
		System.out.println("값은 : " + Div);
		result.setText("값은 : " + Div);
	}
	
		
	}
}