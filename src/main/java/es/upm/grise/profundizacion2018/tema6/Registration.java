package es.upm.grise.profundizacion2018.tema6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;

import es.upm.grise.profundizacion2018.tema6.course.Course;

public class Registration {
	
	Set<Course> courses = new TreeSet<Course>();
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	@Ensures({
		"this.getRegistrationFee() > 0 "
	})
	public double getRegistrationFee() {
		
		double total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			Course tmp = it.next();
			total += tmp.getFee();
		}
		
		return total;
		
	}
	
	@Ensures({
		"this.getTotalCredits() > 0 && this.getTotalCredits() <= 36"
	})
	public int getTotalCredits() {
		
		int total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			Course tmp = it.next();
			total += tmp.getCredits();
		}
		
		return total;
		
	}
	
	@Ensures({
		"this.getNumberCourses() > 0 && this.getNumberCourses() <= 10"
	})
	public int getNumberCourses() {
		
		int total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			it.next();
			total += 1;
		}
		
		return total;
		
	}

}
