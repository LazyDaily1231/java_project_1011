package 그래픽;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Up2 {
	public void up2() {
		JFrame f = new JFrame("업 프레임");
		f.setSize(300,300);
		JButton b = new JButton("나를 눌러서");
		f.add(b);
		f.setVisible(true);
		b.setBackground(Color.red);
		b.setOpaque(true);
		}
	}

