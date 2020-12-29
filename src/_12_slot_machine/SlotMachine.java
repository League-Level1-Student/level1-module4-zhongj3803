package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton spinButton = new JButton();
	JLabel label1;
	int firstNum = 0;
	int secondNum = 0;
	int thirdNum = 0;
	
	void run() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		spinButton.setText("SPIN");
		spinButton.addActionListener(this);
		Random ran = new Random();
		for (int i = 0; i < 3; i++) {
			JLabel label = new JLabel();
			int ranNum = ran.nextInt(2);
			if (i == 0) {
				firstNum = ranNum;
			}
			if (i == 1) {
				secondNum = ranNum;
			}
			if (i == 2) {
				thirdNum = ranNum;
			}
			if (ranNum == 0) {
				try {
					label = createLabelImage("cherry.jpg");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (ranNum == 1) {
				try {
					label = createLabelImage("lime.jpg");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (ranNum == 2) {
				try {
					label = createLabelImage("orange.jpg");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			panel.add(label);
		}
		panel.add(spinButton);
		frame.add(panel);
		frame.pack();
		if (firstNum == secondNum && secondNum == thirdNum) {
			JOptionPane.showMessageDialog(null, "WIN!");
		}
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();
		run();

	}


}
