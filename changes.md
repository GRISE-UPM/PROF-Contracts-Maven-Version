# Document here the issues associated to items g) and h)
Tal y como está el código no es posible conseguir una fee negativa para la clase "Registration" sin que fuera negativa también en las clases "Course". Se han creado duplicados de las clases en la clase test.

Sobreescribiendo la clase getRegistrationFee() en el duplicado de la clase para evitar el problema.