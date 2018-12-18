# Document here the issues associated to items g) and h)
g) Como el fee de un Course no puede ser negativo, he creado TestMasterCourse que extienda de Course(donde esta el invariante de fee) con un constructor donde le paso tambien un campo fee.

h) Como el fee de un Registration no puede ser negativo, he creado TestRegistration que extienda de Registration(donde esta el invariante de fee) donde sobreestribo el método para que devuelva una fee negativa.