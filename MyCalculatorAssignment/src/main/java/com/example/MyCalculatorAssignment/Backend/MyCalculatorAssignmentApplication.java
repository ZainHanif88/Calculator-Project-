package com.example.MyCalculatorAssignment.Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SpringBootApplication
public class MyCalculatorAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCalculatorAssignmentApplication.class, args);
	}
	@RestController
	public class HelloController {
		@GetMapping("/")
		public String hello() {
			return "Hello, This is my calculator project. You can use calculator as your desktop app!";
		}
}

	}