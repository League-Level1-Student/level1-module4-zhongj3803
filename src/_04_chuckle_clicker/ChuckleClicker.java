package _04_chuckle_clicker;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton jokeButton = new JButton();
	JButton punchlineButton = new JButton();

	public static void main(String[] args) {
		ChuckleClicker chuckleclicker = new ChuckleClicker();
		chuckleclicker.makeButtons();
	}

	void makeButtons() {
		jokeButton.setText("joke");
		punchlineButton.setText("punchline");
		jokeButton.addMouseListener(this);
		punchlineButton.addMouseListener(this);
		frame.show();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		panel.add(jokeButton);
		panel.add(punchlineButton);
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jokeButton) {
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		} else {
			JOptionPane.showMessageDialog(null, "To get to the other side");
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
