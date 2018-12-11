package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import org.junit.Test;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;
import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;

public class SmokeTest {

	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	
	
	
	
	
	@Test
	public void creditoIncorrectoAsignatura() {
		DegreeCourse degreeCourse = new DegreeCourse(INCORRECT_DEGREE_COURSE, 1);
	}
	
	@Test
	public void matriculaMasde6() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test
	public void instanciaDegreeCourseConAsignaturaMaster() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 6;
		DegreeCourse degreeCourse = new DegreeCourse(CASE_DEGREE_COURSE_WITH_MASTER, NUM_REGISTRATION);
	}

}
