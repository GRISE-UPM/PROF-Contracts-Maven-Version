package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;


@Invariant({
	"this.courseData.getLevel() == \"MASTER\" ",
	"numRegistrations > 0 &&  numRegistrations <= 6 "
})
public class MasterCourse extends Course {
	
	final private static double feePerCredit = 35.44;


	public MasterCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	@Ensures({
		"this.getFee() > 0"
	})
	public double getFee() {
		System.out.println( courseData.getCredits());
		System.out.println(numRegistrations);
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}
	
}
