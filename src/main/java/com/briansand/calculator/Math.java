package com.briansand.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Math implements ActionListener {
	Calculator calc;

	public Math(Calculator calc) {
		super();
		this.calc = calc;
	}

	public void initialize() {
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
	}

	public void actionPerformed(ActionEvent e) {
		System.err.println("ActionEvent received: " + e);
		calc.tf.setText(calc.tf.getText() + ((JButton) e.getSource()).getText());
	}
}
