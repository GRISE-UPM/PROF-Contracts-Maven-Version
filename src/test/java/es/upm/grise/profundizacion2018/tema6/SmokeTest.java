package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.java.contract.PreconditionError;

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
	@Test(expected = PreconditionError.class)
	public void registrationover6() {
		int NUM_REGISTRATION = 12;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void registrationunder1() {
		int NUM_REGISTRATION = -2;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void failMoreThan6Credits() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(INCORRECT_MASTER_COURSE_MORE_CREDITS, NUM_REGISTRATION);
	}
	@Test
	public void notFailWithCorrectCredits() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(INCORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void failInstanceDegreeWithMaster() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(INCORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void failInstanceMasterWithDegree() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(INCORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	
	@Test(expected = PreconditionError.class)
	public void failMoreThan36Credits(){
		int NUM_REGISTRATION = 1;
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_1, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_2, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_3, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_4, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_5, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_7, NUM_REGISTRATION));
	}
	@Test(expected = PreconditionError.class)
	public void failMoreThan10Subjects(){
		int NUM_REGISTRATION = 1;
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_8, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_9, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_10, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_11, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_12, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_13, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_14, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_15, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_16, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_17, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_18, NUM_REGISTRATION));
		
	}
}
