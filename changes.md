# Document here the issues associated to items g) and h)

**g)** En este caso, el reto consiste en encontrar la manera de comprobar que una asignatura no sea negativo, de forma que el resultado del método sea negativo. Se identifican tres posibles maneras de realizar este apartado:

**1. Reflexión**: Aprovechando la reflexión en Java se pueden modificar variables durante el runtime de la aplicación (método sucio que puede dar problemas debido al `SecurityManager`).

**Código:**

``` java
// 6) El importe de una asignatura no puede ser negativo
	@Test
	public void subjectFeeLessThanZero() throws ReflectiveOperationException {
		DegreeCourse testLessThanZero = new DegreeCourse(NEGATIVE_DEGREE_COURSE,3);
        setFinalStaticField(DegreeCourse.class, "fee", -20);
        testLessThanZero.getFee();
        System.out.println(testLessThanZero.getFee());	
	}
	
	private static void setFinalStaticField(Class<?> clazz, String fieldName, Object value)
            throws ReflectiveOperationException {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(null, value);
    }
``` 

En este caso no se puede acceder por reflexión debido a que no está soportado en los tipos primitivos de Java, sería necesario cambiar a Integer la variable "fee" por ejemplo. El código anterior se ejecuta correctamente para valores menores que 0, pero el resultado de la función es el valor original de la misma.

**2. Design Testing**: Cambiar el tipo de la variable fee a public y cambiar su valor por uno negativo. En este caso si que se obtiene el valor deseado.

``` java
public double fee = 27.33;
```

**2. MasterCourse(...) Constructor [Solo para master]**: Si le pasamos un constructor en el que el número de créditos sea negativo, el resultado devuelto por getFee() es < 0 y se verifica el contrato. Este método no es muy recomendable debido a que si hiciéramos testeo total deberíamos proteger contra eso desde getFee() [Si se pasa el constructor y se hace getCredits() la excepción correcta salta, implementado en course]

``` java
TEST_SUBJECT_NEGATIVE("MASTER", "Negative degree course", -2);

// 3g) El importe de una asignatura de Master no puede ser negativo
		@Test
		public void subjectFeeLessThanZeroMaster() {
			MasterCourse testLessThanZero = new MasterCourse(TEST_SUBJECT_NEGATIVE,2);
	        testLessThanZero.getFee();
		}
```

**h)**: En este caso también se pude utilizar los métodos anteriores, pero como además Registration. depende del valor de retorno de tmp.getFee() podemos generar un override del método dentro de la clase DegreeCourse y MasterCourse para que siempre devuelvan el mismo valor negativo probar el resultado.

**Código:**

``` java
@Test
		public void courseFeeLessThanZeroMaster() {
			
			MasterCourse testLessThanZero = new MasterCourse(DEGREE_AS_MASTER,2) {
					@Override
					public double getFee() { 
					return -5;
						}
					};
			Registration registerSemester = new Registration();
			registerSemester.addCourse(testLessThanZero);
			registerSemester.getRegistrationFee();
		}
```


