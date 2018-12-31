package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.java.contract.InvariantError;
import com.google.java.contract.PostconditionError;
import com.google.java.contract.PreconditionError;

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
	
	@Test(expected = PreconditionError.class)
	public void degreeCourseWithMoreCreditsThanAllowed() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		DegreeCourse degreeCourse = new DegreeCourse(INCORRECT_DEGREE_COURSE1, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCourseWithLessCreditsThanAllowed() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		DegreeCourse degreeCourse = new DegreeCourse(INCORRECT_DEGREE_COURSE2, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCourseWithMoreCreditsThanAllowed() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		MasterCourse masterCourse = new MasterCourse(INCORRECT_MASTER_COURSE1, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCourseWithLessCreditsThanAllowed() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		MasterCourse masterCourse = new MasterCourse(INCORRECT_MASTER_COURSE2, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCourseWithMoreRegistrationsThanAllowed() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;
		
		// An exception is  raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCourseWithLessRegistrationsThanAllowed() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 0;
		
		// An exception is  raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCourseWithMoreRegistrationsThanAllowed() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;
		
		// An exception is  raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCourseWithLessRegistrationsThanAllowed() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 0;
		
		// An exception is  raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCourseInstantiatedWithMasterCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCourseInstantiatedWithDegreeCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = InvariantError.class)
	public void limitOfCoursesExceeded() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		DegreeCourse degreeCourse1 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
		DegreeCourse degreeCourse2 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE2, NUM_REGISTRATION);
		DegreeCourse degreeCourse3 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE3, NUM_REGISTRATION);
		DegreeCourse degreeCourse4 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE4, NUM_REGISTRATION);
		DegreeCourse degreeCourse5 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE5, NUM_REGISTRATION);
		DegreeCourse degreeCourse6 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE6, NUM_REGISTRATION);
		DegreeCourse degreeCourse7 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE7, NUM_REGISTRATION);
		DegreeCourse degreeCourse8 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE8, NUM_REGISTRATION);
		DegreeCourse degreeCourse9 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE9, NUM_REGISTRATION);
		DegreeCourse degreeCourse10 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE10, NUM_REGISTRATION);
		DegreeCourse degreeCourse11 = new DegreeCourse(SHORT_CORRECT_DEGREE_COURSE11, NUM_REGISTRATION);
		
		Registration reg= new Registration();
		
		reg.addCourse(degreeCourse1);
		reg.addCourse(degreeCourse2);
		reg.addCourse(degreeCourse3);
		reg.addCourse(degreeCourse4);
		reg.addCourse(degreeCourse5);
		reg.addCourse(degreeCourse6);
		reg.addCourse(degreeCourse7);
		reg.addCourse(degreeCourse8);
		reg.addCourse(degreeCourse9);
		reg.addCourse(degreeCourse10);
		reg.addCourse(degreeCourse11);
		
	}
	
	@Test(expected = InvariantError.class)
	public void limitOfCreditsExceeded() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		DegreeCourse degreeCourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
		DegreeCourse degreeCourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE2, NUM_REGISTRATION);
		DegreeCourse degreeCourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE3, NUM_REGISTRATION);
		DegreeCourse degreeCourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE4, NUM_REGISTRATION);
		DegreeCourse degreeCourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE5, NUM_REGISTRATION);
		DegreeCourse degreeCourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE6, NUM_REGISTRATION);
		DegreeCourse degreeCourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE7, NUM_REGISTRATION);
		DegreeCourse degreeCourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE8, NUM_REGISTRATION);
		
		Registration reg= new Registration();
		
		reg.addCourse(degreeCourse1);
		reg.addCourse(degreeCourse2);
		reg.addCourse(degreeCourse3);
		reg.addCourse(degreeCourse4);
		reg.addCourse(degreeCourse5);
		reg.addCourse(degreeCourse6);
		reg.addCourse(degreeCourse7);
		reg.addCourse(degreeCourse8);

	}
	
	@Test(expected = InvariantError.class)
	public void courseWithNegativeFee() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		Course course = new CourseInvalidDouble(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
		
	}
	
	@Test(expected = InvariantError.class)
	public void registrationWithNegativeFee() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 3;
		
		// An exception is  raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
        Registration registration = new RegistrationInvalidDouble();
	    registration.addCourse(masterCourse);
	}
	

}
