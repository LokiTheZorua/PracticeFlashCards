package flashcard.view;

import flashcard.controller.FlashcardController;
import javax.swing.JFrame;

public class FlashcardFrame extends JFrame
{

	private FlashcardController appController;
	private FlashcardPanel appPanel;
	
	public FlashcardFrame(FlashcardController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new FlashcardPanel(appController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("FlashCards");
		this.setSize(700, 700);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}
