package es.upm.grise.profundizacion2018.tema6;

import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5), 
	ANOHTER_CORRECT_DEGREE_COURSE ("DEGREE2", "Correct degree2 course", 3),
	MATHS("MATHS", "Maths course", 6),
	PROG("PROG", "Programming course", 4),
	PROG2("PROG2", "Programming 2 course", 3),
	LOGIC("LOGIC", "Logic course", 6);
	
	private String level;
	private String name;
	private int credits;

	@Requires("credits >= 1 && credits <= 6")
	CourseDataValuesTest(String level, String name, int credits) {
		this.level = level;
		this.name = name;
		this.credits = credits;
	}
	
	public String getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}
	
}
