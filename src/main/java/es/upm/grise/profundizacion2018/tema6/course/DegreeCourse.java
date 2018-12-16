package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class DegreeCourse extends Course {

	final private static double fee = 27.33;
	
	@Requires("course.getLevel().equals(\"DEGREE\")")
	@Ensures({"getCredits() >= 1", "getCredits() <= 6", "getFee() >= 0"})
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
