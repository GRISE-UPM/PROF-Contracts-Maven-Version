package es.upm.grise.profundizacion2018.tema6.values;

import com.google.java.contract.Ensures;

public interface CourseData {

	public String getLevel();
	public String getName();
	@Ensures("result >= 1 && result <= 6")
	public int getCredits();
	
}
