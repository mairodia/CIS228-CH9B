// File: Essay.java
// Programmer: Jennifer King
// Date: 10/6/2018

public class Essay extends GradedActivity
{
	private double grammar;
	private double spelling;
	private double length;
	private double content;
	
	public void setScore(double g, double s, double l, double c)
	{
		setGrammar(g);
		setSpelling(s);
		setLength(l);
		setContent(c);
		super.setScore(grammar + spelling + length + content);
	}
	
	private void setGrammar(double g) {grammar = g;}
	private void setSpelling(double s) {spelling = s;}
	private void setLength(double l) {length = l;}
	private void setContent(double c) {content = c;}
	
	public double getScore()
	{
		return grammar + spelling + length + content;
	}
}
