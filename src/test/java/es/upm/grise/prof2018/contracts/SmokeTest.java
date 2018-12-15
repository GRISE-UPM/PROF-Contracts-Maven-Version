package es.upm.grise.prof2018.contracts;

import static es.upm.grise.prof2018.contracts.CourseDataValuesTest.*;
import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.prof2018.contracts.course.DegreeCourse;
import es.upm.grise.prof2018.contracts.course.MasterCourse;
import es.upm.grise.prof2018.contracts.values.CourseData;

import com.google.java.contract.PreconditionError;
import com.google.java.contract.InvariantError;
import com.google.java.contract.PostconditionError;

public class SmokeTest {
	
	// Las asignaturas deben tener entre 1 y 6 créditos ECTS
	@Test(expected = PreconditionError.class)
	public void tooManyCreditsCourse() {
		DegreeCourse degreeCourse = new DegreeCourse(DEGREE_COURSE_TOO_MANY_CREDITS, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void noCreditsCourse() {
		DegreeCourse degreeCourse = new DegreeCourse(DEGREE_COURSE_NO_CREDITS, 1);
	}
	
	// Un alumno puede matricularse entre 1 y 6 veces en la misma asignatura como máximo.
	@Test(expected = InvariantError.class)
	public void tooMuchRegistrations() {
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, 8);
	}
	
	// No se puede instanciar una clase DegreeCourse con una asignatura de master (el tipo está definido en la enumeración CourseData).
	@Test(expected = PreconditionError.class)
	public void instanceDegreeWithMaster() {
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, 5);
	}
	
	// No se puede instanciar una clase MasterCourse con una asignatura de grado.
	@Test(expected = PreconditionError.class)
	public void instanceMasterWithDegree() {
		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, 3);
	}
	
	// Una matrícula puede contener 10 asignaturas como máximo.
	@Test(expected = InvariantError.class)
	public void registrationWithMoreThan10Courses() {
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_2, 2));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_3, 4));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_4, 3));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_5, 6));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6, 5));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_7, 2));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_8, 3));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_9, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_10, 4));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_11, 2));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_12, 1));
	}
	
	// Una matrícula no puede contener más de 36 ECTS.
	@Test(expected = PostconditionError.class)
	public void registrationWithMoreThan36Credits() {
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6CREDITS, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6CREDITS_2, 2));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6CREDITS_3, 4));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6CREDITS_4, 3));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6CREDITS_5, 6));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6CREDITS_6, 5));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 2));
	}
	
	// El importe de una asignatura no puede ser negativo.
	public class DegreeCourseNegative extends DegreeCourse {
		public DegreeCourseNegative(CourseData course, int numRegistrations) {
			super(course, numRegistrations);
		}
		
		@Override
		public double getFee() {
			return -1;
		}
	}
	
	@Test(expected = PostconditionError.class)
	public void instanceDegreeNegativeFee() {
		DegreeCourse degreeCourse = new DegreeCourseNegative(CORRECT_DEGREE_COURSE, 3);
		degreeCourse.getFee();
	}
	
	// El importe de la matrícula no puede ser negativo.
	@Test(expected = PostconditionError.class)
	public void registrationNegativeFee() {
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourseNegative(CORRECT_DEGREE_COURSE, 3));
		registration.getRegistrationFee();
	}

}
