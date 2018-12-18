package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

@Invariant("getFee()>=0")
public abstract class Course implements Comparable <Course> {

	protected int numRegistrations;
	protected CourseData courseData;

	@Requires("numRegistrations>=1 && numRegistrations<=6")
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
