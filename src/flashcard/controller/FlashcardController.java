package flashcard.controller;

import flashcard.view.FlashcardFrame;
import flashcard.model.Flashcard;
import flashcard.view.FlashcardPanel;

public class FlashcardController
{
	private FlashcardFrame appFrame;
	private Flashcard flashcard;
	private FlashcardPanel appPanel;
	
	public FlashcardController()
	{
		flashcard = new Flashcard("This");
		
	}
	
	private int questionsAnswered;
	
	public void start()
	{
		appPanel = new FlashcardPanel(this);
		appFrame = new FlashcardFrame(this);
		presentQuestion();
	}
	
	public String presentQuestion()
	{

		String thisQuestion;
		
		thisQuestion = flashcard.getCurrentQuestion();
		
		return thisQuestion;
	}
	
//	public int questionNumber()
//	{
//		int current;
//		
//		current = flashcard.showCurrentQuestion();
//		
//		return current;
//	}
	
	public String getAnswer()
	{
		return flashcard.getAnswer();
	}
	
	
	public void askNextQuestion()
	{
		flashcard.buildCurrentQuestionNumber();
		
		presentQuestion();
	}
}
