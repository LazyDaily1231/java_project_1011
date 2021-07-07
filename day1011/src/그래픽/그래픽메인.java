package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽메인 {

	public static void main(String[] args) {
		JFrame f = new JFrame(); 
		f.setSize(500,500);
		JButton b1 = new JButton("나는 왼쪽");
		JButton b2 = new JButton("나는 오른쪽");
		JButton b3 = new JButton("나는 가운데");
		JButton b4 = new JButton("나는 아랫쪽");
		JButton b5 = new JButton("나는 윗쪽");
		
		f.add(b1, BorderLayout.WEST);
		f.add(b2, BorderLayout.EAST);
		f.add(b3, BorderLayout.CENTER);
		f.add(b4, BorderLayout.SOUTH);
		f.add(b5, BorderLayout.NORTH);
		
		b1.setBackground(Color.red);
		b1.setOpaque(true);
		b1.setBorderPainted(true);
		
		b2.setBackground(Color.red);
		//b2.setOpaque(true);
		
		b3.setBackground(Color.black);
		//b3.setOpaque(true);
		
		b4.setBackground(Color.red);
		//b4.setOpaque(true);
		

		
		
		
		b5.setBackground(Color.black);
		//b5.setOpaque(true);
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 눌렀을 때 처리하는 내용을 쓴다.
				Up up = new Up();
				up.up();
				Up2 up2 = new Up2();
				up2.up2();
			}
		});
	
		
		
		f.setVisible(true);
	}

}
