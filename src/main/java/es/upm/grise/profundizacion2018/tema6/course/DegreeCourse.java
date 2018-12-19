package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

@Invariant({
	"this.courseData.getLevel() == \"DEGREE\" ",
	"numRegistrations > 0 &&  numRegistrations <= 6 "
})
public class DegreeCourse extends Course {

	//public double fee = 27.33;
	final private static double fee = 27.33;

	public DegreeCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
		
		
	}

	@Ensures({
		"fee >= 0"
	})
	@Override
	public double getFee() {
		if (numRegistrations == 1)
			return 0;
		else
			return fee;
	}
	
}
