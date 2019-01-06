package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 5),
	BAD_DEGREE_COURSE0 ("DEGREE", "Bad degree course", 0),
	BAD_DEGREE_COURSE7 ("DEGREE", "Bad degree course", 7),	
	CORRECT_COURSE1 ("DEGREE", "course 1", 1),
	CORRECT_COURSE2 ("DEGREE", "course 2", 1),
	CORRECT_COURSE3 ("DEGREE", "course 3", 1),
	CORRECT_COURSE4 ("DEGREE", "course 4", 1),
	CORRECT_COURSE5 ("DEGREE", "course 5", 1),
	CORRECT_COURSE6 ("DEGREE", "course 6", 1),
	CORRECT_COURSE7 ("DEGREE", "course 7", 1),
	CORRECT_COURSE8 ("DEGREE", "course 8", 1),
	CORRECT_COURSE9 ("DEGREE", "course 9", 1),
	CORRECT_COURSE10 ("DEGREE", "course 10", 1),
	CORRECT_COURSE11 ("DEGREE", "course 11", 1),
	CORRECT_COURSE6_1 ("DEGREE", "course 1", 6),
	CORRECT_COURSE6_2 ("DEGREE", "course 2", 6),
	CORRECT_COURSE6_3 ("DEGREE", "course 3", 6),
	CORRECT_COURSE6_4 ("DEGREE", "course 4", 6),
	CORRECT_COURSE6_5 ("DEGREE", "course 5", 6),
	CORRECT_COURSE6_6 ("DEGREE", "course 6", 6),
	CORRECT_COURSE6_7 ("DEGREE", "course 7", 6);
	
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
