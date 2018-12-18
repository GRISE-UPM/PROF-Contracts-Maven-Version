package es.upm.grise.profundizacion2018.tema6;

import static org.junit.Assert.*;

import org.junit.Test;

import static es.upm.grise.profundizacion2018.tema6.CourseDataValuesTest.*;

import es.upm.grise.profundizacion2018.tema6.course.Course;
import es.upm.grise.profundizacion2018.tema6.course.DegreeCourse;
import es.upm.grise.profundizacion2018.tema6.course.MasterCourse;

import com.google.java.contract.PostconditionError;
import com.google.java.contract.PreconditionError;

public class SmokeTest {

	@Test(expected = PreconditionError.class)
	public void check_exception_when_degree_have_zero_ects() {
		DegreeCourse dc = new DegreeCourse(INCORRECT_DEGREE_COURSE_ZERO_CREDITS, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void check_exception_when_degree_have_more_ects() {
		DegreeCourse dc = new DegreeCourse(INCORRECT_DEGREE_COURSE_EXCESIVE_CREDITS, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void check_exception_when_master_have_zero_ects() {
		MasterCourse mc = new MasterCourse(INCORRECT_MASTER_COURSE_ZERO_CREDITS, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void check_exception_when_master_have_more_ects() {
		MasterCourse mc = new MasterCourse(INCORRECT_MASTER_COURSE_EXCESIVE_CREDITS, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void check_exception_when_degree_have_zero_registration() {
		DegreeCourse dc = new DegreeCourse(CORRECT_DEGREE_COURSE, 0);
	}
	
	@Test(expected = PreconditionError.class)
	public void check_exception_when_degree_have_excesive_registration() {
		DegreeCourse dc = new DegreeCourse(CORRECT_DEGREE_COURSE, 7);
	}
	
	@Test(expected = PreconditionError.class)
	public void check_exception_when_master_have_zero_registration() {
		MasterCourse mc = new MasterCourse(CORRECT_MASTER_COURSE, 0);
	}
	
	@Test(expected = PreconditionError.class)
	public void check_exception_when_master_have_excesive_registration() {
		MasterCourse mc = new MasterCourse(CORRECT_MASTER_COURSE, 7);
	}
	
	
	@Test(expected = PostconditionError.class)
	public void check_exception_when_degree_have_master_course() {
		DegreeCourse mc = new DegreeCourse(CORRECT_MASTER_COURSE, 5);
	}

	
	@Test(expected = PostconditionError.class)
	public void check_exception_when_master_have_degress_course() {
		MasterCourse mc = new MasterCourse(CORRECT_DEGREE_COURSE, 5);
	}
	
	@Test(expected = PostconditionError.class)
	public void check_exception_when_added_more_than_ten_course() {		
		Registration r= new Registration();
		r.addCourse(new DegreeCourse(TEST_COURSE1, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE2, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE3, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE4, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE5, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE6, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE7, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE8, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE9, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE10, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE11, 1));
	}
	
	@Test(expected = PostconditionError.class)
	public void check_exception_when_added_more_than_therty_six_ects() {		
		Registration r= new Registration();
		r.addCourse(new DegreeCourse(TEST_COURSE12, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE11, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE10, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE9, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE8, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE7, 1));
		r.addCourse(new DegreeCourse(TEST_COURSE6, 1));
	}
	
	@Test(expected = PostconditionError.class)
	public void check_exception_when_course_fee_negative() {		
		InvalidCourse mc = new InvalidCourse(CORRECT_MASTER_COURSE, 5);
	}
	
	@Test(expected = PostconditionError.class)
	public void check_exception_when_registration_fee_negative() {	
		InvalidRegistration ir = new InvalidRegistration();
		ir.addCourse(new DegreeCourse(TEST_COURSE1, 1));
	}

}
