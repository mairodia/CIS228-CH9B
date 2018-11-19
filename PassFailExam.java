// File: PassFailExam.java
// Programmer: Jennifer King
// Date: 10/6/2018

public class PassFailExam extends PassFailActivity
{
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public PassFailExam(int questions, int missed, double minPassing)
	{
		super(minPassing);
		double numericScore;
		
		numQuestions = questions;
		numMissed = missed;
		
		pointsEach = 1.0;
		numericScore = numQuestions - (missed * pointsEach);
		numericScore = numericScore*10;
		
		setScore(numericScore);
	}
	
	public double getPointsEach() {return pointsEach;}
	public int getNumMissed() {return numMissed;}
}
