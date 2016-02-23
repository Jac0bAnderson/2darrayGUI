package gui.view;

import gui.Controller.TwoDController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TwoDPanel extends JPanel
{
private SpringLayout baseLayout;	
private TwoDController baseController;
private JTable arrayTable;
private JScrollPane arrayScroll;
private JTextField rowText;
private JTextField colText;
private JButton subButton;


public TwoDPanel(TwoDController baseController)
{
this.baseController = baseController;
baseLayout = new SpringLayout();
rowText = new JTextField("");
colText = new JTextField("");
subButton = new JButton("Click to Submit");



String [] nameCol = {"Drink", "Color", "Calories"};
Object [] [] info ={
		{"Monster Energy", "Green" ,"101"},
		{"Coke", "Red", "182"},
		{"Pepsi", "Blue", "150"},
		{"", "", ""},
		{"", "", ""},
		{"", "", ""},
		{"", "", ""},
		{"", "", ""},
		{"", "", ""},
		{"", "", ""}
};

arrayScroll = new JScrollPane();

arrayTable = new JTable(info, nameCol);
arrayScroll.setViewportView(arrayTable);

arrayTable.setPreferredScrollableViewportSize(new Dimension(10,10));
arrayTable.setFillsViewportHeight(true);
arrayTable.setToolTipText("Click on a blank to add text.");

setupPanel();
setupLayout();
setupListeners();

}




private void setupPanel()
{
	this.add(subButton);
	this.add(rowText);
	this.add(colText);
	this.add(arrayScroll);
	this.setLayout(baseLayout);
	
}
private void setupLayout()
{
	baseLayout.putConstraint(SpringLayout.NORTH, arrayScroll, 65, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, arrayScroll, 98, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, arrayScroll, 236, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.EAST, arrayScroll, -85, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, arrayTable, 188, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, arrayTable, 178, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.EAST, arrayTable, -129, SpringLayout.EAST, this);

}

private void setupListeners()
{
	
	
}

}
