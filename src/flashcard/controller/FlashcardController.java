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
<<<<<<< HEAD
		boolean correct;
		questionsAnswered++;
		
		correct = flashcard.checkCorrectAnswer(answer);
		
		flashcard.correctPercent();
	}
	
	public double transferPercent()
	{
		double percent;
		
		percent = flashcard.correctPercent();
		
		return percent;
=======
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
>>>>>>> f917dff6cfe90b760bfe3dd847598d777fbc1646
	}
	
}
