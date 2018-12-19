package es.upm.grise.profundizacion2018.tema6;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.CORRECT_DEGREE_COURSE;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.CORRECT_MASTER_COURSE;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.INCORRECT_DEGREE_COURSE_EXCESIVE_CREDITS;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.INCORRECT_DEGREE_COURSE_ZERO_CREDITS;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE10_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE11_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE12_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE1_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE1_6_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE2_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE2_6_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE3_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE3_6_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE4_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE4_6_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE5_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE5_6_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE6_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE6_6_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE7_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE7_6_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE8_1_CRED;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.TEST_COURSE9_1_CRED;
import static org.assertj.core.api.Assertions.assertThat;

import com.google.java.contract.PostconditionError;
import com.google.java.contract.PreconditionError;

import org.junit.Test;

import es.upm.grise.profundizacion2018.tema6.course.Course;
import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;
import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class SmokeTest {

	@Test(expected = Test.None.class)
	public void degreeCoursesCanBeInstantiatedCorrectly() {
		
		int NUM_REGISTRATION = 1;
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCantBeInstantiatedWithLessThan1NUM_REGISTRATION() {
		
		int NUM_REGISTRATION = 0;
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCantBeInstantiatedWithMoreThan6NUM_REGISTRATION() {
		
		int NUM_REGISTRATION = 7;
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = Test.None.class)
	public void masterCoursesCanBeInstantiatedCorrectly() {
		
		int NUM_REGISTRATION = 1;
		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCantBeInstantiatedWithLessThan1NUM_REGISTRATION() {
		
		int NUM_REGISTRATION = 0;
		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCantBeInstantiatedWithMoreThan6NUM_REGISTRATION() {
		
		int NUM_REGISTRATION = 7;
		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PostconditionError.class)
	public void degreeCoursesCantBeInstantiatedWithLessThan1Credits() {
		
		int NUM_REGISTRATION = 1;
		new DegreeCourse(INCORRECT_DEGREE_COURSE_ZERO_CREDITS, NUM_REGISTRATION);
	}
	
	@Test(expected = PostconditionError.class)
	public void degreeCoursesCantBeInstantiatedWithMoreThan6Credits() {
		
		int NUM_REGISTRATION = 1;
		new DegreeCourse(INCORRECT_DEGREE_COURSE_EXCESIVE_CREDITS, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCantBeInstantiatedWithLessThan1Credits() {
		
		int NUM_REGISTRATION = 1;
		new MasterCourse(INCORRECT_DEGREE_COURSE_ZERO_CREDITS, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCantBeInstantiatedWithMoreThan6Credits() {
		
		int NUM_REGISTRATION = 1;
		new MasterCourse(INCORRECT_DEGREE_COURSE_EXCESIVE_CREDITS, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCantBeInstantiatedWithMASTERLevel() {
		
		int NUM_REGISTRATION = 1;
		new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = Test.None.class)
	public void registrationAddCourseCorrectly() {
		
		Registration registration = new Registration();
		Course course = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		registration.addCourse(course);
		
		assertThat(registration.getRegistrationFee()).isEqualTo(course.getFee());
		assertThat(registration.getTotalCredits()).isEqualTo(course.getCredits());
		assertThat(registration.getNumberCourses()).isEqualTo(1);
	}
	
	@Test(expected = PreconditionError.class)
	public void registrationErrorWhenAdding11thCourse() {
		
		Registration registration = new Registration();
		
		registration.addCourse(new DegreeCourse(TEST_COURSE1_1_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE2_1_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE3_1_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE4_1_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE5_1_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE6_1_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE7_1_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE8_1_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE9_1_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE10_1_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE11_1_CRED, 6));
        registration.addCourse(new DegreeCourse(TEST_COURSE12_1_CRED, 6));
	}
	
	@Test(expected = PreconditionError.class)
	public void registrationErrorWhenAddingMoreThan36ECTS() {
		
		Registration registration = new Registration();
		
		registration.addCourse(new DegreeCourse(TEST_COURSE1_6_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE2_6_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE3_6_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE4_6_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE5_6_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE6_6_CRED, 6));
		registration.addCourse(new DegreeCourse(TEST_COURSE7_6_CRED, 1));
	}
	
	class DegreeCourseNegativeFeeTest extends DegreeCourse {

		final private static double fee = -1;
		
		public DegreeCourseNegativeFeeTest(CourseData course, int numRegistrations) {
			super(course, numRegistrations);
		}
		
		@Override
		public double getFee() {
			return fee;
		}
		
	}
	
	@Test(expected = PostconditionError.class)
	public void courseCantHaveNegativeFee() {
		
		new DegreeCourseNegativeFeeTest(CORRECT_DEGREE_COURSE, 2);
	}
	
	class RegistrationNegativeFeeTest extends Registration {
		
		@Override
		public double getRegistrationFee() {
			return -1;
		}
		
	}
	
	@Test(expected = PreconditionError.class)
	public void registrationCantHaveNegativeFee() {
		
		Registration registration = new RegistrationNegativeFeeTest();
		
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 6));
	}
}
