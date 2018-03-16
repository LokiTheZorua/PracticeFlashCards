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
	
	public void start()
	{
		appFrame = new FlashcardFrame(this);
	}
	
	
}
