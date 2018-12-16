package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class DegreeCourse extends Course {

	final private static double fee = 27.33;
	private final static String MASTER = "MASTER";

	@Requires({"!isMaster(course)"})
	public DegreeCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}

	@Override
	public double getFee() {
			return fee;
	}

	private boolean isMaster(CourseData course){
		return MASTER.equals(course.getLevel());
	}
	
}
