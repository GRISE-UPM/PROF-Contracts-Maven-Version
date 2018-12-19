package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	TOO_MANY_CREDITS_COURSE ("DEGREE", "Subject 1",7),
	TOO_FEW_CREDITS_COURSE ("DEGREE", "Subject 2",0),
	MASTER_AS_DEGREE ("DEGREE", "Subject3", 2),
	DEGREE_AS_MASTER ("MASTER", "Subject4",3),
	
	// Test Number of Subjects
	TEST_SUBJECT_1 ("DEGREE", "TEST_SUBJECT_1",1),
	TEST_SUBJECT_2 ("DEGREE", "TEST_SUBJECT_2",1),
	TEST_SUBJECT_3 ("DEGREE", "TEST_SUBJECT_3",1),
	TEST_SUBJECT_4 ("DEGREE", "TEST_SUBJECT_4",1),
	TEST_SUBJECT_5 ("DEGREE", "TEST_SUBJECT_5",1),
	TEST_SUBJECT_6 ("DEGREE", "TEST_SUBJECT_6",1),
	TEST_SUBJECT_7 ("DEGREE", "TEST_SUBJECT_7",1),
	TEST_SUBJECT_8 ("DEGREE", "TEST_SUBJECT_8",1),
	TEST_SUBJECT_9 ("DEGREE", "TEST_SUBJECT_9",1),
	TEST_SUBJECT_10 ("DEGREE", "TEST_SUBJECT_10",1),
	TEST_SUBJECT_11 ("DEGREE", "TEST_SUBJECT_11",1),
	
	// Test Number of credits
	TEST_SUBJECT_12 ("DEGREE", "TEST_SUBJECT_12",5),
	TEST_SUBJECT_13 ("DEGREE", "TEST_SUBJECT_13",5),
	TEST_SUBJECT_14 ("DEGREE", "TEST_SUBJECT_14",5),
	TEST_SUBJECT_15 ("DEGREE", "TEST_SUBJECT_15",5),
	TEST_SUBJECT_16 ("DEGREE", "TEST_SUBJECT_16",5),
	TEST_SUBJECT_17 ("DEGREE", "TEST_SUBJECT_17",5),
	TEST_SUBJECT_18 ("DEGREE", "TEST_SUBJECT_18",5),
	TEST_SUBJECT_19 ("DEGREE", "TEST_SUBJECT_19",5),
	
	TEST_SUBJECT_NEGATIVE("MASTER", "Negative degree course", -2);

	
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
