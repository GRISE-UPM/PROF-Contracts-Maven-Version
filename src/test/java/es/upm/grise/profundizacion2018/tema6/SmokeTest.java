package es.upm.grise.profundizacion2018.tema6;

import com.google.java.contract.PreconditionError;
//import static org.junit.Assert.*;
//import com.google.java.contract.Requires;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
//import org.junit.Assert;
import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;
import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;

public class SmokeTest {

	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Test
	public void testDegreeInstance() {
		int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DCOURSEA, NUM_REGISTRATION);
		assertNotNull(degreeCourse);}
	
	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Test
	public void testMasterInstance() {
		int NUM_REGISTRATION = 1;
		MasterCourse masterCourse = new MasterCourse(CORRECT_MCOURSEA, NUM_REGISTRATION);
		assertNotNull(masterCourse);}

	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@SuppressWarnings("unused")
	@Test(expected = PreconditionError.class)
	public void testErrorResNum1() {
		int NUM_REGISTRATION = 12;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DCOURSEA, NUM_REGISTRATION);}
	
	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@SuppressWarnings("unused")
	@Test(expected = PreconditionError.class)
	public void testErrorResNum2() {
		int NUM_REGISTRATION = -2;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DCOURSEA, NUM_REGISTRATION);}
	
	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Test(expected = PreconditionError.class)
	public void testErrorMasterNumberCredits() {
		int NUM_REGISTRATION = 0;
		new MasterCourse(INCORRECT_MCOURSEB, NUM_REGISTRATION);}
	
	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Test(expected = PreconditionError.class)
	public void testErrorDegreeNumberCredits() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(INCORRECT_DCOURSEB, NUM_REGISTRATION);}
	
	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Test
	public void testMasterCorrectCredits() {
		int NUM_REGISTRATION = 0;
		new MasterCourse(INCORRECT_MCOURSEA, NUM_REGISTRATION);}
	
	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Test(expected = PreconditionError.class)
	public void testErrorMasterInstance() {
		int NUM_REGISTRATION = 0;
		new DegreeCourse(INCORRECT_MCOURSEA, NUM_REGISTRATION);}
	
	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Test(expected = PreconditionError.class)
	public void testErrorDegreeInstance() {
		int NUM_REGISTRATION = 0;
		new MasterCourse(INCORRECT_DCOURSEA, NUM_REGISTRATION);
	}

	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Test(expected = PreconditionError.class)
	public void testErrorExcessofCredicts(){
		int NUM_REGISTRATION = 1;
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEB, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEC, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSED, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEE, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEF, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEG, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEH, NUM_REGISTRATION));}
	
	//DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Test(expected = PreconditionError.class)
	public void testErrorExcessofSubjects(){
		int NUM_REGISTRATION = 1;
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEI, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEJ, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEK, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEL, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEM, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEN, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEÑ, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEO, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEP, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSEQ, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DCOURSER, NUM_REGISTRATION));

	}
}
