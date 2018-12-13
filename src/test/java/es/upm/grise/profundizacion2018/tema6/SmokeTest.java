package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.java.contract.PostconditionError;
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
		new MasterCourse(CORRECT_DEGREE_COURSE, 7);
	}
	
	@Test(expected = PreconditionError.class)
	public void studentCannotRegisterACoureLessThanOneTimes() {
		new MasterCourse(CORRECT_DEGREE_COURSE, 0);
	}

}
