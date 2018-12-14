package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import com.google.java.contract.PreconditionError;
import org.junit.Test;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;
import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;

public class SmokeTest {


	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		int NUM_REGISTRATION = 1;
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void shouldFailWhenNumRegistrationIsLessThanOne() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void shouldFailWhenNumRegistrationIsGreaterThanSix() {
		int NUM_REGISTRATION = 7;
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void shouldFailWhenDegreeCourseIsInstantiatedWithMaster() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(INCORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void shouldFailWhenMasterCourseIsInstantiatedWithDegree() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(INCORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void shouldFailWhenDegreeCourseHasMoreCredits() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(INCORRECT_DEGREE_COURSE_MORE_CREDITS, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void shouldFailWhenMasterCourseHasMoreCredits() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(INCORRECT_MASTER_COURSE_MORE_CREDITS, NUM_REGISTRATION);
	}
	@Test
	public void shouldRegisterOk(){
		int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
		Registration registration = new Registration();
		registration.addCourse(degreeCourse);
	}
	@Test(expected = PreconditionError.class)
	public void shouldFailRegisterWhenCreditsExceedsLimit(){
		int NUM_REGISTRATION = 1;
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_1, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_2, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_3, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_4, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_5, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_7, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_8, NUM_REGISTRATION));
	}

	@Test(expected = PreconditionError.class)
	public void shouldFailRegisterWhenNumberOfSignaturesExceedsLimit(){
		int NUM_REGISTRATION = 1;
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_1, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_2, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_3, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_4, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_5, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_6, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_7, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_8, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_9, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_10, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE_11, NUM_REGISTRATION));
	}


}
