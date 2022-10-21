package com.briansand.calculator;

import java.awt.GridLayout;
import java.awt.TextField;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Calculator {
	static Logger logger = Logger.getLogger(Calculator.class.getName());
	JFrame f;

	// Number buttons
	JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
	// Function buttons
	JButton buttonplus, buttonminus, buttonmult, buttondivide;
	// Operation buttons
	JButton buttonclear, buttondec, buttonneg, buttonent;
	// Text field
	TextField tf;
	// Blank filler
	JLabel blank, blank1;

	void run() {
		logger.info("Starting");

		// Initializes frame
		f = new JFrame();

		// initializes GridLayout
		GridLayout calclayout = new GridLayout(5, 4);

		// Calls setLayout with GridLayout object
		f.setLayout(calclayout);

		// Title
		f.setTitle("Calculator");

		// Sets frame size
		f.setSize(300, 400);

		// Blank filler
		blank = new JLabel();
		blank1 = new JLabel();

		// Button 0
		button0 = new JButton("0");
		button0.setBounds(100, 280, 50, 50);
		// Button 1
		button1 = new JButton("1");
		button1.setBounds(50, 230, 50, 50);
		// Button 2
		button2 = new JButton("2");
		button2.setBounds(100, 230, 50, 50);
		// Button 3
		button3 = new JButton("3");
		button3.setBounds(150, 230, 50, 50);
		// Button 4
		button4 = new JButton("4");
		button4.setBounds(50, 180, 50, 50);
		// Button 5
		button5 = new JButton("5");
		button5.setBounds(100, 180, 50, 50);
		// Button 6
		button6 = new JButton("6");
		button6.setBounds(150, 180, 50, 50);
		// Button 7
		button7 = new JButton("7");
		button7.setBounds(50, 130, 50, 50);
		// Button 8
		button8 = new JButton("8");
		button8.setBounds(100, 130, 50, 50);
		// Button 9
		button9 = new JButton("9");
		button9.setBounds(150, 130, 50, 50);
		// Button +
		buttonplus = new JButton("+");
		buttonplus.setBounds(200, 280, 50, 50);
		// Button -
		buttonminus = new JButton("-");
		buttonminus.setBounds(200, 230, 50, 50);
		// Button *
		buttonmult = new JButton("*");
		buttonmult.setBounds(200, 180, 50, 50);
		// Button /
		buttondivide = new JButton("/");
		buttondivide.setBounds(200, 130, 50, 50);
		// Decimal button
		buttondec = new JButton(".");
		buttondec.setBounds(50, 280, 50, 50);
		// Negative button
		buttonneg = new JButton("(-)");
		buttonneg.setBounds(150, 280, 50, 50);
		// Clear button
		buttonclear = new JButton("C");
		buttonclear.setBounds(200, 80, 50, 50);
		// Enter button
		buttonent = new JButton("E");
		buttonent.setBounds(100, 100, 50, 50);
		// Output field
		tf = new TextField();
		tf.setBounds(50, 80, 150, 50);

		// Adds buttons & TextField to JFrame
		f.add(tf);
		f.add(blank1);
		f.add(buttonclear);
		f.add(buttonclear);
		f.add(button7);
		f.add(button8);
		f.add(button9);
		f.add(buttondivide);
		f.add(button4);
		f.add(button5);
		f.add(button6);
		f.add(buttonmult);
		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.add(buttonminus);
		f.add(buttonneg);
		f.add(button0);
		f.add(buttondec);
		f.add(buttonplus);

		Math m = new Math(this);
		m.initialize();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		logger.info("main");

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Calculator().run();
			}
		});
	}
}
