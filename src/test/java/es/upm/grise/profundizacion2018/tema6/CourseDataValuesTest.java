package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 5),
	INCORRECT_DEGREE_COURSE ("DEGREE", "Incorrect degree course", 9),
	CASE_DEGREE_COURSE_WITH_MASTER ("MASTER", "Incorrect degree course", 3),
	CASE_MASTER_COURSE_WITH_DEGREE ("DEGREE", "Incorrect master course", 3),
	NEGATIVE_DEGREE_COURSE("DEGREE", "Negative degree course", -2),
	NEGATIVE_MASTER_COURSE("MASTER", "Negative master course", -5),
	CASE36_CREDITS1("DEGREE", "Matemática discreta", 6),
	CASE36_CREDITS2("DEGREE", "Cálculo", 6),
	CASE36_CREDITS3("DEGREE", "Minería de datos", 6),
	CASE36_CREDITS4("DEGREE", "Compiladores I", 6),
	CASE36_CREDITS5("MASTER", "Profundización", 6),
	CASE36_CREDITS6("MASTER", "Sistemas Inteligentes", 6),
	CASE36_CREDITS7("MASTER", "Sistemas Cognitivos", 6),
	CASE36_CREDITS8("MASTER", "Análisis Inteligente de Datos", 6),
	CASE36_CREDITS9("MASTER", "Análisis Financiero", 6);
	
	private String level;
	private String name;
	private int credits;
	
	static CourseDataValuesTest[] coursesForTest = new CourseDataValuesTest[11];
	
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
	
	public static void fillCoursesForTest() {
		coursesForTest[0] =  CourseDataValuesTest.CORRECT_DEGREE_COURSE;
		coursesForTest[1] =  CourseDataValuesTest.CORRECT_MASTER_COURSE;
		coursesForTest[2] =  CourseDataValuesTest.CASE36_CREDITS1;
		coursesForTest[3] =  CourseDataValuesTest.CASE36_CREDITS2;
		coursesForTest[4] =  CourseDataValuesTest.CASE36_CREDITS3;
		coursesForTest[5] =  CourseDataValuesTest.CASE36_CREDITS4;
		coursesForTest[6] =  CourseDataValuesTest.CASE36_CREDITS5;
		coursesForTest[7] =  CourseDataValuesTest.CASE36_CREDITS6;
		coursesForTest[8] =  CourseDataValuesTest.CASE36_CREDITS7;
		coursesForTest[9] =  CourseDataValuesTest.CASE36_CREDITS8;
		coursesForTest[10] =  CourseDataValuesTest.CASE36_CREDITS9;
	}
	
}
