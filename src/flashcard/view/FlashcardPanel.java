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
		flashcardArea.setEditable(false);
		
		correctNumberArea = new JTextArea();
		correctNumberArea.setEditable(false);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
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
	private void setupListeners()
	{
		answerButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String answer = answerField.getText();
				appController.useFlashcards(answer);
				answerField.setText("");
			}
		});
	}
	
	public void talkWithUser(String message)
	{
		flashcardArea.append(message);
	}
	
	private double getPercent()
	{
		double percent;
		
		percent = appController.transferPercent();
		
		return percent;
	}
}
