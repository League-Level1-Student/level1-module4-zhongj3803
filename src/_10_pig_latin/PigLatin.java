package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField textOriginal = new JTextField(20);
JButton translateButton = new JButton();
JTextField textTranslated = new JTextField(20);

void run() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	translateButton.setText("translate");
	translateButton.addActionListener(this);
	panel.add(textOriginal);
	panel.add(translateButton);
	panel.add(textTranslated);
	frame.add(panel);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	textTranslated.setText(PigLatinTranslator.translate(textOriginal.getText()));
}
}
