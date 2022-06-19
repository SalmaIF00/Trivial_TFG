USE Trivial;

/*TABLA USUARIO*/
/*INSERT INTO usuario (id_curso,nombre,apellidos,nombre_usuario,password,rol) VALUES ("Administrador", "Administrador", "administrador", "administrador","Administrador");
INSERT INTO usuario (id_curso,nombre,apellidos,nombre_usuario,password,rol) VALUES ("Profesor", "Profesor", "Profesor", "profesor","Profesor");
INSERT INTO usuario (id_curso,nombre,apellidos,nombre_usuario,password,rol) VALUES ("Usuario1", "Apellido1", "Usuario1", "usuario1","Alumno");
INSERT INTO usuario (id_curso,nombre,apellidos,nombre_usuario,password,rol) VALUES ("Usuario2", "Apellido2", "Usuario2", "usuario2","Alumno");*/

/*TABLA ROL*/
INSERT INTO rol (rol) VALUES ("Administrador");
INSERT INTO rol (rol) VALUES ("Profesor");
INSERT INTO rol (rol) VALUES ("Alumno");

/*TABLA INTERMEDIA USUARIO_ROL*/
/*INSERT INTO usuario_rol (id_usuario,id_rol) VALUES (1,1);
INSERT INTO usuario_rol (id_usuario,id_rol) VALUES (2,2);
INSERT INTO usuario_rol (id_usuario,id_rol) VALUES (3,3);
INSERT INTO usuario_rol (id_usuario,id_rol) VALUES (4,3);*/

/*TABLA CURSO*/
INSERT INTO curso (curso) VALUES ("1º DAW");
INSERT INTO curso (curso) VALUES ("2º DAW");

/*TABLA ASIGNATURA PRIMER CURSO*/
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (1,"Programación");
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (1,"Lenguaje de Marcas");
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (1,"Base de Datos");
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (1,"Entornos de Desarrollo");
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (1,"Sistemas Informáticos");
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (1,"Formación y orientación laboral");

/*TABLA ASIGNATURA SEGUNDO CURSO*/
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (2,"Desarrollo web en entorno cliente");
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (2,"Desarrollo web en entorno servidor.");
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (2,"Despliegue de aplicaciones web");
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (2,"Diseño de interfaces WEB.");
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (2,"Inglés");
INSERT INTO asignatura (id_curso,nombre_asignatura) VALUES (2,"Empresa e iniciativa emprendedora");

