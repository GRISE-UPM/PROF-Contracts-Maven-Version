package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	INCORRECT_DEGREE_COURSE ("MASTER", "Correct degree course", 5),
	INCORRECT_MASTER_COURSE ("MASTER", "Correct degree course", 5),
	INCORRECT_DEGREE_COURSE_MORE_CREDITS ("DEGREE", "Correct degree course",9),
	INCORRECT_MASTER_COURSE_MORE_CREDITS ("MASTER", "Correct degree course",9),
	CORRECT_DEGREE_COURSE_1 ("DEGREE", "Correct degree course 1", 5),
	CORRECT_DEGREE_COURSE_2 ("DEGREE", "Correct degree course 2", 5),
	CORRECT_DEGREE_COURSE_3 ("DEGREE", "Correct degree course 3", 5),
	CORRECT_DEGREE_COURSE_4 ("DEGREE", "Correct degree course 4", 5),
	CORRECT_DEGREE_COURSE_5 ("DEGREE", "Correct degree course 5", 5),
	CORRECT_DEGREE_COURSE_6 ("DEGREE", "Correct degree course 6", 5),
	CORRECT_DEGREE_COURSE_7 ("DEGREE", "Correct degree course 7", 5),
	CORRECT_DEGREE_COURSE_8 ("DEGREE", "Correct degree course 8", 5),
	CORRECT_MASTER_COURSE_1 ("MASTER", "Correct degree course 1", 1),
	CORRECT_MASTER_COURSE_2 ("MASTER", "Correct degree course 2", 1),
	CORRECT_MASTER_COURSE_3 ("MASTER", "Correct degree course 3", 1),
	CORRECT_MASTER_COURSE_4 ("MASTER", "Correct degree course 4", 1),
	CORRECT_MASTER_COURSE_5 ("MASTER", "Correct degree course 5", 1),
	CORRECT_MASTER_COURSE_6 ("MASTER", "Correct degree course 6", 1),
	CORRECT_MASTER_COURSE_7 ("MASTER", "Correct degree course 7", 1),
	CORRECT_MASTER_COURSE_8 ("MASTER", "Correct degree course 8", 1),
	CORRECT_MASTER_COURSE_9 ("MASTER", "Correct degree course 8", 1),
	CORRECT_MASTER_COURSE_10("MASTER", "Correct degree course 8", 1),
	CORRECT_MASTER_COURSE_11("MASTER", "Correct degree course 8", 1);



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
