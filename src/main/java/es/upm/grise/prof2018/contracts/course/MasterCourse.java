package es.upm.grise.prof2018.contracts.course;

import com.google.java.contract.Requires;

import es.upm.grise.prof2018.contracts.values.CourseData;

public class MasterCourse extends Course {
	
	final private static double feePerCredit = 35.44;

	@Requires({"course.getLevel() != \"DEGREE\"","course.getCredits() >= 1", "course.getCredits() <= 6"})
	public MasterCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}
	
}