/*TABLA PREGUNTAS */
/*<=======================================PRIMER CURSO=================================================>*/
/*PREGUNTAS PROGRAMACION*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (1,"Selecciona los tipos de datos numéricos enteros");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (1,"Selecciona los tipos de datos numéricos decimales");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (1,"Es una clase en el paquete java.util utilizada para obtener la entrada datos como String, int, double, etc. Es la forma más fácil de leer datos en un programa Java");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (1,"Clase que contiene métodos para realizar operaciones numéricas básicas como las funciones exponenciales elementales, logaritmo, raíz cuadrada y trigonométricas.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (1,"Selecciona las opciones que correspondan a la declaración de variables");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (1,"Estructura que determina si se ejecutan unas acciones u otras según se cumpla o no una determinada condición.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (1,"Instrucción que permite seleccionar una opción de entre múltiples opciones posibles.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (1,"Instrucción que determina si se ejecutan unas acciones u otras según se cumpla o no una determinada condición.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (1,"Estructura en la cual las instrucciones se ejecutan en secuencia, una después de otra, en el orden en que aparecen escritas dentro del programa.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (1,"Qué es un objeto en Java?");

/*PREGUNTAS LENGUAJE DE MARCAS*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (2,"HTML es un lenguaje de programación? ");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (2,"El lenguaje de HTML funciona por medio de … ");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (2,"En HTML, las etiquetas <h1>, <h2> y <h3> se emplean para definir");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (2,"En HTML, la forma correcta de crear un comentario es..");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (2,"¿Cuál es la etiqueta para LISTAS DESORDENADAS?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (2,"¿Del siguiente código html cuál es el correcto? ");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (2,"La sintaxis de html es la siguiente:");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (2,"Dentro de estas etiquetas se encuentra todo el contenido que será visible en la página Web.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (2,"Con estas etiquetas se insertan líneas en la página Web.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (2,"  En HTML, las etiqueta <p> se emplea para definir");

/*PREGUNTAS BASE DE DATOS*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (3,"En MYSQL, ¿cuál de estas sentencias crea una base de datos?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (3,"En MYSQL, para eliminar los duplicados de las consultas de datos se utiliza:");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (3,"¿Con que sentencia se incluye las condiciones de los datos que queremos consultar? ");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (3,"¿Cuál cláusula permite ordenar los resultados a través de una o más columnas?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (3,"¿Qué es MYSQL?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (3,"¿Para modificar uno o varios datos de uno o varios registros utilizamos?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (3,"Para eliminar los registros de una tabla usamos el comando ");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (3,"¿Que es DDL?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (3,"Para que se utiliza una llave Primaria (PK) ");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (3,"Que es una Base de Datos ");

/*PREGUNTAS ENTORNO DE DESARROLLO*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (4,"UML, por sus siglas en ingles es ");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (4,"UML se utiliza para");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (4,"El Diagrama de casos de uso pertenece a los Diagramas de Comportamiento ");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (4,"El diagrama de secuencia describe");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (4,"El nombre de los siguientes componentes de los diagramas de caso de uso son ");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (4,"Para que sirve el comando el comando “git init”?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (4,"Con qué comando se cambia de rama en git?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (4," Cómo se sube el contenido de tu rama principal de local al remoto?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (4,"Qué es la rama master?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (4,"¿Cómo se descarga un repositorio?");

/*PREGUNTAS SISTEMAS INFORMATICOS*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (5,"¿Cual es el comando para averiguar el usuario actual en el terminal?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (5,"Comando que muestre el direcorio de trabajo, es decir, en el que estas ubicado.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (5,"El monitor es: ");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (5,"Para ver los permisos de los archivos en un directorio ejecutamos...");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (5,"¿Cuáles de los siguientes son Sistemas Operativos?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (5,"¿La CPU para qué sirve?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (5,"¿Los periféricos, son elementos externos de la computadora?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (5,"Se encarga de cambiar los permisos de acceso a los ficheros.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (5,"Que comando elimina un directorio.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (5,"Los permisos sí están representados por la letra: r , son de ? ");

/*PREGUNTAS FOL*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (6,"¿Qué significa el IRPF?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (6,"Las contingencias comunes que paga el empleado son un 4.7%.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (6,"Solo pueden firmar un contrato laboral los mayores de 18 años y los menores de 18 años legalmente emancipados");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (6,"El SMI de España en 2022 es de ...");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (6,"Tener un accidente de camino al trabajo, ¿se considera accidente laboral?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (6,"Un periodo de prueba puede durar hasta 2 años y medio.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (6,"Un contrato indefinido tiene un duración de 2 años.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (6,"¿Cuánto dura un contrato para la formación y el aprendizaje?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (6,"Empresa cuya actividad consiste en contratar trabajadores para poseriormente, cederlos a otra empresa.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (6,"La retribución de un contrato en prácticas no puede ser inferior al 60% el primer año.");

/*<=======================================SEGUNDO CURSO=================================================>*/
/*PREGUNTAS DESARROLLO WEB ENTORNO CLIENTE*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (7,"JavaScript es un lenguaje de programación o de secuencias de comandos.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (7,"¿Cuál no es un framework?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (7,"El token sirve para autenticar el diseño del html.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (7,"Las extensiones de lado del servidor permiten que una aplicación se comunique con el navegador.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (7,"¿Qué significa AJAX?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (7,"Var = variables y Const = constantes");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (7,"¿Qué es JavaScript?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (7,"Console.log sirve para mostrar por pantalla.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (7,"Onresize sirve para redimensionar el navegador sobre el objeto Window.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (7,"Cuál no es un elemento de formulario.");

/*PREGUNTAS DESARROLLO WEB ENTORNO SERVIDOR*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (8,"¿Qué es Spring Boot?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (8,"¿Qué son los beans?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (8,"Fichero en formato XML que almacena información del proyecto y configuración.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (8,"Significado de las siglas: POM");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (8,"¿Dónde se almacena el contenido estático?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (8,"Cuál no es un contenido estático.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (8,"Cuál es un motor de plantillas.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (8,"Cuál no son expresiones simples.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (8,"Las operaciones booleanas pueden ser: Operadores binarias (and, or) o negación booleana (!, not).");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (8,"En el controlador declaramos un método POST que será la que cargue el fichero HTML y un método GET para ejecutar cuando se envíe el formulario.");

/*PREGUNTAS DESPLIEGUE DE APLICACIONES WEB*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (9,"Comando que habilita módulos.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (9,"¿Cuál es el puerto TCP para HTTP por defecto?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (9,"Directivas que controlan tipo de documento.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (9,"En Directory se indicar la contraseña, para la autenticación.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (9,"Para reiniciar apache se utiliza...");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (9,"Para qué sirve el SSLEngine");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (9,"Para instalar se utiliza...");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (9,"Modificador para mostrar authuser.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (9,"¿Qué es el HOST?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (9,"Info en XML en memoria al iniciar Tomcat.");

/*PREGUNTAS DISEÑO DE INTERFACES WEB*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (10,"Comando para compilar scss a css");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (10,"¿Qué es la triada de color?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (10,"¿Cuál no es un tipo de daltonismo?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (10,"La imagen vectorial se basa en fórmulas matemáticos y no se dividen en unidades mínimas de información como los píxeles.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (10,"Una imagen vectorial puede exportarse a una imagen de mapa de bits.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (10,"Representa los derechos de autor que se le conceden a los creadores de una obra literaria, tema musical o artículo científico, entre otras.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (10,"Significado de UX y UI");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (10,"Cuáles no son estilos avanzados.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (10,"Facilidad con que las personas pueden utilizar una herramienta particular.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (10,"Grado pendiente del cual permite que cualquier objeto sea utilizado por todo el público.");

/*PREGUNTAS INGLÉS*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (11,"If there's no reply from his office phone.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (11,"Miss Scott is on the line for you.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (11,"Avoid letting the phone ring a lot.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (11,"Check the ... supply is working by trying it out with another device that works 	with electricity.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (11,"If a ... isn’t running fast enough, you might have to install it again.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (11,"If your computer doens't react at all, you can solve the problem using three ...");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (11,"A piece of glass that ccollects light.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (11,"Software that helps you do work tasks.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (11,"A phone with a loudspeaker and a microphone.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (11,"An object or machine made for a specific purpose.");

/*PREGUNTAS EMPRESA E INICIATIVA EMPRENDEDORA*/
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (12,"¿Qué son las empresas productoras?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (12,"El Stock máximo tiene presente el espacio físico y coste de la cantidad máxima.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (12,"A nivel empresarial, ¿qué significa ROP?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (12,"A nivel empresarial, ¿qué significa PP?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (12,"Productividad total = Valor de la producción / Coste de la producción");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (12,"¿Qué es la valoración de las existencias a nivel financiero?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (12,"¿Qué es un elevator pitch?");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (12,"Según los criterios de valoración, como el PMP o el FIFO, las existencias conservan su precio original.");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (12,"Los planes de acción comercial son...");
INSERT INTO pregunta (id_asignatura,pregunta) VALUES (12,"Si no tenemos experiencia previa, una forma de iniciar una empresa...");
/*TABLA RESPUESTAS*/
/*<=======================================PRIMER CURSO=================================================>*/
/*TABLA RESPUESTAS*/
/*<=======================================PRIMER CURSO=================================================>*/
/*RESPUESTAS PROGRAMACION*/
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (1,"String","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (1,"Int","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (1,"Double","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (1,"Float","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (2,"Double","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (2,"String","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (2,"Int","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (2,"Float","correcto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (3,"Char","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (3,"Scanner","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (3,"Boolean","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (3,"Main","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (4,"Math","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (4,"Scanner","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (4,"Main","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (4,"Ninguna de las anteriores","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (5,"int num, edad;","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (5,"final Strign Navidad = '25 de diciembre'","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (5,"String nombre;","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (5,"final double PI = 3.14159265;","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (6,"Estructura condicional","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (6,"Estructura Secuencial","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (6,"Estructura Repetitiva","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (6,"Todas son correctas","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (7,"IF","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (7,"SWITCH","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (7,"FOR","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (7,"WHILE","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (8,"IF","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (8,"SWITCH","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (8,"FOR","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (8,"WHILE","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (9,"Estructura condicional","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (9,"Estructura Secuencial","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (9,"Estructura Repetitiva","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (9,"Todas son correctas","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (10,"Es un elemento de software que intenta representar una entidad del mundo real.","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (10,"Son instancias de clases","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (10,"Personas o cosas a la que va dirigida una acción o pensamiento","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (10,"Es la identificación que permite diferenciar a un objeto y distinguirse de otros","incorrecto");

/*RESPUESTAS LENGUAJE DE MARCAS*/
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (11,"Verdadero","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (11,"Falso","correcto");


INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (12,"Palabras orales","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (12,"Acciones","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (12,"Etiquetas","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (12,"Ninguna de las anteriores","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (13,"Hipervinculos","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (13,"Encabezados","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (13,"Listas","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (13,"Tablas","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (14,"<-- El comentario -->","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (14,"<--! El comentario !-->","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (14,"<--! El comentario -->","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (14,"<!-- El comentario -->","correcto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (15,"<ul>","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (15,"<ol>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (15,"<li>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (15,"Ninguna de las anteriores","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (16,"<a href='https://www.bankinter.com'>Link a Bankinter</a>","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (16,"<a src='https://www.bankinter.com'>Enlace a Bankinter /a>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (16,"<a src='https://www.bankinter.com'>Link a Bankinter</a>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (16,"<a hfer='https://www.bankinter.com'>Link a Bankinter</a>","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (17,"<html>
<head></head>
</body>
<body>
</html>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (17,"<html>
<head>
<body></body>
</head>
</html>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (17,"<html>
<head></head>
<body>
</body>
</html>","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (17,"<html>
</head><head>
<body>
</body>
</html>","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (18,"<html> y </html>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (18,"<head> y </head>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (18,"<body> y </body>","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (18,"<!doctype HTML>","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (19,"<h1>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (19,"<hr>","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (19,"<br>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (19,"<tr>","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (20,"Un encabezado","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (20,"Un salto de linea","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (20,"Una imagen","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (20,"Un parrafo","correcto");

/*RESPUESTAS BASE DE DATOS*/
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (21,"ADD","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (21,"CREATE","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (21,"UPDATE","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (21,"INCLUDE","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (22,"ALTER TABLE","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (22,"CHANGE TABLE","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (22,"DISTINCT","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (22,"UPDATE","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (23,"WHERE","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (23,"INSERT","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (23,"SELECT","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (23,"FROM","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (24,"ORDER BY","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (24,"UPDATE","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (24,"SELECT","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (24,"INSERT INTO","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (25,"Es un sistema Gestor de Bases de Datos, el cual permite almacenar y posteriormente acceder a los datos de forma rápida y estructurada","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (25,"Es un Sistema Gestor de Bases diferenciales, que permiten almacenar y acceder a los datos","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (25,"Es un lenguaje estructurado para consultas y se utiliza para manipular la información en una base de datos.","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (25,"Se utiliza para relacionar las tablas","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (26,"UPDATE","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (26,"SELECT","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (26,"SHOW","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (26,"INSERT INTO","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (27,"ORDER BY","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (27,"DELETE","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (27,"DROP CHANGE","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (27,"DISTINCT","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (28,"Lenguaje de Datos Determinados","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (28,"Lenguaje de Definición de Datos","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (28,"Datos Definidos Limitados","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (28,"Lenguaje de Diseño de Datos","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (29,"Se utiliza para actualizar un registro","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (29,"Es la llave de la información","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (29,"Se utiliza para relacionar las tablas","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (29,"Se utiliza para crear una base de datos","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (30,"Información que no está relacionada pero que se guarda en registros","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (30,"Conjunto de tablas organizadas y posiblemente relacionadas entre si.","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (30,"Es el que permite almacenar información y luego no se puede acceder a ella, es privada","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (30,"Conjunto de archivos que no se relacionan entre si.","incorrecto");

/*RESPUESTAS ENTORNO DE DESARROLLO*/
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (31,"unit modeling language","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (31,"undefied modeling layer","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (31,"unit modeling layer","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (31,"undefined modeling laguage","correcto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (32,"Definir un sistema","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (32,"Detallar los artefactos en el sistema","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (32,"Documentar","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (32,"Todas son correctas","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (33,"Verdadero","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (33,"Falso","correcto");


INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (34,"Flujo de acciones secuenciales y el resultado de estas acciones","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (34,"Flujo de acciones no secuenciales y el resultado de estas acciones","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (34,"Flujo de acciones secuenciales","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (34,"Flujo de recursos necesarios para desarrollar una actividad","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (35,"inclusion, extension, caso de uso","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (35,"actor, caso de uso, sistema","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (35,"actor, componente,caso de uso","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (35,"Ninguna de las anteriores","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (36,"Para transformar un directorio en un trabajo de Git","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (36,"Para crear un repositorio remoto","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (36,"Para crear un init en git","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (36,"Para poder inicializar un repositorio de GitHub","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (37,"git branch nombreDelaRama","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (37,"git checkout nombreDelaRama","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (37,"git branch move nombreDelaRama","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (37,"git branch active nombreDelaRama","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (38,"git pull origin master","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (38,"git push origin master","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (38,"git commit -m “Subir archivos”","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (38,"git log origin master","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (39,"Es la rama del administrador","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (39,"Es la rama secundaria del usuario principa","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (39,"Es la rama principal de un repositorio","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (39,"Es la rama que se guardan los ficheros","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (40,"Con git pull","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (40,"Con git push","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (40,"Con git commit","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (40,"Con git log","incorrecto");

/*RESPUESTAS SISTEMAS INFORMATICOS*/
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (41,"Whoareyou","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (41,"Whoami","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (41,"Whoisthis","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (41,"whoisincharge","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (42,"cp","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (42,"pwd","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (42,"history","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (42,"mkdir","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (43,"Periférico de entrada","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (43,"Periférico de salida","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (43,"Periférico de entrada/salida","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (43,"Tipo de encapsulado","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (44,"chmod","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (44,"ls","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (44,"ls -l","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (44,"ls -la","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (45,"Windows","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (45,"Android","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (45,"Linux","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (45,"Oracle","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (46,"Sirve para que los programas en tu computadora funcionen.","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (46,"Este ejecuta instrucciones y procesa datos de la computadora.","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (46,"Ninguna es correcta","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (46,"Todas son correctas","correcto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (47,"Falso","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (47,"Verdadero","correcto");


INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (48,"Chow","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (48,"Chmod","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (48,"Chown","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (48,"Chmodd","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (49,"pwd","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (49,"cd <directorio>","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (49,"cat -n","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (49,"rmdir <directorio>","correcto");

INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (50,"Lectura","correcto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (50,"Escritura","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (50,"Ejecución","incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta,resultado) VALUES (50,"Todas son correctas","incorrecto");


/*RESPUESTAS FOL*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (51,"Impuesto sobre el valor añadido.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (51,"La Agencia Tributaria", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (51,"Impuesto sobre las Rentas de las Personas Físicas", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (51,"Impuesto sobre bienes inmuebles", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (52,"Verdadero", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (52,"Falso", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (53,"Verdadero", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (53,"Falso", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (54,"1000€", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (54,"1100€", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (54,"900€", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (54,"965€", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (55,"No", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (55,"Tal vez", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (55,"Sí", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (55,"NS/NR", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (56,"Verdadero", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (56,"Falso", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (57,"Verdadero", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (57,"Falso", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (58,"Mínimo 1 año y máximo 2, pudiendo alargar 12 meses más.", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (58,"Mínimo 6 meses y máximo 2, pudiendo alargar 12 meses más.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (58,"Las dos son correctas.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (58,"Ninguna de las anteriores.", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (59,"Escuela de empresas", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (59,"Escuela secundaria obligatoria", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (59,"ETT", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (59,"Escuelas postgrado", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (60,"Verdadero", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (60,"Falso", "incorrecto");

/*<=======================================SEGUNDO CURSO=================================================>*/
/*RESPUESTAS DWC*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (61,"Verdadero", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (61,"Falso", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (62,"Symphony", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (62,"Ruby", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (62,"XML", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (62,"Angular", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (63,"Verdadero", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (63,"Falso", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (64,"Verdadero", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (64,"Falso", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (65,"Angular JavaScript And XML", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (65,"Authentic JavaScript And XML", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (65,"Asynchrounous JavaScript And XML", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (65,"AFC Ajax Amsterdam", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (66,"Verdadero", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (66,"Falso", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (67,"Un lenguaje multiplataforma", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (67,"Lenguaje orientado a objetos", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (67,"Ambas son correctas", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (67,"Ninguna de las anteriores", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (68,"Verdadero", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (68,"Falso", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (69,"Verdadero", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (69,"Falso", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (70,"Type", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (70,"Checked", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (70,"Required", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (70,"id", "correcto"); /*RESPUESTA*/

/*RESPUESTAS DWS*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (71,"Un framework", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (71,"Un navegador", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (72,"Son instrucciones de un programa destinadas a ser ejecutadas por el microprocesador.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (72,"Es un objeto que el contenedor de Spring instancia, ensambla y maneja","correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (73,"Maven", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (73,"Gradle", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (73,"Pom", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (73,"Target", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (74,"Proyect Object Model", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (74,"Persist Object Model", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (75,"Templates", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (75,"Static", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (76,"CSS", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (76,"JS", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (76,"IMG", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (76,"HTML", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (77,"Thymeleaf", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (77,"Thymelead", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (78,"Variables, selección de variables, mensajes y link URL.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (78,"Texto, números, booleanos, nulo.", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (79,"Verdadero", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (79,"Falso", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (80,"Verdadero", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (80,"Falso", "correcto"); /*RESPUESTA*/

/*RESPUESTAS DESPLIEGUE*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (81,"a2dismod", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (81,"a2enmod", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (82,"80", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (82,"40", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (83,"FileInfo", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (83,"Indexed", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (83,"Limit", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (83,"AuthConfig", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (84,"Verdadero", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (84,"Falso", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (85,"service apache2 reload", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (85,"service apache2 stop", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (86,"Genera el certificado digital del propio apache.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (86,"Activa o desactiva SSL", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (86,"Genera la clave privada del servidor.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (86,"Ninguna de las anteriores.", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (87,"Update", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (87,"Install", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (88,"%u", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (88,"%b", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (89,"Grupo de apps web, cómo los VH, permiten tener varios Vserver en una máquina.", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (89,"Conectan apps de cliente, mediante un puerto.", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (90,"MemoryRealm", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (90,"JDBCRealm", "incorrecto");

/*RESPUESTAS DIW*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (91,"sass --watch input.scss output.css", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (91,"sass --watch input.css output.scss", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (92,"Conjunto de tres colores situados a la misma distancia entre sí y dentro del tono cromático", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (92,"Conjunto de tres colores situados a la misma distancia entre sí y dentro del círculo", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (93,"Tricromía anómala", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (93,"Dicromacia", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (93,"Monocromía", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (93,"Todas son tipos de daltonismo", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (94,"Verdadero", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (94,"Falso", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (95,"Verdadero", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (95,"Falso", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (96,"Contrato", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (96,"Copyright", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (96,"Cláusula", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (96,"Correo electrónico", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (97,"User Experience y User Interface", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (97,"Unit Experience y Unit Interface", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (98,"CSS, Bootstrap, Sass", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (98,"XML, XLMS, XMI", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (99,"Usabilidad", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (99,"Accesibilidad", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (100,"Usabilidad", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (100,"Accesibilidad", "correcto"); /*RESPUESTA*/

/*RESPUESTAS INGLÉS*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (101,"So I'll phone him later.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (101,"He's probably working off-site.", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (102,"She nees to place an order.", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (102,"Press 9 for an outside line.", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (103,"So call them as soon as possible.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (103,"Answer it quickly.", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (103,"He's probably working off-site.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (103,"So I'll phone him later.", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (104,"screws", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (104,"power", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (105,"program", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (105,"cord", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (106,"keys", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (106,"volume ", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (106,"screws ", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (106,"computer ", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (107,"Lens", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (107,"Glass", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (108,"Office Apps", "correcto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (108,"Food","incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (109,"Microphone", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (109,"Speakerphone", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (110,"Clothes", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (110,"Device", "correcto"); /*RESPUESTA*/

/*RESPUESTAS EIE*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (111,"Compran, transforman y venden", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (111,"No compran pero venden o prestan un servicio", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (112,"Verdadero", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (112,"Falso", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (113,"Reigstro de osteopatas profesionales", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (113,"Retinopatía de la prematuridad", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (113,"Reglamento Orgánico Pleno", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (113,"Punto de pedido o reorder point", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (114,"Partido Popular", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (114,"Punto de pedido", "correcto"); /*RESPUESTA*/

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (115,"Verdadero", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (115,"Falso", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (116,"Ajustar la producción y distribución", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (116,"Evitar ruptura de stocks", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (116,"Conocer los recursos necesarios a la hora de realizar neuvos pedidos.", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (116,"Ninguna de las anteriores.", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (117,"Convencer a alguien en cierto tiempo", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (117,"Discurso en el ascensor", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (118,"Según el PMP no y el FIFO sí.", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (118,"Según el PMP sí y el FIFO no.", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (119,"el precio, el producto, la promoción y la distribución.", "correcto"); /*RESPUESTA*/
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (119,"pueden recopilarse para la ocasión o utilizar los de otros proyectos.", "incorrecto");

INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (120,"de las pequeñas empresas.", "incorrecto");
INSERT INTO respuesta (id_pregunta,respuesta, resultado) VALUES (120,"es la franquicia.", "correcto"); /*RESPUESTA*/
/*TABLA RESULTADO*/

/*MOSTRAR TABLAS*/
use Trivial;
SHOW TABLES;
SELECT * FROM usuario ;
SELECT * FROM rol ;
SELECT * FROM usuario_rol ;
SELECT * FROM curso ;
SELECT * FROM asignatura ;
SELECT * FROM pregunta ;
SELECT * FROM respuesta ;
SELECT * FROM resultado ;

/*INSERTAR USUARIOS*/
INSERT INTO usuario(id_curso, nombre, apellidos, nombre_usuario, password, rol) VALUES (2,"jugador1","jugador1","jugador1","$2a$10$WU3j1l96yRfv5PCcWJGPxuPgjhA603Phn5xbj3R5AZ3iqgS3ty5Oy","Alumno");
INSERT INTO usuario(id_curso, nombre, apellidos, nombre_usuario, password, rol) VALUES (2,"jugador2","jugador2","jugador2","$2a$10$T.VoeprJOkuXcleedFNpvu/bn6L/nEq8iuQMxcMV/.xGCJMr0BmSi","Alumno");
INSERT INTO usuario(id_curso, nombre, apellidos, nombre_usuario, password, rol) VALUES (1,"jugador3","jugador3","jugador3","$2a$10$bRC1QJ0Jo8Jsh8mW.Onl6OmLvHS7LLlKfRexTTWBApKT1cCQcxR02","Alumno");
INSERT INTO usuario(id_curso, nombre, apellidos, nombre_usuario, password, rol) VALUES (2,"jugador4","jugador4","jugador4","$2a$10$RjLpVyEj5N1y8R.E.AN1JO8bjeeJVKHK8cFeSgRzu9nkof1PWljA2","Alumno");
INSERT INTO usuario(id_curso, nombre, apellidos, nombre_usuario, password, rol) VALUES (1,"jugador5","jugador5","jugador5","$2a$10$F55alPSPuV4oSDszl3Y6xOyvz5s2NzKVu6Ip5PLRlky.7ReBR/oKK","Alumno");
INSERT INTO usuario(id_curso, nombre, apellidos, nombre_usuario, password, rol) VALUES (2,"profesora","profesora","profesora","$2a$10$3zlKyCg.UQ26AQEXWiP3jesbCqN.yiHMIhKoYRFEbNv8Y6xymqP/e","Profesor");
INSERT INTO usuario(id_curso, nombre, apellidos, nombre_usuario, password, rol) VALUES (1,"jessica","jessica","jessica","$2a$10$3zlKyCg.UQ26AQEXWiP3jesbCqN.yiHMIhKoYRFEbNv8Y6xymqP/e","Administrador");

/*INSERTAR ROL*/
INSERT INTO usuario_rol(id_usuario, id_rol) VALUES (1,3);
INSERT INTO usuario_rol(id_usuario, id_rol) VALUES (2,3);
INSERT INTO usuario_rol(id_usuario, id_rol) VALUES (3,3);
INSERT INTO usuario_rol(id_usuario, id_rol) VALUES (4,3);
INSERT INTO usuario_rol(id_usuario, id_rol) VALUES (5,3);
INSERT INTO usuario_rol(id_usuario, id_rol) VALUES (6,2);
INSERT INTO usuario_rol(id_usuario, id_rol) VALUES (7,1);


/*INSERTAR RESULTADOS*/
INSERT INTO resultado(id_usuario, resultado) VALUES (1,3);
INSERT INTO resultado(id_usuario, resultado) VALUES (2,1);
INSERT INTO resultado(id_usuario, resultado) VALUES (1,6);
INSERT INTO resultado(id_usuario, resultado) VALUES (3,4);
INSERT INTO resultado(id_usuario, resultado) VALUES (5,8);
INSERT INTO resultado(id_usuario, resultado) VALUES (4,3);
INSERT INTO resultado(id_usuario, resultado) VALUES (3,10);
INSERT INTO resultado(id_usuario, resultado) VALUES (2,1);
INSERT INTO resultado(id_usuario, resultado) VALUES (1,0);
INSERT INTO resultado(id_usuario, resultado) VALUES (1,6);
INSERT INTO resultado(id_usuario, resultado) VALUES (1,3);
INSERT INTO resultado(id_usuario, resultado) VALUES (4,10);
INSERT INTO resultado(id_usuario, resultado) VALUES (3,8);
INSERT INTO resultado(id_usuario, resultado) VALUES (4,6);
INSERT INTO resultado(id_usuario, resultado) VALUES (5,8);
INSERT INTO resultado(id_usuario, resultado) VALUES (2,9);
INSERT INTO resultado(id_usuario, resultado) VALUES (1,2);
INSERT INTO resultado(id_usuario, resultado) VALUES (2,3);
INSERT INTO resultado(id_usuario, resultado) VALUES (2,4);
INSERT INTO resultado(id_usuario, resultado) VALUES (4,1);
