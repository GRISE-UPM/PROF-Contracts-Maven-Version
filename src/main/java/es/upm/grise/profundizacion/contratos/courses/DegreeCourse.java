package es.upm.grise.profundizacion.contratos.courses;

import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion.contratos.values.CourseData;

@Invariant("1==2")
public class DegreeCourse extends Course {

	final private static double fee = 27.33;

	@Requires("\"DEGREE\".equals(course.getLevel())")
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
