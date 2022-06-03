package mypackage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JButton testButton1 = new JButton("Click to call Anonymous ActionListener");
		JButton testButton2 = new JButton("Click to call Lambda ActionListener");
		JButton testButton3 = new JButton("Click to call Anonymous ActionListener3");
		JButton testButton4 = new JButton("Click to call Lambda ActionListener4");
		
		// Anonymous ActionListener
		testButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click Detected by Anonymous Listener: " + e);
			}
		});

		// Lambda ActionListener
		testButton2.addActionListener(e -> System.out.println("Click Detected by Lambda Listner: " + e));
		
		// Anonymous ActionListener
		testButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(new Date());
			}
		});

		// Lambda ActionListener
		testButton4.addActionListener(e -> System.out.println(new Date()));

		// Swing stuff
		JFrame frame = new JFrame("Listener Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(testButton1, BorderLayout.WEST);
		frame.add(testButton2, BorderLayout.EAST);
		frame.add(testButton3, BorderLayout.NORTH);
		frame.add(testButton4, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);

		// < For your own exercise>
		// - Create another set of buttons, one using Anonymous ActionListener
		//   and the other using Lambda ActionListener
		// - When clicked, each button should display current date and time

	}

}
