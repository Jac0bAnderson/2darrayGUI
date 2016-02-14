package gui.view;

import javax.swing.JFrame;
import gui.Controller.TwoDController;

public class TwoDFrame extends JFrame
{
private TwoDPanel basePanel;
private TwoDController baseController;

public TwoDFrame(TwoDController baseController)
{
	this.baseController = baseController;
	basePanel = new TwoDPanel(baseController);
	setupFrame();
}
private void setupFrame()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setContentPane(basePanel);
	this.setSize(500, 500);
	this.setResizable(false);
	this.setTitle("2D Array+GUI");
	this.setVisible(true);
}
	
	
}