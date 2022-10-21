package com.briansand.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Math implements ActionListener {
	Calculator calc;

	// Operations enumeration
	enum CalcOperations {
		ADD, SUBTRACT, MODIFY, DIVIDE
	}

	// Adds TextField values to a string
	String textvalues = calc.tf.getText();

	// Number variables
	double num1 = 0;
	double num2 = 0;

	// Operations variable
	CalcOperations op;

	public Math(Calculator calc) {
		super();
		this.calc = calc;
	}

	public void initialize() {

		// Adds ActionListener to the buttons
		calc.button0.addActionListener(this);
		calc.button1.addActionListener(this);
		calc.button2.addActionListener(this);
		calc.button3.addActionListener(this);
		calc.button4.addActionListener(this);
		calc.button5.addActionListener(this);
		calc.button6.addActionListener(this);
		calc.button7.addActionListener(this);
		calc.button8.addActionListener(this);
		calc.button9.addActionListener(this);
		calc.buttonplus.addActionListener(this);
		calc.buttonminus.addActionListener(this);
		calc.buttonmult.addActionListener(this);
		calc.buttondivide.addActionListener(this);
	}

	// ActionEvent method
	public void actionPerformed(ActionEvent e) {

		// Prints action received system message
		System.err.println("ActionEvent received: " + e);
		// Prints pressed button value to TextField
		calc.tf.setText(calc.tf.getText() + ((JButton) e.getSource()).getText());

		// Add variable logic
		if (e.getSource() == calc.buttonplus) {
			op = CalcOperations.ADD;
			num1 = Double.parseDouble(textvalues);
			if (num1 != 0) {
				num2 = Double.parseDouble(textvalues);
			}

		}
		// Subtract variable logic
		if (e.getSource() == calc.buttonminus) {
			op = CalcOperations.SUBTRACT;
			num1 = Double.parseDouble(textvalues);
			if (num1 != 0) {
				num2 = Double.parseDouble(textvalues);
			}
		}
		// Multiply variable logic
		if (e.getSource() == calc.buttonmult) {
			op = CalcOperations.MODIFY;
			num1 = Double.parseDouble(textvalues);
			if (num1 != 0) {
				num2 = Double.parseDouble(textvalues);
			}
		}
		// Division variable logic
		if (e.getSource() == calc.buttondivide) {
			op = CalcOperations.DIVIDE;
			num1 = Double.parseDouble(textvalues);
			if (num1 != 0) {
				num2 = Double.parseDouble(textvalues);
			}
		}
	}
}
