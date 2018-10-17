package visuals;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.Font;

public class GridBagLayout {

	private JFrame JFrame;
	private JTextField textField;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_20;
	private JButton button_19;
	private JButton button_18;
	private JButton button_17;
	private JButton button_16;
	private JButton button_21;
	private JButton button_22;
	private JButton button_23;
	private JButton button_24;
	private JButton button_25;
	private JButton button_28;
	private JButton button_27;
	private JButton button_26;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridBagLayout window = new GridBagLayout();
					window.JFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GridBagLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//float memory = 0;
		float input = 0;
		JFrame = new JFrame();
		JFrame.setResizable(false);
		JFrame.setAlwaysOnTop(true);
		JFrame.setTitle("Calculator");
		JFrame.setBounds(100, 100, 272, 454);
		
		//JFrame.EXIT_ON_CLOSE throws error "static field be accessed in a static way?"
		//this issue is beyond my knowledge
		//javax.swing.JFrame.EXIT_ON_CLOSE is what IDE suggested
		//now it just works
		JFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		JFrame.getContentPane().setLayout(null);
		
		
		textField = new JTextField();
		textField.setBounds(10, 11, 245, 80);		
		Font font = new Font("Verdana", Font.BOLD, 45);
		textField.setFont(font);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		JFrame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(String.valueOf(input));
		
		//textField.getText(String.valueOf();
		//textField.setText(String.valueOf());

		
		JButton button_1 = new JButton("MC");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//what happens
			}
		});
		button_1.setBounds(10, 102, 47, 48);
		button_1.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_1);

		//Buttons
		
		button_2 = new JButton("MR");
		button_2.setBounds(60, 102, 47, 48);
		button_2.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_2);
		
		button_3 = new JButton("MS");
		button_3.setBounds(109, 102, 47, 48);
		button_3.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_3);
		
		button_4 = new JButton("M+");
		button_4.setBounds(159, 102, 47, 48);
		button_4.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_4);
		
		button_5 = new JButton("M-");
		button_5.setBounds(208, 102, 47, 48);
		button_5.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_5);
		
		//delete one symbol
		button_6 = new JButton("\u2190");
		button_6.setBounds(10, 152, 47, 48);
		button_6.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_6);
		/*
		 * CE stands for Clear Entry - it is supposed to be used to clear
		 * (blank out or return to null) only the thing you are currently typing
		 * into the calculator, before you have performed any operation on it.
		 */
		button_7 = new JButton("CE");
		button_7.setBounds(60, 152, 47, 48);
		button_7.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_7);
		
		button_8 = new JButton("C");
		button_8.setBounds(109, 152, 47, 48);
		button_8.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_8);
		
		//plus minus
		button_9 = new JButton("\u00B1");
		button_9.setBounds(159, 152, 47, 48);
		button_9.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_9);
		
		//root
		button_10 = new JButton("\u221A");
		button_10.setBounds(208, 152, 47, 48);
		button_10.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_10);
		
		button_11 = new JButton("7");
		button_11.setBounds(10, 203, 47, 48);
		button_11.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_11);
		
		button_12 = new JButton("8");
		button_12.setBounds(60, 203, 47, 48);
		button_12.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_12);
		
		button_13 = new JButton("9");
		button_13.setBounds(109, 203, 47, 48);
		button_13.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_13);
		
		button_14 = new JButton("/");
		button_14.setBounds(159, 203, 47, 48);
		button_14.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_14);
		
		button_15 = new JButton("%");
		button_15.setBounds(208, 203, 47, 48);
		button_15.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_15);
		
		button_16 = new JButton("4");
		button_16.setBounds(10, 253, 47, 48);
		button_16.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_16);
		
		button_17 = new JButton("5");
		button_17.setBounds(60, 253, 47, 48);
		button_17.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_17);
		
		button_18 = new JButton("6");
		button_18.setBounds(109, 253, 47, 48);
		button_18.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_18);
		
		button_19 = new JButton("*");
		button_19.setBounds(159, 253, 47, 48);
		button_19.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_19);
		
		button_20 = new JButton("1/x");
		button_20.setBounds(208, 253, 47, 48);
		button_20.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_20);
		
		button_21 = new JButton("1");
		button_21.setBounds(10, 303, 47, 48);
		button_21.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_21);
		
		button_22 = new JButton("2");
		button_22.setBounds(60, 303, 47, 48);
		button_22.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_22);
		
		button_23 = new JButton("3");
		button_23.setBounds(109, 303, 47, 48);
		button_23.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_23);
		
		//minus
		button_24 = new JButton("\u2212");
		button_24.setBounds(159, 303, 47, 48);
		button_24.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_24);
		
		button_25 = new JButton("=");
		button_25.setBounds(208, 303, 47, 98);
		button_25.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_25);
		
		button_26 = new JButton("0");
		button_26.setBounds(10, 353, 97, 48);
		button_26.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_26);
		
		button_27 = new JButton(".");
		button_27.setBounds(109, 353, 47, 48);
		button_27.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_27);
		
		button_28 = new JButton("+");
		button_28.setBounds(159, 353, 47, 48);
		button_28.setMargin(new Insets(0, 0, 0, 0));
		JFrame.getContentPane().add(button_28);
		
		//textField.getText(String.valueOf();
		//textField.setText(String.valueOf());
		
	}
}
