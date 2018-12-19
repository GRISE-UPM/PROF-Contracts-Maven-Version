package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 3),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 6),
	INCORRECT_DEGREE_COURSE_ZERO_CREDITS ("DEGREE", "Incorrect degree course", 0),
	INCORRECT_DEGREE_COURSE_EXCESIVE_CREDITS ("DEGREE", "Incorrect degree course", 7),
	INCORRECT_MASTER_COURSE_ZERO_CREDITS ("MASTER", "Incorrect master course", 0),
	INCORRECT_MASTER_COURSE_EXCESIVE_CREDITS ("MASTER", "Incorrect master course", 7),
	
	TEST_COURSE1_1_CRED ("DEGREE", "Test course 1 with 1 credit", 1),
	TEST_COURSE2_1_CRED ("DEGREE", "Test course 2 with 1 credit", 1),
	TEST_COURSE3_1_CRED ("DEGREE", "Test course 3 with 1 credit", 1),
	TEST_COURSE4_1_CRED ("DEGREE", "Test course 4 with 1 credit", 1),
	TEST_COURSE5_1_CRED ("DEGREE", "Test course 5 with 1 credit", 1),
	TEST_COURSE6_1_CRED ("DEGREE", "Test course 6 with 1 credit", 1),
	TEST_COURSE7_1_CRED ("DEGREE", "Test course 7 with 1 credit", 1),
	TEST_COURSE8_1_CRED ("DEGREE", "Test course 8 with 1 credit", 1),
	TEST_COURSE9_1_CRED ("DEGREE", "Test course 9 with 1 credit", 1),
	TEST_COURSE10_1_CRED ("DEGREE", "Test course 10 with 1 credit", 1),
	TEST_COURSE11_1_CRED ("DEGREE", "Test course 11 with 1 credit", 1),
	TEST_COURSE12_1_CRED ("DEGREE", "Test course 12 with 1 credit", 1),
    
    TEST_COURSE1_6_CRED ("DEGREE", "Test course 1 with 6 credits", 6),
    TEST_COURSE2_6_CRED ("DEGREE", "Test course 2 with 6 credits", 6),
    TEST_COURSE3_6_CRED ("DEGREE", "Test course 3 with 6 credits", 6),
    TEST_COURSE4_6_CRED ("DEGREE", "Test course 4 with 6 credits", 6),
    TEST_COURSE5_6_CRED ("DEGREE", "Test course 5 with 6 credits", 6),
    TEST_COURSE6_6_CRED ("DEGREE", "Test course 6 with 6 credits", 6),
    TEST_COURSE7_6_CRED ("DEGREE", "Test course 7 with 6 credits", 6);
	
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
