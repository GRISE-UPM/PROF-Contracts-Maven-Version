package es.upm.grise.profundizacion.contratos.courses;

import es.upm.grise.profundizacion.contratos.values.CourseData;

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
	
	public int getCredits() {
		return courseData.getCredits();
	}
	
	@Override
	public int compareTo(Course course) {
		return courseData.getName().compareTo(course.getName());
	}
	
}
