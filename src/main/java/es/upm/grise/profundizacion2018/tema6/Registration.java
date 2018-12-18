package es.upm.grise.profundizacion2018.tema6;

import java.util.Iterator;
import com.google.java.contract.Requires;
import java.util.Set;
import java.util.TreeSet;

import es.upm.grise.profundizacion2018.tema6.course.Course;

/**
*	Cambios necesarios para el correcto funcionamiento:
*		[Entorno: macOS Mojave 10.14 / Eclipse Neon.3 Release (4.6.3)]
*
*	Project/Properties/JavaCompiler/AnnotationProcessing
*
*			Key										Value												Correct Value
*		com.google.java.contract.classoutput	%PROJECT.DIR%/bin									%PROJECT.DIR%/target/classes
*		com.google.java.contract.classpath		%PROJECT.DIR%/lib/cofoja.asm 1.3 20160207.jar 		%PROJECT.DIR%/lib/cofoja.asm 1.3 20160207.jar
*		com.google.java.contract.sourcepath		%PROJECT.DIR%/src 									%PROJECT.DIR%/src/main/java
**/

public class Registration {
	
	Set<Course> courses = new TreeSet<Course>();
	
	@Requires({"getTotalCredits() <= 36","getNumberCourses() <= 10"})
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public double getRegistrationFee() {
		
		double total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			Course tmp = it.next();
			total += tmp.getFee();
		}
		
		return total;
		
	}
	
	public int getTotalCredits() {
		
		int total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			Course tmp = it.next();
			total += tmp.getCredits();
		}
		
		return total;
		
	}
	
	public int getNumberCourses() {
		
		int total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			it.next();
			total += 1;
		}
		
		return total;
		
	}

}
