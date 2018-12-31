package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	SHORT_CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 1),
	SHORT_CORRECT_DEGREE_COURSE2 ("DEGREE", "Correct degree course 2", 1),
	SHORT_CORRECT_DEGREE_COURSE3 ("DEGREE", "Correct degree course 3", 1),
	SHORT_CORRECT_DEGREE_COURSE4 ("DEGREE", "Correct degree course 4", 1),
	SHORT_CORRECT_DEGREE_COURSE5 ("DEGREE", "Correct degree course 5", 1),
	SHORT_CORRECT_DEGREE_COURSE6 ("DEGREE", "Correct degree course 6", 1),
	SHORT_CORRECT_DEGREE_COURSE7 ("DEGREE", "Correct degree course 7", 1),
	SHORT_CORRECT_DEGREE_COURSE8 ("DEGREE", "Correct degree course 8", 1),
	SHORT_CORRECT_DEGREE_COURSE9 ("DEGREE", "Correct degree course 9", 1),
	SHORT_CORRECT_DEGREE_COURSE10 ("DEGREE", "Correct degree course 10", 1),
	SHORT_CORRECT_DEGREE_COURSE11 ("DEGREE", "Correct degree course 11", 1),
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_DEGREE_COURSE2 ("DEGREE", "Correct degree course 2", 5),
	CORRECT_DEGREE_COURSE3 ("DEGREE", "Correct degree course3 ", 5),
	CORRECT_DEGREE_COURSE4 ("DEGREE", "Correct degree course 4", 5),
	CORRECT_DEGREE_COURSE5 ("DEGREE", "Correct degree course 5", 5),
	CORRECT_DEGREE_COURSE6 ("DEGREE", "Correct degree course 6" , 5),
	CORRECT_DEGREE_COURSE7 ("DEGREE", "Correct degree course 7", 5),
	CORRECT_DEGREE_COURSE8 ("DEGREE", "Correct degree course 8", 5),
	CORRECT_MASTER_COURSE ("MASTER", "Correct degree course", 5),
	INCORRECT_DEGREE_COURSE1 ("DEGREE", "Incorrect degree course: more credits than allowed", 7),
	INCORRECT_DEGREE_COURSE2 ("DEGREE", "Incorrect degree course: less credits than allowed", 0),
	INCORRECT_MASTER_COURSE1 ("MASTER", "Incorrect master course: more credits than allowed", 7),
	INCORRECT_MASTER_COURSE2 ("MASTER", "Incorrect master course: less credits than allowed", 0);
	
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
