package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 3),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 6),
	INCORRECT_DEGREE_COURSE_ZERO_CREDITS ("DEGREE", "Incorrect degree course", 0),
	INCORRECT_DEGREE_COURSE_EXCESIVE_CREDITS ("DEGREE", "Incorrect degree course", 7),
	INCORRECT_MASTER_COURSE_ZERO_CREDITS ("MASTER", "Incorrect master course", 0),
	INCORRECT_MASTER_COURSE_EXCESIVE_CREDITS ("MASTER", "Incorrect master course", 7);
	
	private String level;
	private String name;
	private int credits;

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
