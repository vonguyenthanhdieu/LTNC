package Nhom10;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Panel extends JPanel {
	JPanel accountPane, defaultPane, videoPane, authPane, centerPane;
	ImageIcon imgicon;
	JTextField userNameTextField;
	JPasswordField passwdField;
	JButton loginBtn, logoutBtn;
	public static String listAccounts = "admin:1";
	public static boolean isLogin = false;

	public Panel() {
		setLayout(new BorderLayout());
		accountPane = new AccountPanel();
		add(accountPane, BorderLayout.NORTH);
		centerPane = new CenterPalnel();
		add(centerPane, BorderLayout.CENTER);
		authPane = new AuthPanel();
		add(authPane, BorderLayout.SOUTH);
	}

	private class AccountPanel extends JPanel {
		JPanel userPane, passwdPane;
		JLabel userLabel, passwdLabel;

		private AccountPanel() {
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			userPane = new JPanel();
			userPane.setLayout(new GridLayout(1, 2));
			userLabel = new JLabel("Tên đăng nhập");
			userNameTextField = new JTextField();
			userNameTextField.setPreferredSize(new Dimension(200, 20));
			userPane.add(userLabel);
			userPane.add(userNameTextField);

			add(userPane);

			passwdPane = new JPanel();
			passwdPane.setLayout(new GridLayout(1, 2));
			passwdLabel = new JLabel("Mật khẩu");
			passwdField = new JPasswordField();
			passwdField.setEchoChar('*');
			passwdField.setPreferredSize(new Dimension(200, 20));
			passwdPane.add(passwdLabel);
			passwdPane.add(passwdField);
			
			add(passwdPane);

		}
	}

	private class CenterPalnel extends JPanel {
		CardLayout cardlayout;
		JPanel defaultPane, videoPane;

		private CenterPalnel() {
			cardlayout = new CardLayout();
			setLayout(cardlayout);
			defaultPane = new defaultPanel();
			add("default", defaultPane);
			videoPane = new VideoPanel();
			add("video", videoPane);
		}

		public void changePanel(String Panelname) {
			cardlayout.show(this, Panelname);
		}

	}

	private class defaultPanel extends JPanel {

		Image img = new ImageIcon(".\\src\\Nhom10\\hiphop.jpg").getImage();

		private defaultPanel() {
			setLayout(new BorderLayout());
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	private class VideoPanel extends JPanel {
		Image img = new ImageIcon(".\\src\\Nhom10\\anh.gif").getImage();

		CardLayout cardlayout;

		private VideoPanel() {
			setLayout(new BorderLayout());

		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	private class AuthPanel extends JPanel {

		JButton loginBtn, logoutBtn;

		private AuthPanel() {
			setLayout(new FlowLayout());
			loginBtn = new JButton("Đăng nhập");
			loginBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String userName = userNameTextField.getText();
					String passwd = passwdField.getText();

					if (!isLogin) {
						if (checkEsist(userName)) {
							if (checkAuth(userName, passwd)) {
								loginHandling();
							} else {
								JOptionPane.showMessageDialog(centerPane, "Mật khẩu không đúng", "Lỗi",
										JOptionPane.ERROR_MESSAGE);
							}

						} else {
							listAccounts += "-" + userName + ":" + passwd;
							loginHandling();
						}
					}
//					
				}
			});
			logoutBtn = new JButton("Đăng xuất");
			logoutBtn.setEnabled(false);
			logoutBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					logoutHandling();
				}
			});
			add(loginBtn);
			add(logoutBtn);
		}

		private boolean checkAuth(String userName, String passwd) {
			boolean result = false;

			String[] accountsArr = listAccounts.split("-");
			for (String account : accountsArr) {
				String userNameO = account.split(":")[0];
				String passwdO = account.split(":")[1];
				if (userNameO.equals(userName) && passwdO.equals(passwd)) {
					result = true;
				}
			}

			return result;
		}

		private boolean checkEsist(String userName) {
			boolean result = false;
			String[] accountsArr = listAccounts.split("-");
			for (String account : accountsArr) {
				if (account.split(":")[0].equals(userName)) {
					result = true;
				}
			}

			return result;
		}

		private void loginHandling() {
			JOptionPane.showMessageDialog(centerPane, "Đăng nhập thành công","Login", JOptionPane.NO_OPTION);
			((CenterPalnel) centerPane).changePanel("video");
			userNameTextField.setEditable(false);
			passwdField.setEditable(false);
			loginBtn.setEnabled(false);
			logoutBtn.setEnabled(true);
			userNameTextField.setText("");
			passwdField.setText("");
			isLogin = true;
		}

		private void logoutHandling() {
			int a = JOptionPane.showConfirmDialog(centerPane, "Bạn muốn đăng xuất?", "Logout",JOptionPane.YES_NO_OPTION);
			if (a == 0) {
				((CenterPalnel) centerPane).changePanel("default");
				userNameTextField.setEditable(true);
				passwdField.setEditable(true);
				loginBtn.setEnabled(true);
				logoutBtn.setEnabled(false);
				isLogin = false;
			}

		}
	}

}

