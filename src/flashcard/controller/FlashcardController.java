package flashcard.controller;

import flashcard.view.FlashcardFrame;
import flashcard.model.Flashcard;


public class FlashcardController
{
	private FlashcardFrame appFrame;
	private FlashCard flashcard;
	
	public FlashcardController()
	{
		flashcard = new FlashCard("This");
	}
	
	public void start()
	{
		appFrame = new FlashcardFrame(this);
	}
	
	
}
