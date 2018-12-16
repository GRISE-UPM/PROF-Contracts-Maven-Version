package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import com.google.java.contract.PreconditionError;
import org.junit.Test;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;
import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;

public class SmokeTest {

	//-ea -javaagent:"/Users/joseluiscastanon/Desktop/MUII/Prof Ingenieria Software/Individual/PROF-Contracts/lib/cofoja-2.0.0.jar"

	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}


	@Test(expected = PreconditionError.class)
	public void matLessThan1(){
		new DegreeCourse(CORRECT_DEGREE_COURSE, 0);
	}

	@Test(expected = PreconditionError.class)
	public void matHigherThan6(){
		new DegreeCourse(CORRECT_DEGREE_COURSE, 7);
	}



}
