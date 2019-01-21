package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import org.junit.Test;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;

import es.upm.grise.profundizacion2018.tema6.course.Course;
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
	public void test1() {
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, 2378);
		System.out.println(degreeCourse.getFee());
	}
	
	@Test
	public void test2() {
		Registration r = new Registration();
		r.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 1));
		r.addCourse(new DegreeCourse(ANOHTER_CORRECT_DEGREE_COURSE, 2));
		r.addCourse(new DegreeCourse(MATHS, 1));
		r.addCourse(new DegreeCourse(PROG, 1));
		r.addCourse(new DegreeCourse(PROG2, 1));
		System.out.println(r.courses.size());
		r.addCourse(new DegreeCourse(LOGIC, 1));
		System.out.println(r.courses.size());
	}

}
