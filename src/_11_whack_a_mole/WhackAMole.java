package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button;
	int whackCount = 0;
	int whackMissed = 0;
	
	void run() {
		Random ran = new Random();
		int randomNumber = ran.nextInt(12);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawButtons(randomNumber);
		panel.setLayout(new GridLayout(3,4));
		frame.add(panel);
		frame.pack();
	}
	void drawButtons(int ranNum) {
		for (int i = 0; i<12;i++) {
			JButton button1 = new JButton();
			button1.addActionListener(this);
			if (i==ranNum) {
				button = button1;
				button1.setText("Mole!");
			}
			panel.add(button1);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			whackCount++;
		}
		else {
			whackMissed++;
			speak("missed");
		}
		frame.dispose();
		Random ran = new Random();
		int ranNum = ran.nextInt(12);
		drawButtons(ranNum);
		if (whackCount==10) {
			endGame(new Date(),10);
		}
		if (whackMissed==5) {
			JOptionPane.showMessageDialog(null,"You lost");
			endGame(new Date(),whackCount);
		}
	}
	 static void speak(String words) {
	        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
	            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
	                    + words + "');\"";
	            try {
	                Runtime.getRuntime().exec( cmd ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        } else {
	            try {
	                Runtime.getRuntime().exec( "say " + words ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        }
	    }
	 private void endGame(Date timeAtStart, int molesWhacked) { 
		    Date timeAtEnd = new Date();
		    JOptionPane.showMessageDialog(null, "Your whack rate is "
		            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		                  + " moles per second.");
		}

}
