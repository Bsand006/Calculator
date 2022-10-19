package com.briansand.calculator;

import java.awt.TextField;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Calculator {
	static Logger logger = Logger.getLogger(Calculator.class.getName());
	JFrame f;

	// Number buttons
	JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
	// Function buttons
	JButton buttonplus, buttonminus, buttonmult, buttondivide;
	// Operation buttons
	JButton buttonclear, buttondec, buttonneg;
	// Text field
	TextField tf;

	void run() {
		logger.info("Starting");
		
		// Initializes frame
		f = new JFrame();

		// Title
		f.setTitle("Calculator");

		// Sets frame size
		f.setSize(300, 400);

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
		// Output field
		tf = new TextField(12);
		tf.setBounds(50, 80, 150, 50);

		f.add(button0);
		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.add(button4);
		f.add(button5);
		f.add(button6);
		f.add(button7);
		f.add(button8);
		f.add(button9);
		f.add(buttonplus);
		f.add(buttonminus);
		f.add(buttonmult);
		f.add(buttondivide);
		f.add(buttondec);
		f.add(buttonneg);
		f.add(buttonclear);
		f.add(tf);
		
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
