package es.upm.grise.profundizacion2018.tema6;

import org.junit.Test;

import com.google.java.contract.InvariantError;
import com.google.java.contract.PostconditionError;
import com.google.java.contract.PreconditionError;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;
import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;
import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class SmokeTest {
	
	class MasterCourseDouble extends MasterCourse {
		
		private double feePerCredit;
		
		public MasterCourseDouble(CourseData course, int numRegistrations, double feePerCredit) {
			super(course, numRegistrations);
			this.feePerCredit = feePerCredit;
		}
		
		@Override
		public double getFee() {
			return feePerCredit * courseData.getCredits() * numRegistrations;
		}
		
	}
	
	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;		
		// An exception is not raised
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PostconditionError.class)
	public void degreeCourseWithLessThanOneCreditShouldFail() {
		new DegreeCourse(CURSO_GRADO_0_CREDITOS, 1);
	}
	
	@Test(expected = PostconditionError.class)
	public void masterCourseWithLessThanOneCreditShouldFail() {
		new MasterCourse(CURSO_MASTER_0_CREDITOS, 1);
	}
	
	@Test(expected = PostconditionError.class)
	public void degreeCourseWithMoreThanSixCreditShouldFail() {
		new DegreeCourse(CURSO_GRADO_7_CREDITOS, 1);
	}
	
	@Test(expected = PostconditionError.class)
	public void masterCourseWithMoreThanSixCreditShouldFail() {
		new MasterCourse(CURSO_MASTER_7_CREDITOS, 1);
	}
	
	
	@Test(expected = PreconditionError.class)
	public void studentCannotRegisterACoureMoreThanSixTimes() {
		new MasterCourse(CORRECT_MASTER_COURSE, 7);
	}
	
	@Test(expected = PreconditionError.class)
	public void studentCannotRegisterACoureLessThanOneTimes() {
		new MasterCourse(CORRECT_MASTER_COURSE, 0);
	}
	
	
	@Test(expected = PreconditionError.class)
	public void cannotRegisterMasterCourseAsDegreeCourse() {
		new DegreeCourse(CORRECT_MASTER_COURSE, 2);
	}
	
	@Test(expected = PreconditionError.class)
	public void cannotRegisterDegreeCourseAsMasterCourse() {
		new MasterCourse(CORRECT_DEGREE_COURSE, 2);
	}
	
	
	@Test(expected = PreconditionError.class)
	public void cannotHaveMoreThanTenCoursesInARegistration() {
		Registration r = new Registration();
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE0, 3));
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE1, 3));	
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE2, 3));	
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE3, 3));	
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE4, 3));	
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE5, 3));	
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE6, 3));	
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE7, 3));	
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE8, 3));	
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE9, 3));	
		r.addCourse(new MasterCourse(CORRECT_MASTER_COURSE10, 3));	
	}
	
	
	@Test(expected = InvariantError.class)
	public void registrationCreditsHaveToBeLessThanThirtySeven() {
		Registration r = new Registration();
		r.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE0, 3));
		r.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE1, 3));
		r.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE2, 3));
		r.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE3, 3));
		r.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE4, 3));
		r.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE5, 3));	
		r.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE6, 3));	
	}
	
	
	@Test(expected = InvariantError.class)
	public void courseFeeCannotBeNegative() {
		new MasterCourseDouble(CORRECT_MASTER_COURSE0, 3, -5);	
	}

}
