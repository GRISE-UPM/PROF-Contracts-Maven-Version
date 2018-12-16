package es.upm.grise.profundizacion2018.tema6;

import com.google.java.contract.PreconditionError;
import com.google.java.contract.PostconditionError;

import static org.junit.Assert.*;

import org.junit.Test;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;
import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;
import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class SmokeTest {

	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void registrationNumberUnderOne(){
		int NUM_REGISTRATION = 0;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void registrationNumberHigherThanSix(){
		int NUM_REGISTRATION = 7;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void degreeCoursesCanNotBeInstantiatedWithMASTERlevel() {
		
		int NUM_REGISTRATION = 1;

		// An exception should be raised
		DegreeCourse masterCourse = new DegreeCourse(MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void masterCoursesCanNotBeInstantiatedWithDEGREElevel() {
		
		int NUM_REGISTRATION = 1;

		// An exception should be raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void courseShouldNotHaveZeroCredits() {
		
		int NUM_REGISTRATION = 1;

		// An exception should be raised
		MasterCourse masterCourse = new MasterCourse(COURSE_ZERO_CREDITS, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void courseShouldNotExceedSixCredits() {
		
		int NUM_REGISTRATION = 1;

		// An exception should be raised
		MasterCourse masterCourse = new MasterCourse(COURSE_TOO_MUCH_CREDITS, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void shouldntAllowMoreThanTenCourses(){
		Registration reg = new Registration();
		int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE1, NUM_REGISTRATION);
		DegreeCourse degreeCourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE2, NUM_REGISTRATION);
		DegreeCourse degreeCourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE3, NUM_REGISTRATION);
		DegreeCourse degreeCourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE4, NUM_REGISTRATION);
		DegreeCourse degreeCourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE5, NUM_REGISTRATION);
		DegreeCourse degreeCourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE6, NUM_REGISTRATION);
		DegreeCourse degreeCourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE7, NUM_REGISTRATION);
		DegreeCourse degreeCourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE8, NUM_REGISTRATION);
		DegreeCourse degreeCourse9 = new DegreeCourse(CORRECT_DEGREE_COURSE9, NUM_REGISTRATION);
		DegreeCourse degreeCourse10 = new DegreeCourse(CORRECT_DEGREE_COURSE10, NUM_REGISTRATION);
		DegreeCourse degreeCourse11 = new DegreeCourse(CORRECT_DEGREE_COURSE11, NUM_REGISTRATION);

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

	@Test (expected = PostconditionError.class)
	public void shouldntAllowMoreThanLimitCredits(){
		Registration reg = new Registration();
		int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE1, NUM_REGISTRATION);
		DegreeCourse degreeCourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE2, NUM_REGISTRATION);
		DegreeCourse degreeCourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE3, NUM_REGISTRATION);
		DegreeCourse degreeCourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE4, NUM_REGISTRATION);
		DegreeCourse degreeCourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE5, NUM_REGISTRATION);
		DegreeCourse degreeCourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE6, NUM_REGISTRATION);
		DegreeCourse degreeCourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE7, NUM_REGISTRATION);
		DegreeCourse degreeCourse12 = new DegreeCourse(CORRECT_DEGREE_COURSE12, NUM_REGISTRATION);
		DegreeCourse degreeCourse11 = new DegreeCourse(CORRECT_DEGREE_COURSE11, NUM_REGISTRATION);

		reg.addCourse(degreeCourse1);
		reg.addCourse(degreeCourse2);
		reg.addCourse(degreeCourse3);
		reg.addCourse(degreeCourse4);
		reg.addCourse(degreeCourse5);
		reg.addCourse(degreeCourse6);
		reg.addCourse(degreeCourse7);
		reg.addCourse(degreeCourse11);
		reg.addCourse(degreeCourse12);
	}
	
	class DegreeCourseDouble extends DegreeCourse {

		final private static double fee = -10;
		
		public DegreeCourseDouble(CourseData course, int numRegistrations) {
			super(course, numRegistrations);
			// TODO Auto-generated constructor stub
		}

		@Override
		public double getFee() {
			return fee;
		}
		
	}
	
	@Test(expected = PostconditionError.class)
	public void courseShouldntHaveNegativeFee() {		
		DegreeCourseDouble dcd = new DegreeCourseDouble(CORRECT_DEGREE_COURSE, 1);
	}
	
class RegistrationDouble extends Registration {		
		@Override
		public double getRegistrationFee() {
			return -10;
		}		
	}
	
	@Test(expected = PostconditionError.class)
	public void registrationShouldntHaveNegativeFee() {		
		RegistrationDouble registration = new RegistrationDouble();
		DegreeCourse degree_course = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		registration.addCourse(degree_course);
	}
}
