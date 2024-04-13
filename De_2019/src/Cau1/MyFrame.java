package Cau1;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("Máy tính");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 250);
		getContentPane().add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
