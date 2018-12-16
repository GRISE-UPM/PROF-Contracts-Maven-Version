package es.upm.grise.profundizacion2018.tema6;

import com.google.java.contract.PreconditionError;

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
	
	/*@Test
	public void degreeCoursesCanNotBeInstantiatedWithMASTERlevel() {
		
		int NUM_REGISTRATION = 1;

		// An exception should be raised
		DegreeCourse masterCourse = new DegreeCourse(MASTER_COURSE, NUM_REGISTRATION);
	}*/

}
