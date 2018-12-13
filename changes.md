# Document here the issues associated to items g) and h)

Tal y como indica en el enunciado, el importe de una asignatura y de una matrícula no puede ser negativo. 

Postcondiciones erroneas:
	
	@Ensures("result > -1")
	public double getRegistrationFee() {
		
		double total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			Course tmp = it.next();
			total += tmp.getFee();
		}
		
		return total;
		
	}
	
	@Ensures("result > -1")
	public abstract double getFee();
	
Pero puede ser igual a cero. ¿Qué ocurre si el importe de la matrícula es igual a cero? Pues que será solución válida el no matricularse de nada. Como esto no se desea basta con modificar el enunciado de los contratos por lo siguiente:

g.	El importe de una asignatura no puede ser negativo ni cero.
h.	El importe de una matrícula no puede ser negativo ni cero.

Modificamos las postcondiciones anteriores:

	@Ensures("result > 0")
	public double getRegistrationFee() {
		
		double total = 0;
		
		for(Iterator<Course> it = courses.iterator(); it.hasNext();) {
			Course tmp = it.next();
			total += tmp.getFee();
		}
		
		return total;
		
	}
	
	@Ensures("result > 0")
	public abstract double getFee();
	
