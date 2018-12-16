package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.*;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class MasterCourse extends Course {
	
	final private static double feePerCredit = 35.44;

	@Requires("course.courseData.getLevel().equals(\"Degree\")")
	public MasterCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	@Requires("feePerCredit >= 0")
	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}
	
}
