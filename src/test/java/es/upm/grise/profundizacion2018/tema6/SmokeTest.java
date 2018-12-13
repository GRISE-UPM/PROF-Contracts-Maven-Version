package es.upm.grise.profundizacion2018.tema6;

import org.junit.BeforeClass;
import org.junit.Test;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;

import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;

public class SmokeTest {

	Registration registration = new Registration();

	@BeforeClass
	public static void initialize() {
		CourseDataValuesTest.fillCoursesForTest();
	}

	@Test
	public void creditoIncorrectoAsignatura() {
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse = new DegreeCourse(INCORRECT_DEGREE_COURSE, NUM_REGISTRATION);
		degreeCourse.getCredits();
	}

	@Test
	public void matriculaMasde6() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}

	@Test
	public void instanciaDegreeCourseConAsignaturaMaster() {
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse = new DegreeCourse(CASE_DEGREE_COURSE_WITH_MASTER, NUM_REGISTRATION);
	}

	@Test
	public void instanciaMasterCourseConAsignaturaDegree() {
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		MasterCourse masterCourse = new MasterCourse(CASE_MASTER_COURSE_WITH_DEGREE, NUM_REGISTRATION);

	}

	@Test
	public void matriculaConMasde10Asignaturas() {
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		for (int i = 0; i < CourseDataValuesTest.coursesForTest.length; i++) {
			registration.addCourse(new MasterCourse(CourseDataValuesTest.coursesForTest[i], NUM_REGISTRATION));
		}
	}

	@Test
	public void matriculaConMasDe36Creditos() {
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		for (int i = 0; i < 9; i++) {
			registration.addCourse(new MasterCourse(CourseDataValuesTest.coursesForTest[i], NUM_REGISTRATION));
		}
		registration.getTotalCredits();
	}

	@Test
	public void importeAsignaturaNoNegativoMaster() {
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		MasterCourse masterCourse = new MasterCourse(NEGATIVE_MASTER_COURSE, NUM_REGISTRATION);
		masterCourse.getFee();
	}

	@Test
	public void importeMatriculaNoNegativo() {
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		registration = new Registration();
		registration.addCourse(new DegreeCourse(NEGATIVE_DEGREE_COURSE, NUM_REGISTRATION));
		registration.addCourse(new MasterCourse(NEGATIVE_MASTER_COURSE, NUM_REGISTRATION));
		registration.getRegistrationFee();
	}
}
