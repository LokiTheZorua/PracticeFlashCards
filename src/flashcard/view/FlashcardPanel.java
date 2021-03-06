package flashcard.view;

import flashcard.controller.FlashcardController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class FlashcardPanel extends JPanel
{
	private SpringLayout appLayout;
	private FlashcardController appController;
	private JButton answerButton;
	private JTextField answerField;
	private JTextArea flashcardArea;
	private JTextArea correctNumberArea;
	private int currentQuestioned = 0;
	private int correctQuestioned = 0;
	private boolean correct;
	
	
	
	public FlashcardPanel(FlashcardController appController)
	{
		
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		answerButton = new JButton("answer");
		
		answerField = new JTextField(20);
		appLayout.putConstraint(SpringLayout.WEST, answerButton, 6, SpringLayout.EAST, answerField);
		appLayout.putConstraint(SpringLayout.NORTH, answerField, 0, SpringLayout.NORTH, answerButton);
		appLayout.putConstraint(SpringLayout.EAST, answerField, -319, SpringLayout.EAST, this);
		
		flashcardArea = new JTextArea();
		flashcardArea.setEditable(false);
		appLayout.putConstraint(SpringLayout.WEST, answerField, 0, SpringLayout.WEST, flashcardArea);
		
		flashcardArea.setLineWrap(true);
		
		correctNumberArea = new JTextArea();
		correctNumberArea.setEditable(false);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		showQuestion();
	}
	
	
	public void showQuestion()
	{
		String question;
		
		question = appController.presentQuestion();
		
		if (flashcardArea.equals(""))
		{
			flashcardArea.setText(question);
		}
		else
		{
			flashcardArea.append(question);
		}
	}
	
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setBackground(Color.GREEN);
		this.add(answerButton);
		this.add(answerField);
		this.add(flashcardArea);
		this.add(correctNumberArea);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, flashcardArea, 29, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, flashcardArea, 82, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, flashcardArea, -95, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, answerButton, 21, SpringLayout.SOUTH, flashcardArea);
		appLayout.putConstraint(SpringLayout.SOUTH, flashcardArea, -85, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, correctNumberArea, 0, SpringLayout.NORTH, answerButton);
		appLayout.putConstraint(SpringLayout.WEST, correctNumberArea, 17, SpringLayout.EAST, answerButton);
		appLayout.putConstraint(SpringLayout.SOUTH, correctNumberArea, 0, SpringLayout.SOUTH, answerButton);
		appLayout.putConstraint(SpringLayout.EAST, correctNumberArea, 0, SpringLayout.EAST, flashcardArea);
	}
	// Start Abstraction
	private void setupListeners()
	{
		answerButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
				String answer = answerField.getText();
				
				if(answer.isEmpty() || answer.equals(""))
				{
					flashcardArea.append("\n Hey! This is empty! Please put something in it! \n");
				}
				else
				{
					
					answerField.setText("");
				
					if (answer.toLowerCase().equals(appController.getAnswer().toLowerCase()))
					{
						flashcardArea.append(" correct \n");
						correct = true;
					}
					else
					{
						flashcardArea.append(" Wrong \n");
						correct = false;
					}
				
					correctNumberArea.setText(calculatePercent());
				
					appController.askNextQuestion();
				
					flashcardArea.append(appController.presentQuestion());
				}
			}
		});
	}
	//end abstraction
	private String calculatePercent()
	{	
		currentQuestioned++;
		
		if (correct)
		{
			correctQuestioned++;
		}
		
		
		
		return (correctQuestioned * 100 / currentQuestioned) + "%";
	}
}
