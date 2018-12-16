package es.upm.grise.profundizacion2018.tema6.course;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

import com.google.java.contract.Requires;
import com.google.java.contract.Ensures;

public abstract class Course implements Comparable <Course> {

	protected int numRegistrations;
	protected CourseData courseData;

	@Requires({"numRegistrations > 0", "numRegistrations < 7"})
	@Ensures("getFee() >= 0")
	public Course(int numRegistrations) {
		this.numRegistrations = numRegistrations;
	}
	
	public String getLevel() {
		return courseData.getLevel();
	}
	
	public abstract double getFee();

	public String getName() {
		return courseData.getName();
	}
	
	public int getCredits() {
		return courseData.getCredits();
	}
	
	@Override
	public int compareTo(Course course) {
		return courseData.getName().compareTo(course.getName());
	}
	
}
