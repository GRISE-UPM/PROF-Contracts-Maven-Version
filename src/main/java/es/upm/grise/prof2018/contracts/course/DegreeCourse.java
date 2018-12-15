package es.upm.grise.prof2018.contracts.course;

import com.google.java.contract.Requires;

import es.upm.grise.prof2018.contracts.values.CourseData;

public class DegreeCourse extends Course {

	final private static double fee = 27.33;

	@Requires({"course.getLevel() != \"MASTER\"","course.getCredits() >= 1", "course.getCredits() <= 6"})
	public DegreeCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}

	@Override
	public double getFee() {
		if (numRegistrations == 1)
			return 0;
		else
			return fee;
	}
	
}
