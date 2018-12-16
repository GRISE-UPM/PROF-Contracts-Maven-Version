package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	MASTER_COURSE  ("MASTER", "Master course", 4),
	CORRECT_DEGREE_COURSE1 ("DEGREE", "Correct degree course1", 5),
	CORRECT_DEGREE_COURSE2 ("DEGREE", "Correct degree course2", 5),
	CORRECT_DEGREE_COURSE3 ("DEGREE", "Correct degree course3", 3),
	CORRECT_DEGREE_COURSE4 ("DEGREE", "Correct degree course4", 3),
	CORRECT_DEGREE_COURSE5 ("DEGREE", "Correct degree course5", 3),
	CORRECT_DEGREE_COURSE6 ("DEGREE", "Correct degree course6", 3),
	CORRECT_DEGREE_COURSE7 ("DEGREE", "Correct degree course7", 3),
	CORRECT_DEGREE_COURSE8 ("DEGREE", "Correct degree course8", 3),
	CORRECT_DEGREE_COURSE9 ("DEGREE", "Correct degree course9", 1),
	CORRECT_DEGREE_COURSE10 ("DEGREE", "Correct degree course10", 1),
	CORRECT_DEGREE_COURSE11 ("DEGREE", "Correct degree course11", 6),
	CORRECT_DEGREE_COURSE12 ("DEGREE", "Correct degree course12", 6),
	COURSE_TOO_MUCH_CREDITS  ("MASTER", "Master course", 30),
	COURSE_ZERO_CREDITS  ("MASTER", "Master course", 0);
	
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


