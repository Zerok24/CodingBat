package solutions;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class image  {
	
	public image() {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		JPanel panel = new JPanel();
		BufferedImage img = null;
		try {
			img = ImageIO.read(this.getClass().getResource("download.JPG"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ImageIcon icon =  new ImageIcon(img);
		JLabel label = new JLabel();
		
		label.setPreferredSize(new Dimension(600,600));
		label.setIcon(icon);
		//panel.setLayout(new BorderLayout());
		
		frame.getContentPane().add(label, BorderLayout.CENTER);
		
		frame.setVisible(true);
		frame.pack();
	}
	
	public static void main(String[] args) {
		new image();
		
	}

}
