package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.*;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class DegreeCourse extends Course {

	final private static double fee = 27.33;
	private final static String MASTER = "MASTER";

	@Requires("!course.getLevel().equals(MASTER)")
	public DegreeCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	@Ensures("fee >= 0")
	@Override
	public double getFee() {
		if (numRegistrations == 1)
			return 0;
		else
			return fee;
	}
}
