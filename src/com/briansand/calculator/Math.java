package com.briansand.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Math extends Calculator implements ActionListener {

	public void math(String[] args) {

		button0.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		tf.setText("0");
	}
}
