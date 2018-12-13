package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class MasterCourse extends Course {
	
	final static double feePerCredit = 35.44;

	@Requires("course.getLevel().equals(\"MASTER\")")
	@Ensures({"getCredits() >= 1", "getCredits() <= 6"})
	public MasterCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}
	
}
