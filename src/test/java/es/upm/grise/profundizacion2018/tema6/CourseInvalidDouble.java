package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.course.Course;
import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class CourseInvalidDouble extends Course{

	final private static double feePerCredit = -35.44;
	
	public CourseInvalidDouble(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
		
	}

	@Override
	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}

}
