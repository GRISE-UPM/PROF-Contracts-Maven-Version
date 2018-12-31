package es.upm.grise.profundizacion2018.tema6;

import java.util.Iterator;

import es.upm.grise.profundizacion2018.tema6.course.Course;

public class RegistrationInvalidDouble extends Registration{
	
@Override
public double getRegistrationFee() {
	
	double total = 0;
	
	for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
		Course tmp = it.next();
		total += tmp.getFee();
	}
	
	return -total;
	
}
	

}
