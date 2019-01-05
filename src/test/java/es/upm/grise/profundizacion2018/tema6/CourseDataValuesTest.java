package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 1),
	WRONG_MASTER_COURSE ("MASTER", "Wrong master course", 5),
	WRONG_DEGREE_COURSE ("DEGREE", "Wrong degree course", 38),
	WRONG_DEGREE_MASTER_CREDITS ("MASTER", "Wrong degree course", 10),
	CORRECT_DEGREE_6 ("DEGREE", "6", 6),
	CORRECT_DEGREE_7 ("DEGREE", "7", 6),
	CORRECT_DEGREE_1 ("DEGREE", "1", 6),
	CORRECT_DEGREE_2 ("DEGREE", "2", 6),
	CORRECT_DEGREE_3 ("DEGREE", "3", 6),
	CORRECT_DEGREE_4 ("DEGREE", "4", 6),
	CORRECT_DEGREE_5 ("DEGREE", "5", 6),
	WRONG_DEGREE_COURSE_CREDITS ("DEGREE", "Wrong degree course", 10);
	
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
