package Cau3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyPanel extends JPanel {
	JPanel topPanel, southPanel, centerPanel;
	JButton btThem, btSapxep;
	JLabel lbQuanly, lbTacpham, lbTacgia, lbNam, lbChieucao, lbCannang, lbVatlieu;
	JTextField tfTacpham, tfNam, tfCannang, tfChieucao;
	JComboBox cbTacgia, cbVatlieu;
	JTextArea textArea;
	public MyPanel() {
		setLayout(new BorderLayout());
		//top panel
		topPanel = new JPanel();
		lbQuanly = new JLabel("QUẢN LÝ TÁC PHẨM ĐIÊU KHẮC");
		topPanel.add(lbQuanly, BorderLayout.CENTER);
		add(topPanel, BorderLayout.NORTH);
		
		//CenterPanel
		centerPanel = new CenterPanel();
		add(centerPanel, BorderLayout.CENTER);
		
		//south panel
		southPanel = new SouthPanel();
		JScrollPane sc = new JScrollPane(southPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(southPanel, BorderLayout.SOUTH);
		
	}
	class SouthPanel extends JPanel{
		public SouthPanel() {
			//set up the title for panel
			setBorder(BorderFactory.createTitledBorder("Thông tin về tác phẩm điêu khắc"));
			textArea = new JTextArea();
			textArea.setPreferredSize(new Dimension(330, 100));
			add(textArea);
		}
	}
	
	class CenterPanel extends JPanel{
		public CenterPanel() {
			setLayout(new GridLayout(7,1));
			setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
			
			//Tac pham
			lbTacpham = new JLabel("Tên tác phẩm: ");
			tfTacpham = new JTextField();
			JPanel tacpham = new JPanel();
			tacpham.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			tacpham.add(lbTacpham, 0 ,0);
			tfTacpham.setPreferredSize(new Dimension(240,25));
			tacpham.add(tfTacpham);
			add(tacpham);
			
			//Tac gia
			lbTacgia = new JLabel("Tác giả:            ");
			String[] itemsTacgia = {"Paige Bradley", "Fah Cheong", "Tom Frantzen", "Botero"};
			cbTacgia = new JComboBox<String>(itemsTacgia);
			JPanel tacgia = new JPanel();
			tacgia.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			tacgia.add(lbTacgia,0 ,0);
			cbTacgia.setPreferredSize(new Dimension(240,25));
			tacgia.add(cbTacgia);
			add(tacgia);
			
			//Nam sang tac
			lbNam = new JLabel("Năm sáng tác: ");
			tfNam = new JTextField();
			JPanel nam = new JPanel();
			nam.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			nam.add(lbNam);
			tfNam.setPreferredSize(new Dimension(240,25));
			nam.add(tfNam);
			add(nam);
			
			//Vật liệu
			lbVatlieu = new JLabel("Vật liệu:           ");
			String[] itemsVatlieu = {"Đá", "Sáp", "Đồng"};
			cbVatlieu = new JComboBox<String>(itemsVatlieu);
			JPanel vatlieu = new JPanel();
			vatlieu.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			vatlieu.add(lbVatlieu);
			cbVatlieu.setPreferredSize(new Dimension(240,25));
			vatlieu.add(cbVatlieu);
			add(vatlieu);
			
			//Cân nặng
			lbCannang = new JLabel("Cân nặng:        ");
			tfCannang = new JTextField();
			JPanel cannang = new JPanel();
			cannang.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			cannang.add(lbCannang);
			tfCannang.setPreferredSize(new Dimension(240,25));
			cannang.add(tfCannang);
			add(cannang);
			
			//Chiều cao
			lbChieucao = new JLabel("Chiều cao:       ");
			tfChieucao = new JTextField();
			JPanel chieucao = new JPanel();
			chieucao.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			chieucao.add(lbChieucao);
			tfChieucao.setPreferredSize(new Dimension(240,25));
			chieucao.add(tfChieucao);
			add(chieucao);
			
			//button
			JPanel button = new JPanel();
			button.setLayout(new FlowLayout(FlowLayout.CENTER));
			//button them
			btThem = new JButton("Thêm");
			button.add(btThem);
			//button them
			btSapxep = new JButton("Sắp xếp");
			button.add(btSapxep);
			add(button);
		}
	}
	
	
}
