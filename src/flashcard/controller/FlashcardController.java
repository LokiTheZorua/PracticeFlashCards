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
	
	public void useFlashcards(String answer)
	{
		boolean correct;
		questionsAnswered++;
		
		correct = flashcard.checkCorrectAnswer(answer);
		
		flashcard.correctPercent(correct);
	}
	
}
