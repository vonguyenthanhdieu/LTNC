package Cau1;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanel extends JPanel {
	JPanel subPanel;
	JTextField textfield;

	public MyPanel() {
		setLayout(new BorderLayout());

		setTextField();

		add(new SubPanel(), BorderLayout.CENTER);
	}

	private void setTextField() {
		textfield = new JTextField("0");
		textfield.setHorizontalAlignment(JTextField.RIGHT);
		textfield.setEditable(false);
		textfield.setPreferredSize(new Dimension(0, 40));
		textfield.setFont(new Font(null, 0, 17));
		add(textfield, BorderLayout.NORTH);

	}

	class SubPanel extends JPanel {
		JButton btn;
		ActionListener btnAction1, btnAction2;
		String[] array1 = { "DEL", "C", "ON", "OFF", "7", "8", "9", ":", "4", "5", "6", "x", "1", "2", "3", "-", "0",
				".", "=", "+" };
		/**
		 * array2 la actionCommand cua array1.
		 * Trong do gom 3 nhom: 
		 * 		number x: cac con so
		 * 		x operater X: la phep tinh ma X la :{:, x, -, +} 
		 * 		con lai: DEL, C, ON, OFF.
		 */
		String[] array2 = { "DEL", "C", "ON", "OFF", "number 7", "number 8", "number 9", "operator :", "number 4",
				"number 5", "number 6", "operator x", "number 1", "number 2", "number 3", "operator -", "number 0", ".",
				"=", "operator +" };
		boolean isBlocked, started;
		String operator = "";
		Double num1 = null, num2 = null;

		public SubPanel() {

			setLayout(new GridLayout(5, 4));

			/**
			 * Action nay viet cho method createButton3
			 */
			btnAction2 = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// Button ON
					if (isBlocked && e.getActionCommand().equals("ON")) {
						isBlocked = false;
						textfield.setText("0");
					}

					if (!isBlocked) {
						String actioncommand = e.getActionCommand();
						// command = {number, operator, DEL, C, ON, OFF, ., =}
						String command = actioncommand.split(" ")[0];
						// value = {1,2,3,4,5,6,7,8,9,+,-,x,:}
						String value = actioncommand.split(" ")[1];
						switch (command) {
						// Button number
						case "number":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(value);
							} else {
								textfield.setText(textfield.getText() + value);
							}
							break;

						// Button .
						case ".":
							// Trong mot so chi duoc ton tai 1 dau "."
							if (!textfield.getText().contains("."))
								textfield.setText(textfield.getText() + command);
							break;

						// Button DEL:
						case "DEL":
							String field = textfield.getText();
							field = field.substring(0, field.length() - 1);
							if (field.length() > 0)
								textfield.setText(field);
							else
								textfield.setText("0");
							break;

						// Button C:
						case "C":
							textfield.setText("0");
							break;

						// Button OFF:
						case "OFF":
							isBlocked = true;
							textfield.setText("");
							break;

						// Button operator :
						case "operator":
							operator = value;
							break;

						// Button "=" :
						case "=":
							if (!started) {
								num2 = Double.parseDouble(textfield.getText());

								double result = 0;

								switch (operator) {
								case ":":
									result = num1 / num2;
									break;

								case "x":
									result = num1 * num2;
									break;

								case "-":
									result = num1 - num2;
									break;

								case "+":
									result = num1 + num2;
									break;
								}
								textfield.setText(String.valueOf(result));
								started = true;
								num1 = null;
								operator = "";
								break;
							}
						}
					}
				}
			};

			/**
			 * Action nay viet cho method createButton1 va createButton2 Action nay viet
			 * dai, khong toi uu
			 */
			btnAction1 = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// Button ON
					if (isBlocked && e.getActionCommand().equals("ON")) {
						isBlocked = false;
						textfield.setText("0");
					}

					if (!isBlocked) {
						String command = e.getActionCommand();
						switch (command) {
						// Button 0
						case "0":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(command);
							} else {
								textfield.setText(textfield.getText() + command);
							}
							break;

						// Button 1
						case "1":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(command);
							} else {
								textfield.setText(textfield.getText() + command);
							}
							break;

						// Button 2
						case "2":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(command);
							} else {
								textfield.setText(textfield.getText() + command);
							}
							break;

						// Button 3
						case "3":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(command);
							} else {
								textfield.setText(textfield.getText() + command);
							}
							break;

						// Button 4
						case "4":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(command);
							} else {
								textfield.setText(textfield.getText() + command);
							}
							break;

						// Button 5
						case "5":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(command);
							} else {
								textfield.setText(textfield.getText() + command);
							}
							break;

						// Button 6
						case "6":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(command);
							} else {
								textfield.setText(textfield.getText() + command);
							}
							break;
						// Button 7
						case "7":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(command);
							} else {
								textfield.setText(textfield.getText() + command);
							}
							break;

						// Button 8
						case "8":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(command);
							} else {
								textfield.setText(textfield.getText() + command);
							}
							break;

						// Button 9
						case "9":
							if (!operator.equals("") && num1 == null) {
								num1 = Double.parseDouble(textfield.getText());
								textfield.setText("0");
							}
							// Neu da click "=" thi set lai la false khi nhap so moi
							if (started) {
								started = false;
								textfield.setText("0");
							}
							if (textfield.getText().equals("0")) {
								textfield.setText(command);
							} else {
								textfield.setText(textfield.getText() + command);
							}
							break;

						// Button .
						case ".":
							// Trong mot so chi duoc ton tai 1 dau "."
							if (!textfield.getText().contains("."))
								textfield.setText(textfield.getText() + command);
							break;

						// Button DEL:
						case "DEL":
							String field = textfield.getText();
							field = field.substring(0, field.length() - 1);
							if (field.length() > 0)
								textfield.setText(field);
							else
								textfield.setText("0");
							break;

						// Button C:
						case "C":
							textfield.setText("0");
							break;

						// Button OFF:
						case "OFF":
							isBlocked = true;
							textfield.setText("");
							break;

						// Button ":" :
						case ":":
							operator = command;
							break;

						// Button "x" :
						case "x":
							operator = command;
							break;

						// Button "-" :
						case "-":
							operator = command;
							break;

						// Button "+" :
						case "+":
							operator = command;
							break;

						// Button "=" :
						case "=":
							if (!started) {
								num2 = Double.parseDouble(textfield.getText());

								double result = 0;

								switch (operator) {
								case ":":
									result = num1 / num2;
									break;

								case "x":
									result = num1 * num2;
									break;

								case "-":
									result = num1 - num2;
									break;

								case "+":
									result = num1 + num2;
									break;
								}
								textfield.setText(String.valueOf(result));
								started = true;
								num1 = null;
								operator = "";
								break;
							}
						}
					}
				}
			};

