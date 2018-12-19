package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

import com.google.java.contract.Ensures;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;
import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;
import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class SmokeTest {
	
   // BASICS COFOJA: 
   // @Requires for method preconditions;
   // @Ensures for method postconditions;
   // @Invariant for class and interface invariants;
	
	// 3a) Las asignaturas deben tener entre 1 y 6 creditos
	// 1 - Demasiados créditos
	@Test
	public void subjectsHasMoreThanSixCredits() {
		DegreeCourse degreeWithMoreThanAllowedCredits = new DegreeCourse(TOO_MANY_CREDITS_COURSE,1);
		degreeWithMoreThanAllowedCredits.getCredits();
	}
	// 2 - Ningún crédito (0)
	@Test
	public void subjectHasLessThanOneCredit() {
		DegreeCourse degreeWithLessAllowedCredits = new DegreeCourse(TOO_FEW_CREDITS_COURSE,1);
		degreeWithLessAllowedCredits.getCredits();
	}
	
	// 3b) Un alumno puede matricularse entre 1 y 6 veces en la misma asignatura como máximo.
	// 1 - Demasiadas matrículas
	@Test
	public void tooManyEnrollments() {
		DegreeCourse degreeSubjectTooManyEnrollments = new DegreeCourse(CORRECT_DEGREE_COURSE,7);
		degreeSubjectTooManyEnrollments.getCredits();
	}
	// 2 - Ninguna matrícula (0)
	@Test
	public void ZeroEnrollmentNumberValue() {
		DegreeCourse degreeSubjectTooFewEnrollments = new DegreeCourse(CORRECT_DEGREE_COURSE,0);
		degreeSubjectTooFewEnrollments.getCredits();
	}
	
	// 3c) No se puede instanciar una clase DegreeCourse con una asignatura de master 
	@Test
	public void InstantiatingMasterWithDegreeSubject() {
		MasterCourse masterSubjectWithDegreeLevel = new MasterCourse(MASTER_AS_DEGREE,0);
		masterSubjectWithDegreeLevel.getCredits();
	}
	// 3d) - No se puede instanciar una clase MasterCourse con una asignatura de grado.
	@Test
	public void InstantiatingDegreeWithMasterSubject() {
		DegreeCourse degreeSubjectWithMasterLevel = new DegreeCourse(DEGREE_AS_MASTER,0);
		degreeSubjectWithMasterLevel.getCredits();
	}
	
	// 3e) Una matrícula puede contener 10 asignaturas como máximo.
	@Test
	public void moreThan10Subjects() {

	Registration registerSemester = new Registration();
	DegreeCourse testSubject1 = new DegreeCourse(TEST_SUBJECT_1,1);
	registerSemester.addCourse(testSubject1);
	DegreeCourse testSubject2 = new DegreeCourse(TEST_SUBJECT_2,1);
	registerSemester.addCourse(testSubject2);
	DegreeCourse testSubject3 = new DegreeCourse(TEST_SUBJECT_3,1);
	registerSemester.addCourse(testSubject3);
	DegreeCourse testSubject4 = new DegreeCourse(TEST_SUBJECT_4,1);
	registerSemester.addCourse(testSubject4);
	DegreeCourse testSubject5 = new DegreeCourse(TEST_SUBJECT_5,1);
	registerSemester.addCourse(testSubject5);
	DegreeCourse testSubject6 = new DegreeCourse(TEST_SUBJECT_6,1);
	registerSemester.addCourse(testSubject6);
	DegreeCourse testSubject7 = new DegreeCourse(TEST_SUBJECT_7,1);
	registerSemester.addCourse(testSubject7);
	DegreeCourse testSubject8 = new DegreeCourse(TEST_SUBJECT_8,1);
	registerSemester.addCourse(testSubject8);
	DegreeCourse testSubject9 = new DegreeCourse(TEST_SUBJECT_9,1);
	registerSemester.addCourse(testSubject9);
	DegreeCourse testSubject10 = new DegreeCourse(TEST_SUBJECT_10,1);
	registerSemester.addCourse(testSubject10);
	DegreeCourse testSubject11 = new DegreeCourse(TEST_SUBJECT_11,1);
	registerSemester.addCourse(testSubject11);
	registerSemester.getNumberCourses();
	}
	
	// 3f) Una matrícula no puede contener más de 36 ECTS
	
	@Test
	public void moreThan36ECTS() {
	Registration registerSemester = new Registration();
	DegreeCourse testSubject1 = new DegreeCourse(TEST_SUBJECT_12,1);
	registerSemester.addCourse(testSubject1);
	DegreeCourse testSubject2 = new DegreeCourse(TEST_SUBJECT_13,1);
	registerSemester.addCourse(testSubject2);
	DegreeCourse testSubject3 = new DegreeCourse(TEST_SUBJECT_14,1);
	registerSemester.addCourse(testSubject3);
	DegreeCourse testSubject4 = new DegreeCourse(TEST_SUBJECT_15,1);
	registerSemester.addCourse(testSubject4);
	DegreeCourse testSubject5 = new DegreeCourse(TEST_SUBJECT_16,1);
	registerSemester.addCourse(testSubject5);
	DegreeCourse testSubject6 = new DegreeCourse(TEST_SUBJECT_17,1);
	registerSemester.addCourse(testSubject6);
	DegreeCourse testSubject7 = new DegreeCourse(TEST_SUBJECT_18,1);
	registerSemester.addCourse(testSubject7);
	DegreeCourse testSubject8 = new DegreeCourse(TEST_SUBJECT_19,1);
	registerSemester.addCourse(testSubject8);
	registerSemester.getTotalCredits();
	}
	
	// 3g) El importe de una asignatura de grado no puede ser negativo
	@Test
	public void subjectFeeLessThanZeroDegree() throws ReflectiveOperationException {
		DegreeCourse testLessThanZero = new DegreeCourse(TEST_SUBJECT_12,3);
        setFinalStaticField(DegreeCourse.class, "fee", -20);
        testLessThanZero.getFee();
	}
	
	// 3g) El importe de una asignatura de Master no puede ser negativo
		@Test
		public void subjectFeeLessThanZeroMaster() {
			MasterCourse testLessThanZero = new MasterCourse(TEST_SUBJECT_NEGATIVE,2);
	        testLessThanZero.getFee();
		}
		
	// 3h El importe de un curso de grado no puede ser menor que cero
		
		@Test
		public void courseFeeLessThanZeroDegree() {
			
			DegreeCourse testLessThanZero = new DegreeCourse(TEST_SUBJECT_12,2){
				@Override
				public double getFee() { 
				return -5;
					}
				};
			Registration registerSemester = new Registration();
			registerSemester.addCourse(testLessThanZero);
			registerSemester.getRegistrationFee();
		}
		
		// 3h El importe de un curso de master no puede ser menor que cero

		@Test
		public void courseFeeLessThanZeroMaster() {
			
			MasterCourse testLessThanZero = new MasterCourse(DEGREE_AS_MASTER,2) {
					@Override
					public double getFee() { 
					return -5;
						}
					};
			Registration registerSemester = new Registration();
			registerSemester.addCourse(testLessThanZero);
			registerSemester.getRegistrationFee();
		}
		
		
	
	private static void setFinalStaticField(Class<?> clazz, String fieldName, Object value)
            throws ReflectiveOperationException {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(null, value);
    }
	

}
