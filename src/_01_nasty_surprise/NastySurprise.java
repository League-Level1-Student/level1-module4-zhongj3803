package _01_nasty_surprise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements MouseListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton button1 = new JButton();

public void run() {
	frame.setVisible(true);
	frame.add(panel);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	button.setText("trick");
	button1.setText("treat");
	button.addMouseListener(this);
	button1.addMouseListener(this);
	panel.add(button);
	panel.add(button1);
	frame.add(panel);
	frame.pack();
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed == button) {
		showPictureFromTheInternet("https://i.pinimg.com/originals/1b/e8/85/1be885e4f3e2aa106fa28c27ec6ded73.jpg");
	}
	if (buttonPressed == button1) {
		showPictureFromTheInternet("https://www.alimentarium.org/en/system/files/thumbnails/image/AL027-01_pomme_de_terre_0.jpg");
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
