# laboratorio2

Laboratorio 2 - Ingenieria de Software - UMG

Alumno: Joan Manuel Diaz Salazar

Carne: 1290-15-4845

Descripcion:

El repositorio contiene 2 proyectos creados con springboot y con base de datos H2. Ambos con el objetivo de ejecutar servicios RESTful, los cuales son: "estudiantes" y "cursos".

El proyecto estudiantes (levantado en el puerto 9001): 

Trabajado con la entidad estudiantes que posee los siguientes campos:

-id: long

-nombre_completo: varchar

-numero_carne: varchar

-fecha_nacimiento: datetime

-telefono: varchar

-direccion: varchar

-correo: varchar

-dpi: varchar

URL DE SERVICIOS RESTFUL:

- URL: /estudiantes/buscarTodos

- URL: /estudiantes/registrar


El proyecto cursos (levantado en el puerto 9002):

Trabajado con las entidades cursos y catedraticos que poseen los siguientes campos:

Curso

-id: long

-nombre: varchar

-descripcion: varchar

-creditos: int

-semestre: int

Catedratico

-id: long

-nombres: varchar

-apellidos: varchar

-codigo_catedratico: varchar

URL DE SERVICIOS RESTFUL

URL: /cursos/buscarTodos

URL: /cursos/crear

URL: /catedratico/buscarTodos

URL: /catedratico/registrar
