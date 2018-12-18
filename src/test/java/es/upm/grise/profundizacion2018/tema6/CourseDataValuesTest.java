package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	//Creación de cursos de grado para pruebas correspondientes:
		// Correctos
	CORRECT_DCOURSEA ("DEGREE", "Correct degree course", 5),
	CORRECT_DCOURSEB ("DEGREE", "Correct degree course", 6),
	CORRECT_DCOURSEC ("DEGREE", "Correct degree course", 6),
	CORRECT_DCOURSED ("DEGREE", "Correct degree course", 6),
	CORRECT_DCOURSEE ("DEGREE", "Correct degree course", 6),
	CORRECT_DCOURSEF ("DEGREE", "Correct degree course", 6),
	CORRECT_DCOURSEG ("DEGREE", "Correct degree course", 6),
	CORRECT_DCOURSEH ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSEI ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSEJ ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSEK ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSEL ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSEM ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSEN ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSEÑ ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSEO ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSEP ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSEQ ("DEGREE", "Correct degree course", 1),
	CORRECT_DCOURSER ("DEGREE", "Correct degree course", 1),
		// Incorrectos	
	INCORRECT_DCOURSEA ("DEGREE", "Incorrect degree course", 5),
	INCORRECT_DCOURSEB ("DEGREE", "Incorrect degree course", 8),
	
	//Creación de cursos de master para pruebas correspondientes:
		// Correctos
	CORRECT_MCOURSEA ("MASTER", "Correct master course 1", 1),
		// Incorrectos	
	INCORRECT_MCOURSEA ("MASTER", "Incorrect master course", 5),
	INCORRECT_MCOURSEB("MASTER", "Incorrect master course", 8);
	
	
	
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
