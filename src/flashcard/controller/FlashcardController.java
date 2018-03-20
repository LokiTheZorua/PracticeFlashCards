package flashcard.controller;

import flashcard.view.FlashcardFrame;
import flashcard.model.Flashcard;

public class FlashcardController
{
	private FlashcardFrame appFrame;
	private Flashcard flashcard;
	
	public FlashcardController()
	{
		flashcard = new Flashcard("This");
	}
	
	private int questionsAnswered;
	
	public void start()
	{
		appFrame = new FlashcardFrame(this);
	}
	
	public void useFlashcards(String answer)
	{
		boolean correct;
		questionsAnswered++;
		
		correct = flashcard.checkCorrectAnswer(answer);
		
		flashcard.correctPercent(correct);
		
		
		
		if (questionsAnswered == flashcard.getQuestionListSize())
		{
			if (flashcard = 100)
		}
	}
	
}