//			createButton();
			createButton2();
		}

		/**
		 * Ham nay dung array1 de tao button voi action command la array2 Dieu kien: Cac
		 * button phai cung mot nhom (co cung mot event nhu nhau)
		 */
		private void createButton3() {
			for (int i = 0; i < array1.length; i++) {
				btn = new JButton(array1[i]);
				btn.setFont(new Font(null, 0, 15));
				btn.setActionCommand(array2[i]);
				btn.addActionListener(btnAction1);
				add(btn);
			}
		}

		/**
		 * Ham nay dung array1 de tao button Dieu kien: Cac button phai cung mot nhom
		 * (co cung mot event nhu nhau)
		 */
		private void createButton2() {
			for (String label : array1) {
				btn = new JButton(label);
				btn.setFont(new Font(null, 0, 15));
				btn.setActionCommand(label);
				btn.addActionListener(btnAction1);
				add(btn);
			}

		}

		private void createButton1() {
			// Hàng 1
			btn = new JButton("DEL");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("DEL");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("C");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("C");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("ON");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("ON");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("OFF");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("OFF");
			btn.addActionListener(btnAction1);
			add(btn);

			// Hàng 2
			btn = new JButton("7");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("7");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("8");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("8");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("9");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("9");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton(":");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand(":");
			btn.addActionListener(btnAction1);
			add(btn);

			// Hàng 3
			btn = new JButton("4");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("4");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("5");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("5");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("6");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("6");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("x");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("x");
			btn.addActionListener(btnAction1);
			add(btn);

			// hàng 4
			btn = new JButton("1");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("1");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("2");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("2");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("3");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("3");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("-");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("-");
			btn.addActionListener(btnAction1);
			add(btn);

			// Hàng 5
			btn = new JButton("0");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("0");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton(".");
			btn.setFont(new Font(null, 0, 25));
			btn.setActionCommand(".");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("=");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("=");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("+");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("+");
			btn.addActionListener(btnAction1);
			add(btn);
		}
	}

}
