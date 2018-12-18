package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.course.Course;
import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class InvalidCourse extends Course {
	
	final private static double feePerCredit = -20;


	public InvalidCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}
	
}
