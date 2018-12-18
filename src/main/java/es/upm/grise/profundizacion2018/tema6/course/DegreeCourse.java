package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Requires;
import com.google.java.contract.Ensures;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

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

public class DegreeCourse extends Course {

	final private static double fee = 27.33;
	
	@Requires("course.getLevel().equals(\"DEGREE\")")
	@Ensures({"getCredits() >= 1", "getCredits() <= 6", "getFee() >= 0"})
	public DegreeCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}

	@Override
	public double getFee() {
		if (numRegistrations == 1)
			return 0;
		else
			return fee;
	}
	
}
