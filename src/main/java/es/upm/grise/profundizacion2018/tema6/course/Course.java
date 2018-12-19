package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;


public abstract class Course implements Comparable <Course> {

	protected int numRegistrations;
	protected CourseData courseData;

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
	
	@Ensures({
		"courseData.getCredits() > 0 && courseData.getCredits() <=6"
	})
	public int getCredits() {
		return courseData.getCredits();
	}
	
	@Override
	public int compareTo(Course course) {
		return courseData.getName().compareTo(course.getName());
	}
	
}
