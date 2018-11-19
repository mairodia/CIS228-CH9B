// File: GradesDemo.java
// Programmer: Jennifer King
// Date: 10/7/2018

public class GradesDemo 
{
	public static void main(String arg[])
	{
		GradedActivity lab = new GradedActivity();
		lab.setScore(85);
		
		PassFailExam pfe = new PassFailExam(10, 3, 7.0);
		
		Essay es = new Essay();
		es.setScore(30, 10, 10, 30);

		FinalExam fe = new FinalExam(50, 10);
		
		CourseGrades grades = new CourseGrades();
		
		grades.setLab(lab);
		grades.setPassFailExam(pfe);
		grades.setEssay(es);
		grades.setFinalExam(fe);
		
		System.out.println(grades.toString());
	}
}
