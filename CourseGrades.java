// File: CourseGrades.java
// Programmer: Jennifer King
// Date: 10/6/2018

import java.util.Scanner;
import java.text.*;

public class CourseGrades implements Analyzable
{
	GradedActivity grades[];
	
	CourseGrades()
	{
		grades = new GradedActivity[4];
	}
	
	public void setLab(GradedActivity l) {grades[0] = l;}
	public void setPassFailExam(PassFailExam pfe) {grades[1] = pfe;}
	public void setEssay(Essay es) {grades[2] = es;}
	public void setFinalExam(FinalExam fe) {grades[3] = fe;}
	
	public String toString()
	{
		GradedActivity l = (GradedActivity)grades[0];
		PassFailExam pfe = (PassFailExam)grades[1];
		Essay es = (Essay)grades[2];
		FinalExam fe = (FinalExam)grades[3];
		
		String temp = "Lab Score: \t\t" + l.getScore() + "\tGrade: " + l.getGrade() + 
				"\nPass/Fail Exam Score: \t" + pfe.getScore() + "\tGrade: " + pfe.getGrade() +
				"\nEssay Score: \t\t" + es.getScore() + "\tGrade: " + es.getGrade() + 
				"\nFinal Exam Score: \t" + fe.getScore() + "\tGrade: " + fe.getGrade() +
				"\nAverage score: \t\t" + getAverage() +
				"\nHighest score: \t\t" + getHighest().getScore() +
				"\nLowest score: \t\t" + getLowest().getScore();
		
		return temp;
	}
	
	public double getAverage()
	{
		double total = 0.0;
		double average = 0.0;
		
		for(int i = 0; i < 4; i++)
		{
			total += grades[i].getScore();
		}
		
		average = total/4;
		return average;
	}
	
	public GradedActivity getHighest()
	{
		GradedActivity highest = new GradedActivity();
		highest.setScore(0);
		
		for(int i = 0; i < 4; i++)
		{
			if(grades[i].getScore() > highest.getScore())
			{
				highest = grades[i];
			}
		}
		
		return highest;
	}
	
	public GradedActivity getLowest()
	{
		GradedActivity lowest = new GradedActivity();
		lowest.setScore(100);
		
		for(int i = 0; i < 4; i++)
		{
			if(grades[i].getScore() < lowest.getScore())
			{
				lowest = grades[i];
			}
		}
		
		return lowest;
	}
	
}
