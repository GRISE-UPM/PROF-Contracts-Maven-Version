package es.upm.grise.profundizacion2018.tema6;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 5),
	CURSO_GRADO_0_CREDITOS	("DEGREE", "Curso 0 creditos", 0),
	CURSO_MASTER_0_CREDITOS	("MASTER", "Curso 0 creditos", 0),
	CURSO_GRADO_7_CREDITOS	("DEGREE", "Curso 7 creditos", 7),
	CURSO_MASTER_7_CREDITOS	("MASTER", "Curso 7 creditos", 7);
	
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
