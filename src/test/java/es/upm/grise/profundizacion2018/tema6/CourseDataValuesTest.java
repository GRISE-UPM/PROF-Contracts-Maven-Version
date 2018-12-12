package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 3),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 6),
	INCORRECT_DEGREE_COURSE_ZERO_CREDITS ("DEGREE", "Incorrect degree course", 0),
	INCORRECT_DEGREE_COURSE_EXCESIVE_CREDITS ("DEGREE", "Incorrect degree course", 7),
	INCORRECT_MASTER_COURSE_ZERO_CREDITS ("MASTER", "Incorrect master course", 0),
	INCORRECT_MASTER_COURSE_EXCESIVE_CREDITS ("MASTER", "Incorrect master course", 7),
	
	TEST_COURSE1 ("DEGREE", "Test course 1", 6),
	TEST_COURSE2 ("DEGREE", "Test course 2", 6),
	TEST_COURSE3 ("DEGREE", "Test course 3", 6),
	TEST_COURSE4 ("DEGREE", "Test course 4", 6),
	TEST_COURSE5 ("DEGREE", "Test course 5", 6),
	TEST_COURSE6 ("DEGREE", "Test course 6", 6),
	TEST_COURSE7 ("DEGREE", "Test course 7", 6),
	TEST_COURSE8 ("DEGREE", "Test course 8", 6),
	TEST_COURSE9 ("DEGREE", "Test course 9", 6),
	TEST_COURSE10 ("DEGREE", "Test course 10", 6),
	TEST_COURSE11 ("DEGREE", "Test course 11", 6),
	TEST_COURSE12 ("DEGREE", "Test course 12", 6);	
	
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
