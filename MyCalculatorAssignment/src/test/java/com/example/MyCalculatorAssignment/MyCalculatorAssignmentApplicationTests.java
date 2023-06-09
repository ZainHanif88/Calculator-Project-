package com.example.MyCalculatorAssignment;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.JButton;
import javax.swing.JTextField;
@SpringBootConfiguration
@SpringBootTest
class MyCalculatorAssignmentApplicationTests {

	private JTextField textField;
	private JButton addButton;
	private JButton subButton;
	private JButton mulButton;
	private JButton divButton;
	private double num1;
	private char operator;
	@BeforeEach
	public void setUp() {
		textField = new JTextField();
		addButton = new JButton();
		subButton = new JButton();
		mulButton = new JButton();
		divButton = new JButton();
	}

	@Test
	public void testAddButtonClicked() {
		//Given
		// Set up the test conditions
		String inputValue = "5.5";
		textField.setText(inputValue);
		num1 = 0.0;
		operator = ' ';

		//When
		// Simulate the button click event
		addButton.addActionListener(e -> {
			if (e.getSource() == addButton) {
				num1 = Double.parseDouble(textField.getText());
				operator = '+';
				textField.setText("");
			}
		});
		addButton.doClick(); // Simulate the button click

		//Then
		// Verify the expected changes
		Assertions.assertEquals(Double.parseDouble(inputValue), num1);
		Assertions.assertEquals('+', operator);
		Assertions.assertEquals("", textField.getText());
	}

	@Test
	public void testSubButtonClicked() {
		//Given
		// Set up the test conditions
		String inputValue = "5.5";
		textField.setText(inputValue);
		num1 = 0.0;
		operator = ' ';

		//When
		// Simulate the button click event
		subButton.addActionListener(e -> {
			if (e.getSource() == subButton) {
				num1 = Double.parseDouble(textField.getText());
				operator = '-';
				textField.setText("");
			}
		});
		subButton.doClick(); // Simulate the button click

		//Then
		// Verify the expected changes
		Assertions.assertEquals(Double.parseDouble(inputValue), num1);
		Assertions.assertEquals('-', operator);
		Assertions.assertEquals("", textField.getText());
	}

	@Test
	public void testMulButtonClicked() {
		//Given
		// Set up the test conditions
		String inputValue = "7.2";
		textField.setText(inputValue);
		num1 = 0.0;
		operator = ' ';

		//When
		// Simulate the button click event
		mulButton.addActionListener(e -> {
			if (e.getSource() == mulButton) {
				num1 = Double.parseDouble(textField.getText());
				operator = '*';
				textField.setText("");
			}
		});
		mulButton.doClick(); // Simulate the button click

		//Then
		// Verify the expected changes
		Assertions.assertEquals(Double.parseDouble(inputValue), num1);
		Assertions.assertEquals('*', operator);
		Assertions.assertEquals("", textField.getText());
	}

	@Test
	public void testDivButtonClicked() {
		//Given
		// Set up the test conditions
		String inputValue = "3.0";
		textField.setText(inputValue);
		num1 = 0.0;
		operator = ' ';

		//When
		// Simulate the button click event
		divButton.addActionListener(e -> {
			if (e.getSource() == divButton) {
				num1 = Double.parseDouble(textField.getText());
				operator = '/';
				textField.setText("");
			}
		});
		divButton.doClick(); // Simulate the button click

		//Then
		// Verify the expected changes
		Assertions.assertEquals(Double.parseDouble(inputValue), num1);
		Assertions.assertEquals('/', operator);
		Assertions.assertEquals("", textField.getText());
	}





}
