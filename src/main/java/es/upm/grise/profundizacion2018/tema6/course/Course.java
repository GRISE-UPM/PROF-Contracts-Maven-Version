package es.upm.grise.profundizacion2018.tema6.course;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;
//import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

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

public abstract class Course implements Comparable <Course> {

	protected int numRegistrations;
	protected CourseData courseData;

	@Requires({"1 <= numRegistrations", "numRegistrations <= 6"})
	public Course(int numRegistrations) {
		this.numRegistrations = numRegistrations;
	}
	
	public String getLevel() {
		return courseData.getLevel();
	}
	
	public abstract double getFee();

	public String getName() {
		return courseData.getName();
	}
	
	public int getCredits() {
		return courseData.getCredits();
	}
	
	@Override
	public int compareTo(Course course) {
		return courseData.getName().compareTo(course.getName());
	}
	
}
