package com.briansand.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Logic implements ActionListener {
	Calculator calc;

	// Operations enumeration
	enum CalcOperations {
		ADD, SUBTRACT, MODIFY, DIVIDE
	}

	// Adds TextField values to a string
	String textvalues;

	// variables
	double num1 = 0;
	double num2 = 0;
	double pi = Math.PI;

	boolean sqrt;
	String num3;

	// Operations variable
	CalcOperations op;

	public Logic(Calculator calc) {
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
		calc.buttondec.addActionListener(this);
		calc.buttonsqrt.addActionListener(this);
		calc.buttonneg.addActionListener(this);
		calc.buttonpie.addActionListener(this);
		calc.buttonent.addActionListener(this);
		calc.buttonclear.addActionListener(this);
	}

	// ActionEvent method
	public void actionPerformed(ActionEvent e) {

		textvalues = calc.tf.getText();
		sqrt = false;

		// Prints action received system message
		System.err.println("ActionEvent received: " + e);
		// Prints pressed button value to TextField
		if (e.getSource() == calc.button0 || e.getSource() == calc.button1 || e.getSource() == calc.button2
				|| e.getSource() == calc.button3 || e.getSource() == calc.button4 || e.getSource() == calc.button5
				|| e.getSource() == calc.button6 || e.getSource() == calc.button7 || e.getSource() == calc.button8
				|| e.getSource() == calc.button9 || e.getSource() == calc.buttondec || e.getSource() == calc.buttonneg
				|| e.getSource() == calc.buttonsqrt) { // TODO why squareroot here? squareroot is an operation
			calc.tf.setText(calc.tf.getText() + ((JButton) e.getSource()).getText());
		}

		// Addition variable logic
		if (e.getSource() == calc.buttonplus) {
			op = CalcOperations.ADD;
			num1 = Double.parseDouble(textvalues);

			calc.tf.setText("");
		}

		// Subtract variable logic
		if (e.getSource() == calc.buttonminus) {
			op = CalcOperations.SUBTRACT;
			num1 = Double.parseDouble(textvalues);
			calc.tf.setText("");

		}
		// Multiply variable logic
		if (e.getSource() == calc.buttonmult) {
			op = CalcOperations.MODIFY;
			num1 = Double.parseDouble(textvalues);
			calc.tf.setText("");

		}
		// Division variable logic
		if (e.getSource() == calc.buttondivide) {
			op = CalcOperations.DIVIDE;
			num1 = Double.parseDouble(textvalues);
			calc.tf.setText("");

		}

		// Calculation logic
		if (e.getSource() == calc.buttonent) {
			num2 = Double.parseDouble(textvalues);
			if (op == CalcOperations.ADD) {
				num3 = String.valueOf(num1 + num2);
			} else if (op == CalcOperations.SUBTRACT) {
				num3 = String.valueOf(num1 - num2);
			} else if (op == CalcOperations.MODIFY) {
				num3 = String.valueOf(num1 * num2);
			} else {
				num3 = String.valueOf(num1 / num2);
			}
			calc.tf.setText(num3);

			num1 = 0;
			num2 = 0;
		}

		// Clear button logic
		if (e.getSource() == calc.buttonclear) {
			calc.tf.setText("");
			num1 = 0;
			num2 = 0;
		}
	}
}
