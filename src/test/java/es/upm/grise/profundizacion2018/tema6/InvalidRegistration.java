package es.upm.grise.profundizacion2018.tema6;

import java.util.Iterator;

import es.upm.grise.profundizacion2018.tema6.course.Course;

public class InvalidRegistration extends Registration {
	
	@Override
	public double getRegistrationFee() {		
		return -10;
		
	}

}
