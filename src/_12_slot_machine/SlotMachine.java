package _12_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spinButton = new JButton();
	JLabel label1;
	int firstNum=0;
	int secondNum=0;
	int thirdNum=0;
	void run() {
		Random ran = new Random();
		for (int i = 0; i<3;i++) {
			JLabel label = new JLabel();
			int ranNum=ran.nextInt(2);
			if (i==0) {
				firstNum=ranNum;
			}
			if (i==1) {
				secondNum=ranNum;
			}
			if (i==2) {
				thirdNum=ranNum;
			}
			if (ranNum==0) {
				label1
			}
		}
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		spinButton.setText("SPIN");
		panel.add(spinButton);
		frame.add(panel);
		frame.pack();
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

}

