package Nhom10;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	Panel panel;
	public Frame () {
		setSize(800,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Xem phim");
		
		panel = new Panel();
		getContentPane().add(panel);
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Frame();
	}
}
