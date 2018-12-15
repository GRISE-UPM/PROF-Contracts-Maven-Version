package es.upm.grise.prof2018.contracts;

import es.upm.grise.prof2018.contracts.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 4),
	CORRECT_DEGREE_COURSE_2 ("DEGREE", "Correct degree course 2", 3),
	CORRECT_DEGREE_COURSE_3 ("DEGREE", "Correct degree course 3", 4),
	CORRECT_DEGREE_COURSE_4 ("DEGREE", "Correct degree course 4", 2),
	CORRECT_DEGREE_COURSE_5 ("DEGREE", "Correct degree course 5", 1),
	CORRECT_DEGREE_COURSE_6 ("DEGREE", "Correct degree course 6", 1),
	CORRECT_DEGREE_COURSE_7 ("DEGREE", "Correct degree course 7", 2),
	CORRECT_DEGREE_COURSE_8 ("DEGREE", "Correct degree course 8", 3),
	CORRECT_DEGREE_COURSE_9 ("DEGREE", "Correct degree course 9", 5),
	CORRECT_DEGREE_COURSE_10 ("DEGREE", "Correct degree course 10", 4),
	CORRECT_DEGREE_COURSE_11 ("DEGREE", "Correct degree course 11", 2),
	CORRECT_DEGREE_COURSE_12 ("DEGREE", "Correct degree course 12", 3),
	CORRECT_DEGREE_COURSE_6CREDITS ("DEGREE", "Correct degree with 6 credits", 6),
	CORRECT_DEGREE_COURSE_6CREDITS_2 ("DEGREE", "Correct degree with 6 credits 2", 6),
	CORRECT_DEGREE_COURSE_6CREDITS_3 ("DEGREE", "Correct degree with 6 credits 3", 6),
	CORRECT_DEGREE_COURSE_6CREDITS_4 ("DEGREE", "Correct degree with 6 credits 4", 6),
	CORRECT_DEGREE_COURSE_6CREDITS_5 ("DEGREE", "Correct degree with 6 credits 5", 6),
	CORRECT_DEGREE_COURSE_6CREDITS_6 ("DEGREE", "Correct degree with 6 credits 6", 6),
	DEGREE_COURSE_TOO_MANY_CREDITS ("DEGREE", "Degree course too many credits", 7),
	DEGREE_COURSE_NO_CREDITS ("DEGREE", "Degree course with no credits", 0),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 3);
	
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
