package es.upm.grise.profundizacion2018.tema6;

import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.course.Course;
import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class TestMasterCourse extends Course {

	double feePerCredit = 35.44;
	
	@Requires("course.getLevel().equals(\"MASTER\")")
	public TestMasterCourse(CourseData course, int numRegistrations,int fee) {
		super(numRegistrations);
		this.courseData = course;
		this.feePerCredit=fee;
	}
	
	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}
}
