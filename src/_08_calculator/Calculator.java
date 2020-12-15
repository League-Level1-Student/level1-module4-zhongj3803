package _08_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton add = new JButton();
JButton subtract = new JButton();
JButton multiply =  new JButton();
JButton divide = new JButton();
JTextField firstNumber = new JTextField();
JTextField secondNumber = new JTextField();
JLabel label = new JLabel();
void run() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add.setText("add");
	subtract.setText("subtract");
	multiply.setText("multiply");
	divide.setText("divide");
	add.addMouseListener(this);
	subtract.addMouseListener(this);
	multiply.addMouseListener(this);
	divide.addMouseListener(this);
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	panel.add(firstNumber);
	panel.add(secondNumber);
	panel.add(label);
	frame.add(panel);
	frame.pack();
	
}

void add() {
	int firstNumNum = Integer.parseInt(firstNumber.getText());
	int secondNumNum = Integer.parseInt(secondNumber.getText());
	label.setText(""+(firstNumNum+secondNumNum));
}
void subtract() {
	
}
void multiply() {
	
}
void divide() {
	
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==add) {
		add();
	}
	if (e.getSource()==subtract) {
		subtract();
	}
	if (e.getSource()==multiply) {
		multiply();
	}
	if (e.getSource()==divide) {
		divide();
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
