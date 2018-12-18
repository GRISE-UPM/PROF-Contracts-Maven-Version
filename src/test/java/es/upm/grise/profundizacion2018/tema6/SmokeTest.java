package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import org.junit.Test;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;

import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;

import com.google.java.contract.PostconditionError;
import com.google.java.contract.PreconditionError;
import com.google.java.contract.InvariantError;

public class SmokeTest {

	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	@Test
	public void newDegreeCourseWithCorrectCredits() {
		int NUM_REGISTRATION = 1;
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = InvariantError.class)
	public void newDegreeCourseWithoutCredits() {
		int NUM_REGISTRATION = 1;
		new DegreeCourse(DEGREE_COURSE_0_CREDITS, NUM_REGISTRATION);
	}
	@Test(expected = InvariantError.class)
	public void newDegreeCourseWithTooMuchCredits() {
		int NUM_REGISTRATION = 1;
		new DegreeCourse(DEGREE_COURSE_7_CREDITS, NUM_REGISTRATION);
	}

	@Test
	public void newMasterCourseWithCorrectCredits() {
		int NUM_REGISTRATION = 1;
		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = InvariantError.class)
	public void newMasterCourseWithoutCredits() {
		int NUM_REGISTRATION = 1;
		new MasterCourse(MASTER_COURSE_0_CREDITS, NUM_REGISTRATION);
	}
	@Test(expected = InvariantError.class)
	public void newMasterCourseWithTooMuchCredits() {
		int NUM_REGISTRATION = 1;
		new MasterCourse(MASTER_COURSE_7_CREDITS, NUM_REGISTRATION);
	}
	
	@Test
	public void newRegistrationDegreeWithCorrectRegistrations() {
		int NUM_REGISTRATION = 1;
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void newRegistrationDegreeWithTooMuchRegistrations() {
		int NUM_REGISTRATION = 7;
		new DegreeCourse(DEGREE_COURSE_0_CREDITS, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void newRegistrationDegreeWithTooLessRegistrations() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(DEGREE_COURSE_0_CREDITS, NUM_REGISTRATION);
	}
	
	@Test
	public void newRegistrationMasterWithCorrectRegistrations() {
		int NUM_REGISTRATION = 1;
		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void newRegistrationMasterWithTooMuchRegistrations() {
		int NUM_REGISTRATION = 7;
		new MasterCourse(MASTER_COURSE_0_CREDITS, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void newRegistrationMasterWithTooLessRegistrations() {
		int NUM_REGISTRATION = 0;
		new MasterCourse(MASTER_COURSE_0_CREDITS, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void newDegreeWithMasterDeclarationError() {
		int NUM_REGISTRATION = 1;
		new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	@Test(expected = PreconditionError.class)
	public void newMasterWithDegreeDeclarationError() {
		int NUM_REGISTRATION = 1;
		new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	@Test
	public void registrationWithCorrectNumberOfRegistrations() {
		Registration regis = new Registration();
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_2, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_3, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_4, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_5, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_7, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_8, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_9, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_10, 1));
	}
	@Test(expected = PostconditionError.class)
	public void registrationWithMoreThanTenShouldFail() {
		Registration regis = new Registration();
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_2, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_3, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_4, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_5, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_7, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_8, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_9, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_10, 1));
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_11, 1));
	}
	@Test(expected = InvariantError.class)
	public void registrationWithMoreCreditsShouldFail() {
		Registration regis = new Registration();
		regis.addCourse(new MasterCourse(CORRECT_MASTER_COURSE_1, 1));
		regis.addCourse(new MasterCourse(CORRECT_MASTER_COURSE_2, 1));
		regis.addCourse(new MasterCourse(CORRECT_MASTER_COURSE_3, 1));
		regis.addCourse(new MasterCourse(CORRECT_MASTER_COURSE_4, 1));
		regis.addCourse(new MasterCourse(CORRECT_MASTER_COURSE_5, 1));
		regis.addCourse(new MasterCourse(CORRECT_MASTER_COURSE_6, 1));
		regis.addCourse(new MasterCourse(CORRECT_MASTER_COURSE_7, 1));

	}

	@Test(expected = InvariantError.class)
	public void newTestWithNegativeFeeShouldFail() { 
		
		TestMasterCourse test = new TestMasterCourse(CORRECT_MASTER_COURSE_1, 1,-1);
		
		
	}
	@Test(expected = InvariantError.class)
	public void newTestWithNegativeFeeShouldFailRegistration() { 
		TestRegistration regis = new TestRegistration();
		regis.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1));
		
	}
	
	
	

}
