# Document here the issues associated to items g) and h)
Habia pensado poner como invariante getRegistrationFee()>0 pero me saltaba otro error en otro test, entonces añado la condicion a añadir course con que getRegistrationFee() + coure.getFee()x  sea mayor de 0.


# P.D:
Sobre el tema de comprobar que no se registran más de 10 cursos, he intentado de varias formas de crear enums aleatorios y cambiar los datos pensando
en la posibilidad de que si fuesen 150 cursos no vas a meter 151 lineas con addCourse() para ver si falla, aunque creo que en ese caso no se usaría un enum.