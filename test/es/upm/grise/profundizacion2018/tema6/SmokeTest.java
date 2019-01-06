package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import org.junit.Test;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;
import com.google.java.contract.*;

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
	
	@Test
	public void masterCoursesCanBeInstantiatedWithMasterLevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		MasterCourse MCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}

	@Test(expected = PostconditionError.class)
	public void asignMenor1() {
		int NUM_REGISTRATION = 1;
		DegreeCourse course = new DegreeCourse(BAD_DEGREE_COURSE0,NUM_REGISTRATION);
	}
	
	@Test(expected = PostconditionError.class)
	public void asignMayor6() {
		int NUM_REGISTRATION = 1;
		DegreeCourse course = new DegreeCourse(BAD_DEGREE_COURSE7,NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void regMenor1() {
		int NUM_REGISTRATION = 0;
		DegreeCourse course = new DegreeCourse(CORRECT_DEGREE_COURSE,NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void regMayor6() {
		int NUM_REGISTRATION = 7;
		DegreeCourse course = new DegreeCourse(CORRECT_DEGREE_COURSE,NUM_REGISTRATION);
	}

	@Test(expected = PreconditionError.class)
	public void noMasterOnDegreeCourse() {
		int NUM_REGISTRATION = 1;
		DegreeCourse course = new DegreeCourse(CORRECT_MASTER_COURSE,NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void noDegreeOnMasterCourse() {
		int NUM_REGISTRATION = 1;
		MasterCourse course = new MasterCourse(CORRECT_DEGREE_COURSE,NUM_REGISTRATION);
	}
	
	@Test
	public void RegistrationCorrect() {
		int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
		Registration reg = new Registration();
		reg.addCourse(degreeCourse);
		assertTrue(reg.getRegistrationFee() == degreeCourse.getFee());
		assertEquals(reg.getTotalCredits(), degreeCourse.getCredits());
		assertEquals(reg.getNumberCourses(), 1);
	}

	@Test(expected = PreconditionError.class)
	public void RegMasDe36() {
		int NUM_REGISTRATION = 1;
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_COURSE6_1,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE6_2,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE6_3,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE6_4,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE6_5,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE6_6,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE6_7,NUM_REGISTRATION));
	}
	
	@Test(expected = PreconditionError.class)
	public void RegMasDe10Courses() {
		int NUM_REGISTRATION = 1;
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_COURSE1,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE2,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE3,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE4,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE5,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE6,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE7,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE8,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE9,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE10,NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_COURSE11,NUM_REGISTRATION));
	}
	
	class CourseDouble extends DegreeCourse {
		private double feePerCredit;

		public CourseDouble(CourseData course, int numRegistrations) {
			super(course, numRegistrations);
			this.feePerCredit = -1;
		}

		@Override
		public double getFee() {
			return feePerCredit;
		}
	}
	
	@Test(expected = PostconditionError.class)
	public void coursesFeeNeg() {
		int NUM_REGISTRATION = 1;
		CourseDouble course = new CourseDouble(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	class RegDouble extends Registration {
		@Override
		public double getRegistrationFee() {
			return -1;
		}
	}
	
	@Test(expected = PostconditionError.class)
	public void RegistrationFeeNeg() {
		int NUM_REGISTRATION = 1;
		DegreeCourse course = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
		RegDouble reg =  new RegDouble();
		reg.addCourse(course);
		reg.getRegistrationFee();
	}
	/*
	 * PreconditionError
PostconditionError
InvariantError

	 * @Require, @Ensure, and @Invariant annotations

	 * 3. Implemente los siguientes contratos (escoja Ud. el tipo: pre/post condición 
	 * o invariante más adecuado): 
 a. Las asignaturas deben tener entre 1 y 6 ECTS. 
 b. Un alumno puede matricularse  entre 1 y 6 veces en la misma asignatura como máximo. 
 c. No se puede instanciar  una clase DegreeCourse con una asignatura de master 
 (el tipo está definido en la  enumeración CourseData). 
 d. No se puede instanciar una clase MasterCourse con una 
 asignatura de master. 
 e. Una matrícula puede contener 10 asignaturas como máximo. 
 f. Una matrícula no puede contener más de 36 ECTS. 
 g. El importe de una asignatura no puede ser negativo. 
 h. El importe de la matrícula no puede ser negativo. 
 
 4. Los puntos g) y h) anteriores pueden ser incompatibles. Documente su solución en 
 el fichero changes.md (incluido en el repositorio). 
	 */
}
