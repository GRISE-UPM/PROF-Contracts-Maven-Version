package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	INCORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	INCORRECT_DEGREE_COURSE_MORE_CREDITS ("DEGREE", "Correct degree course", 9),
	INCORRECT_MASTER_COURSE ("MASTER", "Correct degree course", 5),
	INCORRECT_MASTER_COURSE_MORE_CREDITS("MASTER", "Correct degree course", 9),
	CORRECT_MASTER_COURSE ("MASTER", "Correct degree course 1", 5),
	CORRECT_DEGREE_COURSE_1 ("DEGREE", "Correct degree course", 5),
	CORRECT_DEGREE_COURSE_2 ("DEGREE", "Correct degree course", 5),
	CORRECT_DEGREE_COURSE_3 ("DEGREE", "Correct degree course", 5),
	CORRECT_DEGREE_COURSE_4 ("DEGREE", "Correct degree course", 5),
	CORRECT_DEGREE_COURSE_5 ("DEGREE", "Correct degree course", 5),
	CORRECT_DEGREE_COURSE_6 ("DEGREE", "Correct degree course", 5),
	CORRECT_DEGREE_COURSE_7 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_8 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_9 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_10 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_11 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_12 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_13 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_14 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_15 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_16 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_17 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE_18 ("DEGREE", "Correct degree course", 1);
	
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
