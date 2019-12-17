package es.upm.grise.profundizacion.contratos;

import org.junit.Test;
import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;

public class SmokeTest {

	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}

}
