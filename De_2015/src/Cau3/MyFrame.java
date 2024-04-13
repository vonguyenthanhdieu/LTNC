package Cau3;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	Toolkit kit;
	public MyFrame() {
		setTitle("Art Management");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 400);
		//Khong cho phep thay doi kich thuoc cua so
		setResizable(false);
		//canh JFrame ở giữa màn hình
		setLocationRelativeTo(null);
		//set icon image
		kit = Toolkit.getDefaultToolkit();
		setIconImage(kit.getImage(".\\src\\Cau3\\cat.gif"));
		
		getContentPane().add(new MyPanel());
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}