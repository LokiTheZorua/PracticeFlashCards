package flashcard.view;

import flashcard.controller.FlashcardController;
import javax.swing.*;
import java.awt.*;

public class FlashcardPanel extends JPanel
{
	private FlashcardController appController;
	private JButton answerButton;
	private JTextField answerField;
	private JTextArea flashcardArea;
	
	public FlashcardPanel(FlashcardController appController)
	{
		super();
		this.appController = appController;
		
		answerButton = new JButton("answer");
		answerField = new JTextField("Your answer here");
		flashcardArea = new JTextArea();
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		
		this.setBackground(Color.GREEN);
		this.add(answerButton);
		this.add(answerField);
		this.add(flashcardArea);
	}
	
	private void setupLayout()
	{
		
	}
	
}
