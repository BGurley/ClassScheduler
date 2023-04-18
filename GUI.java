// Program: Class Schedule Creator
// Written by: Brandon Gurley
// Program Description: The program is used to choose and generate a school schedule
// File name: GUI.java
// File description: The program is used to choose and generate a school schedule
// Other Files in this Project: Generated Schedule.txt file
// Challenges: Getting Everything to Work Together
// Time Spent: 2-3 Weeks


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUI implements ActionListener {
	
	private JLabel YorN, exMess, Great, cart, topMess, botMess, SciMess, MathMess, EnglishMess, HistoryMess, PEMess, LangMess;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() {
		
		//Cart ArrayList
		ArrayList<String> cartString  = new ArrayList<String>();
		
		//Arrays of Classes by Subject
		String[] ScienceClasses = {"Psychology", "Organic Chemistry", "Astrophysics"};
		String[] EnglishClasses = {"Literature and Online Speak - Language and Code Switching", "Essay Writing for Sciencetific Articles",  
				"Citation for the Academic - Avoiding Plagarism"};
		String[] HistoryClasses = {"World History - Southeast Asia", "World History - Australia", "World History - East Asian", 
				"World History - Middle East", "US History - Queer History", "US History - A History of Protest"};
		String[] LanguageClasses = {"Mandarin I", "Mandarin II", "German I", 
				"German II", "Latin I", "Latin II", "Greek I", 
				"Greek II", "Gaelic I", "Gaelic II"};
		String[] PEClasses = {"Table Tennis", "Ultimate Frisbee"};
		String[] MathClasses = {"Discrete Math", "Mathletes", "Linear Algebra"};	
		
		
		// PreReq Class Buttons
		JButton button1 = new JButton("English II");				
		JButton button2 = new JButton("Calculus II");	
		JButton button3 = new JButton("At Least Two Sciences (Physics, Chemistry, Biology)");		
		JButton button4 = new JButton("Two PE or Sports Teams for Two Years");
		JButton button5 = new JButton("Two years of Language");
		JButton button6 = new JButton("History II");


		//Science Class Buttons
		JButton science1 = new JButton(ScienceClasses[0]);
		science1.setBackground(Color.ORANGE);
		science1.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					science1.setVisible(false);
					cartString.add(ScienceClasses[0]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton science2 = new JButton(ScienceClasses[1]);
		science2.setBackground(Color.ORANGE);
		science2.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					science2.setVisible(false);
					cartString.add(ScienceClasses[1]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton science3 = new JButton(ScienceClasses[2]);
		science3.setBackground(Color.ORANGE);
		science3.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					science3.setVisible(false);
					cartString.add(ScienceClasses[2]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		
		
		//Math Class Buttons
		JButton math1 = new JButton(MathClasses[0]);
		math1.setBackground(Color.RED);
		math1.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					math1.setVisible(false);
					cartString.add(MathClasses[0]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton math2 = new JButton(MathClasses[1]);
		math2.setBackground(Color.RED);
		math2.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					math2.setVisible(false);
					cartString.add(MathClasses[1]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton math3 = new JButton(MathClasses[2]);
		math3.setBackground(Color.RED);
		math3.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					math2.setVisible(false);
					cartString.add(MathClasses[2]);
				}
					cart.setText("Selected Courses: " +cartString);
			}}));
		
		
		//History Class Buttons
		JButton hist1 = new JButton(HistoryClasses[0]);
		hist1.setBackground(Color.CYAN);
		hist1.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					hist1.setVisible(false);
					cartString.add(HistoryClasses[0]);
					cart.setText("Selected Courses: " +cartString);	
				}
			}}));
		JButton hist2 = new JButton(HistoryClasses[1]);
		hist2.setBackground(Color.CYAN);
		hist2.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					hist2.setVisible(false);
					cartString.add(HistoryClasses[1]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton hist3 = new JButton(HistoryClasses[2]);
		hist3.setBackground(Color.CYAN);
		hist3.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					hist3.setVisible(false);
					cartString.add(HistoryClasses[2]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton hist4 = new JButton(HistoryClasses[3]);
		hist4.setBackground(Color.CYAN);
		hist4.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					hist4.setVisible(false);
					cartString.add(HistoryClasses[3]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton hist5 = new JButton(HistoryClasses[4]);
		hist5.setBackground(Color.CYAN);
		hist5.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					hist5.setVisible(false);
					cartString.add(HistoryClasses[4]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton hist6 = new JButton(HistoryClasses[5]);
		hist6.setBackground(Color.CYAN);
		hist6.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					hist6.setVisible(false);
					cartString.add(HistoryClasses[5]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		
		
		//Language Class Buttons
		JButton lang1 = new JButton(LanguageClasses[0]);
		lang1.setBackground(Color.GREEN);
		lang1.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					lang1.setVisible(false);
					cartString.add(LanguageClasses[0]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton lang2 = new JButton(LanguageClasses[1]);
		lang2.setBackground(Color.GREEN);
		lang2.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					lang2.setVisible(false);
					cartString.add(LanguageClasses[1]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton lang3 = new JButton(LanguageClasses[2]);
		lang3.setBackground(Color.GREEN);
		lang3.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					lang3.setVisible(false);
					cartString.add(LanguageClasses[2]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton lang4 = new JButton(LanguageClasses[3]);
		lang4.setBackground(Color.GREEN);
		lang4.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					lang4.setVisible(false);
					cartString.add(LanguageClasses[3]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton lang5 = new JButton(LanguageClasses[4]);
		lang5.setBackground(Color.GREEN);
		lang5.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					lang5.setVisible(false);
					cartString.add(LanguageClasses[4]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton lang6 = new JButton(LanguageClasses[5]);
		lang6.setBackground(Color.GREEN);
		lang6.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					lang6.setVisible(false);
					cartString.add(LanguageClasses[5]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));		
		JButton lang7 = new JButton(LanguageClasses[6]);
		lang7.setBackground(Color.GREEN);
		lang7.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					lang7.setVisible(false);
					cartString.add(LanguageClasses[6]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton lang8 = new JButton(LanguageClasses[7]);
		lang8.setBackground(Color.GREEN);
		lang8.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					lang8.setVisible(false);
					cartString.add(LanguageClasses[7]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton lang9 = new JButton(LanguageClasses[8]);
		lang9.setBackground(Color.GREEN);
		lang9.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					lang9.setVisible(false);
					cartString.add(LanguageClasses[8]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton lang10 = new JButton(LanguageClasses[9]);
		lang10.setBackground(Color.GREEN);
		lang10.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					lang10.setVisible(false);
					cartString.add(LanguageClasses[9]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));		
		
		
		//English Class Buttons
		JButton eng1 = new JButton(EnglishClasses[0]);
		eng1.setBackground(Color.BLUE);
		eng1.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					eng1.setVisible(false);
					cartString.add(EnglishClasses[0]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton eng2 = new JButton(EnglishClasses[1]);
		eng2.setBackground(Color.BLUE);
		eng2.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					eng2.setVisible(false);
					cartString.add(EnglishClasses[1]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton eng3 = new JButton(EnglishClasses[2]);
		eng3.setBackground(Color.BLUE);
		eng3.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					eng3.setVisible(false);
					cartString.add(EnglishClasses[2]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
			
		
		//Physical Education Class Buttons
		JButton pe1 = new JButton(PEClasses[0]);
		pe1.setBackground(Color.YELLOW);
		pe1.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					pe1.setVisible(false);
					cartString.add(PEClasses[0]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		JButton pe2 = new JButton(PEClasses[1]);
		pe2.setBackground(Color.YELLOW);
		pe2.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cartString.size()<5)
				{
					pe1.setVisible(false);
					cartString.add(PEClasses[1]);
					cart.setText("Selected Courses: " +cartString);
				}
			}}));
		
		
		// Yes and No Button to Decide whether student has met criteria to select classes
		JButton button9 = new JButton("No");
		button9.setBackground(Color.RED);
		button9.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}));
		
		//When user chooses YES the available classes will display
		JButton button8 = new JButton("Yes");
		button8.setBackground(Color.GREEN);
		button8.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Great.setVisible(true);
				button9.setVisible(false);
				cart.setVisible(true);
				
				SciMess.setVisible(true);
				science1.setVisible(true);
				science2.setVisible(true);
				science3.setVisible(true);
				
				MathMess.setVisible(true);
				math1.setVisible(true);
				math2.setVisible(true);
				math3.setVisible(true);
				
				HistoryMess.setVisible(true);
				hist1.setVisible(true);
				hist2.setVisible(true);
				hist3.setVisible(true);
				hist4.setVisible(true);
				hist5.setVisible(true);
				hist6.setVisible(true);
				
				LangMess.setVisible(true);
				lang1.setVisible(true);
				lang2.setVisible(true);
				lang3.setVisible(true);
				lang4.setVisible(true);
				lang5.setVisible(true);
				lang6.setVisible(true);
				lang7.setVisible(true);
				lang8.setVisible(true);
				lang9.setVisible(true);
				lang10.setVisible(true);
				
				EnglishMess.setVisible(true);
				eng1.setVisible(true);
				eng2.setVisible(true);
				eng3.setVisible(true);
				
				PEMess.setVisible(true);
				pe1.setVisible(true);
				pe2.setVisible(true);
			}
		}));

		JButton export = new JButton("Export & Quit");
		export.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrintWriter txtFile = new PrintWriter("Schedule.txt");
					txtFile.println("My Generated Schedule: "+cartString);
					txtFile.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0);
			}}));
		
		//General Labels
		topMess = new JLabel ("Welcome to the Class Scheduling Program!", SwingConstants.CENTER);
		topMess.setFont(new Font("Verdana", Font.BOLD, 18));
		
		botMess = new JLabel ("Have you already taken these courses?", SwingConstants.CENTER);
		botMess.setFont(new Font("Verdana", Font.PLAIN, 14));

		YorN = new JLabel("Please Choose Yes or No", SwingConstants.CENTER);
		YorN.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		Great = new JLabel("Great! Please Select Up to 5 Courses from the selection below", SwingConstants.CENTER);
		Great.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		cart  = new JLabel("Selected Classes: "+cartString, SwingConstants.CENTER);
		cart.setFont(new Font("Verdana", Font.BOLD, 14));
		
		
		//Course Type Labels
		SciMess = new JLabel("Science Courses: Orange", SwingConstants.CENTER);
		SciMess.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		MathMess = new JLabel("Math Courses: Red", SwingConstants.CENTER);
		MathMess.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		EnglishMess  = new JLabel("English Courses: Dark Blue ", SwingConstants.CENTER);
		EnglishMess.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		HistoryMess = new JLabel("History Courses: Light Blue", SwingConstants.CENTER);
		HistoryMess.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		PEMess = new JLabel("Physical Education Courses: Yellow", SwingConstants.CENTER);
		PEMess.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		LangMess  = new JLabel("Language Courses: Green", SwingConstants.CENTER);
		LangMess.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		exMess = new JLabel("All Done?", SwingConstants.CENTER);
		exMess.setFont(new Font("Verdana", Font.BOLD, 14));
		

		//GUI Layout
		frame = new JFrame();
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(topMess);
		panel.add(botMess);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(YorN);
		panel.add(button8);
		panel.add(button9);
		
		panel.add(Great);
		Great.setVisible(false);
		panel.add(cart);
		cart.setVisible(false);
		
		// Adding Science Courses and Labels to the Panel
		panel.add(SciMess);
		SciMess.setVisible(false);
		panel.add(science1);
		science1.setVisible(false);
		panel.add(science2);
		science2.setVisible(false);
		panel.add(science3);
		science3.setVisible(false);
		
		//Adding Math Courses and Label to the Panel
		panel.add(MathMess);
		MathMess.setVisible(false);
		panel.add(math1);
		math1.setVisible(false);
		panel.add(math2);
		math2.setVisible(false);
		panel.add(math3);
		math3.setVisible(false);
		
		//Adding History Courses and Label to the Panel
		panel.add(HistoryMess);
		HistoryMess.setVisible(false);
		panel.add(hist1);
		hist1.setVisible(false);
		panel.add(hist2);
		hist2.setVisible(false);
		panel.add(hist3);
		hist3.setVisible(false);
		panel.add(hist4);
		hist4.setVisible(false);
		panel.add(hist5);
		hist5.setVisible(false);
		panel.add(hist6);
		hist6.setVisible(false);
		
		//Adding Language Courses and Label to the Panel
		panel.add(LangMess);
		LangMess.setVisible(false);
		panel.add(lang1);
		lang1.setVisible(false);
		panel.add(lang2);
		lang2.setVisible(false);
		panel.add(lang3);
		lang3.setVisible(false);
		panel.add(lang4);
		lang4.setVisible(false);
		panel.add(lang5);
		lang5.setVisible(false);
		panel.add(lang6);
		lang6.setVisible(false);
		panel.add(lang7);
		lang7.setVisible(false);
		panel.add(lang8);
		lang8.setVisible(false);
		panel.add(lang9);
		lang9.setVisible(false);
		panel.add(lang10);
		lang10.setVisible(false);

		//Adding English Courses and Label to the Panel
		panel.add(EnglishMess);
		EnglishMess.setVisible(false);
		panel.add(eng1);
		eng1.setVisible(false);
		panel.add(eng2);
		eng2.setVisible(false);
		panel.add(eng3);
		eng3.setVisible(false);
		
		//Adding PE Courses and Label to the Panel
		panel.add(PEMess);
		PEMess.setVisible(false);
		panel.add(pe1);
		pe1.setVisible(false);
		panel.add(pe2);
		pe2.setVisible(false);
		
		//adding export button
		panel.add(exMess);
		panel.add(export);

		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Class Scheduler");
		frame.setSize(1000, 1400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
}
