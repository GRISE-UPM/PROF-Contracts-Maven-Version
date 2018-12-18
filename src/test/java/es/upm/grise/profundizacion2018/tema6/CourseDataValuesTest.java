package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_MASTER_COURSE ("MASTER", "Correct degree course", 5),
	DEGREE_COURSE_0_CREDITS ("DEGREE", "Incorrect degree course", 0),
	DEGREE_COURSE_7_CREDITS ("DEGREE", "Incorrect degree course", 7),
	MASTER_COURSE_0_CREDITS ("MASTER", "Incorrect master course", 0),
	MASTER_COURSE_7_CREDITS ("MASTER", "Incorrect master course", 7),
	
	CORRECT_DEGREE_COURSE_1 ("DEGREE", "Correct degree course 1", 1),
	CORRECT_DEGREE_COURSE_2 ("DEGREE", "Correct degree course 2", 1),
	CORRECT_DEGREE_COURSE_3 ("DEGREE", "Correct degree course 3", 1),
	CORRECT_DEGREE_COURSE_4 ("DEGREE", "Correct degree course 4", 1),
	CORRECT_DEGREE_COURSE_5 ("DEGREE", "Correct degree course 5", 1),
	CORRECT_DEGREE_COURSE_6 ("DEGREE", "Correct degree course 6", 1),
	CORRECT_DEGREE_COURSE_7 ("DEGREE", "Correct degree course 7", 1),
	CORRECT_DEGREE_COURSE_8 ("DEGREE", "Correct degree course 8", 1),
	CORRECT_DEGREE_COURSE_9 ("DEGREE", "Correct degree course 9", 1),
	CORRECT_DEGREE_COURSE_10 ("DEGREE", "Correct degree course 10", 1),
	CORRECT_DEGREE_COURSE_11 ("DEGREE", "Correct degree course 11", 1),
	
	CORRECT_MASTER_COURSE_1 ("MASTER", "Correct master course 1", 6),
	CORRECT_MASTER_COURSE_2 ("MASTER", "Correct master course 2", 6),
	CORRECT_MASTER_COURSE_3 ("MASTER", "Correct master course 3", 6),
	CORRECT_MASTER_COURSE_4 ("MASTER", "Correct master course 4", 6),
	CORRECT_MASTER_COURSE_5 ("MASTER", "Correct master course 5", 6),
	CORRECT_MASTER_COURSE_6 ("MASTER", "Correct master course 6", 6),
	CORRECT_MASTER_COURSE_7 ("MASTER", "Correct master course 7", 6);
	

	

	
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
