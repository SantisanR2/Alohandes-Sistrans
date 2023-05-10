INSERT INTO PERSONANATURAL VALUES (1, 'Gabriela', '1000000', 17);
INSERT INTO PERSONANATURAL VALUES (2, 'Maria Gomez', '987654321', 30);
INSERT INTO PERSONANATURAL VALUES (3, 'Pedro Rodriguez', '456789123', 40);
INSERT INTO PERSONANATURAL VALUES (4, 'Carla Hernandez', '789123456', 22);
INSERT INTO PERSONANATURAL VALUES (5, 'Luisa Perez', '321654987', 35);
INSERT INTO PERSONANATURAL VALUES (6, 'Fernando Martinez', '654987321', 50);
INSERT INTO PERSONANATURAL VALUES (7, 'Marta Ramirez', '234567890', 27);
INSERT INTO PERSONANATURAL VALUES (8, 'Diego Sanchez', '890123456', 33);
INSERT INTO PERSONANATURAL VALUES (10, 'Pablo Fernandez', '901234567',28);

INSERT INTO APARTAMENTO VALUES(1, 'Calle 1, Ciudad 1', 1000000, 900000, 120, 1, 'SI');
INSERT INTO APARTAMENTO VALUES(2, 'Calle 2, Ciudad 2', 750000, 0, 90, 2, 'NO');
INSERT INTO APARTAMENTO VALUES(3, 'Calle 3, Ciudad 3', 1200000, 1000000, 150, 3, 'SI');
INSERT INTO APARTAMENTO VALUES (4, 'Calle 4, Ciudad 4', 850000, 0, 110, 4, 'NO');
INSERT INTO APARTAMENTO VALUES(5, 'Calle 5, Ciudad 5', 900000, 800000,100,5,'SI');

INSERT INTO COMUNIDAD VALUES (1, 'Comunidad 1', 35);
INSERT INTO COMUNIDAD VALUES (2, 'Comunidad 2', 28);
INSERT INTO COMUNIDAD VALUES (3, 'Comunidad 3', 42);
INSERT INTO COMUNIDAD VALUES (4, 'Comunidad 4', 25);
INSERT INTO COMUNIDAD VALUES (5, 'Comunidad 5',37);

INSERT INTO EMPRESAHOTELERA VALUES   (1, 'Hotel 1', '123456', '789012');
INSERT INTO EMPRESAHOTELERA VALUES (2, 'Hotel 2', '234567', '890123');
INSERT INTO EMPRESAHOTELERA VALUES   (3, 'Hotel 3', '345678', '901234');
INSERT INTO EMPRESAHOTELERA VALUES(4, 'Hotel 4', '456789', '012345');
INSERT INTO EMPRESAHOTELERA VALUES(5, 'Hotel 5', '567890', '123456');

INSERT INTO HABITACIONCOMPARTIDA VALUES(1, 'Habitaci�n compartida 1', 'Ubicaci�n 1', 'ESTANDAR', 1, 50000, 25, '08:00', '22:00');
INSERT INTO HABITACIONCOMPARTIDA VALUES(2, 'Habitaci�n compartida 2', 'Ubicaci�n 2', 'SEMISUITE', 1, 80000, 30, '07:00', '23:00');
INSERT INTO HABITACIONCOMPARTIDA VALUES(3, 'Habitaci�n compartida 3', 'Ubicaci�n 3', 'ESTANDAR', 2, 40000, 22, '06:00', '20:00');
INSERT INTO HABITACIONCOMPARTIDA VALUES(4, 'Habitaci�n compartida 4', 'Ubicaci�n 4', 'SUITE', 3, 150000, 40, '09:00', '21:00');
INSERT INTO HABITACIONCOMPARTIDA VALUES(5, 'Habitaci�n compartida 5', 'Ubicaci�n 5', 'ESTANDAR', 4, 60000, 28, '08:00','22:00');

INSERT INTO HABITACIONVIVIENDA VALUES(1, 'Calle Falsa 123', 30000, 25000, 20, 1);
INSERT INTO HABITACIONVIVIENDA VALUES(2, 'Avenida Siempre Viva 742', 40000, 30000, 25, 2);
INSERT INTO HABITACIONVIVIENDA VALUES(3, 'Calle del Pez Dorado 246', 20000, 15000, 18, 3);
INSERT INTO HABITACIONVIVIENDA VALUES(4, 'Avenida Revoluci�n 666', 35000, 28000, 22, 4);
INSERT INTO HABITACIONVIVIENDA VALUES(5, 'Calle de la Amargura 999', 25000,20000,16,5);

INSERT INTO HOTEL VALUES(1, 'Hotel del Sol', 'Calle del Sol 123', 'ESTANDAR', 50000, 30, 1);
INSERT INTO HOTEL VALUES(2, 'Hotel del Mar', 'Avenida del Mar 456', 'SEMISUITE', 75000, 40, 2);
INSERT INTO HOTEL VALUES(3, 'Hotel del Centro', 'Calle del Centro 789', 'SUITE', 100000, 50, 3);
INSERT INTO HOTEL VALUES(4, 'Hotel de la Monta�a', 'Calle de la Monta�a 246', 'ESTANDAR', 40000, 25, 4);
INSERT INTO HOTEL VALUES(5, 'Hotel del Bosque', 'Calle del Bosque 135', 'SEMISUITE',60000,35,5);

INSERT INTO VIVIENDAPORDIA VALUES(1, 'Calle del Sol 123', '2 habitaciones, 1 ba�o', 'Seguro contra incendios', 50000, 60, 1);
INSERT INTO VIVIENDAPORDIA VALUES(2, 'Avenida del Mar 456', '1 habitaci�n, 1 ba�o', 'Seguro contra robos', 75000, 40, 2);
INSERT INTO VIVIENDAPORDIA VALUES(3, 'Calle del Centro 789', '3 habitaciones, 2 ba�os', 'Seguro contra inundaciones', 100000, 90, 3);
INSERT INTO VIVIENDAPORDIA VALUES(4, 'Calle de la Monta�a 246', '2 habitaciones, 1 ba�o', 'Seguro contra terremotos', 40000, 50, 4);
INSERT INTO VIVIENDAPORDIA VALUES(5, 'Calle del Bosque 135', '1 habitaci�n, 1 ba�o', 'Seguro contra accidentes',60000,30,5);

INSERT INTO VIVIENDAUNIVERSITARIA VALUES(1, 'Residencia XXI', 'RC-123456', 'RS-123456');
INSERT INTO VIVIENDAUNIVERSITARIA VALUES(2, 'Vivienda UCV', 'RC-654321', 'RS-654321');
INSERT INTO VIVIENDAUNIVERSITARIA VALUES(3, 'Casa del Estudio', 'RC-987654', 'RS-987654');
INSERT INTO VIVIENDAUNIVERSITARIA VALUES(4, 'Residencia UNEFA', 'RC-111111', 'RS-111111');
INSERT INTO VIVIENDAUNIVERSITARIA VALUES(5, 'La Casa de Todos', 'RC-222222', 'RS-222222');

INSERT INTO VIVIENDAPORSEMESTRE VALUES(1, 'Calle 23 #15-25', 2, 'S�', 800000, 25, 1);
INSERT INTO VIVIENDAPORSEMESTRE VALUES(2, 'Calle 45 #24-10', 1, 'No', 500000, 20, 2);
INSERT INTO VIVIENDAPORSEMESTRE VALUES(3, 'Carrera 8 #10-45', 3, 'S�', 1000000, 30, 1);
INSERT INTO VIVIENDAPORSEMESTRE VALUES(4, 'Carrera 15 #30-20', 2, 'S�', 700000, 25, 3);
INSERT INTO VIVIENDAPORSEMESTRE VALUES(5, 'Calle 72 #7-15', 1, 'No',400000,18,2);

INSERT INTO USUARIO VALUES(1, 'Juan Perez', '1234567890', 30, '3121234567', 'Estudiante');
INSERT INTO USUARIO VALUES(2, 'Maria Rodriguez', '0987654321', 25, '3009876543', 'Empleado');
INSERT INTO USUARIO VALUES(3, 'Pedro Gomez', '4567890123', 40, '3204567890', 'Docente');
INSERT INTO USUARIO VALUES(4, 'Ana Torres', '5432109876', 35, '3105432109', 'Estudiante');
INSERT INTO USUARIO VALUES(5, 'Luisa Fernandez', '1357902468', 28, '3151357902','Empleado');

INSERT INTO ALOHAMIENTO VALUES(1, 1, null, null, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(2, 2, null, null, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(3, 3, null, null, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(4, 4, null, null, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(5, 5, null, null, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(6, null, 1, null, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(7, null, 2, null, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(8, null, 3, null, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(9, null, 4, null, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(10, null, 5, null, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(11, null, null, 1, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(12, null, null, 2, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(13, null, null, 3, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(14, null, null, 4, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(15, null, null, 5, null, null, null);
INSERT INTO ALOHAMIENTO VALUES(16, null, null, null, 1, null, null);
INSERT INTO ALOHAMIENTO VALUES(17, null, null, null, 2, null, null);
INSERT INTO ALOHAMIENTO VALUES(18, null, null, null, 3, null, null);
INSERT INTO ALOHAMIENTO VALUES(19, null, null, null, 4, null, null);
INSERT INTO ALOHAMIENTO VALUES(20, null, null, null, 5, null, null);
INSERT INTO ALOHAMIENTO VALUES(21, null, null, null, null, 1, null);
INSERT INTO ALOHAMIENTO VALUES(22, null, null, null, null, 2, null);
INSERT INTO ALOHAMIENTO VALUES(23, null, null, null, null, 3, null);
INSERT INTO ALOHAMIENTO VALUES(24, null, null, null, null, 4, null);
INSERT INTO ALOHAMIENTO VALUES(25, null, null, null, null, 5, null);
INSERT INTO ALOHAMIENTO VALUES(26, null, null, null, null, null, 1);
INSERT INTO ALOHAMIENTO VALUES(27, null, null, null, null, null, 2);
INSERT INTO ALOHAMIENTO VALUES(28, null, null, null, null, null, 3);
INSERT INTO ALOHAMIENTO VALUES(29, null, null, null, null, null, 4);
INSERT INTO ALOHAMIENTO VALUES(30, null, null, null, null, null, 5);

INSERT INTO RESERVA VALUES(1, '2023-01-01', 150000, 1, 1);
INSERT INTO RESERVA VALUES(2, '2023-02-01', 120000, 1, 1);
INSERT INTO RESERVA VALUES(3, '2023-05-07', 140000, 1, 1);
INSERT INTO RESERVA VALUES(4, '2023-02-12', 80000, 5, 2);
INSERT INTO RESERVA VALUES(5, '2023-03-15', 100000, 5, 2);
INSERT INTO RESERVA VALUES(6, '2023-05-05', 70000, 5, 2);
INSERT INTO RESERVA VALUES(7, '2023-05-08', 50000, 2, 3);
INSERT INTO RESERVA VALUES(8, '2023-02-20', 650000, 4, 4);
INSERT INTO RESERVA VALUES(9, '2023-01-10', 250000, 3, 5);
INSERT INTO RESERVA VALUES(10, '2023-04-18', 145000, 3, 5);

INSERT INTO SERVICIO VALUES(1, 'Desayuno buffet', 'Desayuno completo tipo buffet', 10000, 1);
INSERT INTO SERVICIO VALUES(2, 'Lavander�a', 'Servicio de lavander�a y planchado', 15000, 2);
INSERT INTO SERVICIO VALUES(3, 'Transporte aeropuerto', 'Transporte desde/hasta el aeropuerto', 50000, 3);
INSERT INTO SERVICIO VALUES(4, 'Servicio de limpieza', 'Servicio de limpieza diario', 20000, 4);
INSERT INTO SERVICIO VALUES(5, 'Cena a la carta', 'Cena a la carta en el restaurante del hotel', 25000, 5);

INSERT INTO PROVEEDOR VALUES(1, 1, null, null, null);
INSERT INTO PROVEEDOR VALUES(2, 2, null, null, null);
INSERT INTO PROVEEDOR VALUES(3, 3, null, null, null);
INSERT INTO PROVEEDOR VALUES(4, 4, null, null, null);
INSERT INTO PROVEEDOR VALUES(5, 5, null, null, null);
INSERT INTO PROVEEDOR VALUES(6, null, 1, null, null);
INSERT INTO PROVEEDOR VALUES(7, null, 2, null, null);
INSERT INTO PROVEEDOR VALUES(8, null, 3, null, null);
INSERT INTO PROVEEDOR VALUES(9, null, 4, null, null);
INSERT INTO PROVEEDOR VALUES(10, null, 5, null, null);
INSERT INTO PROVEEDOR VALUES(11, null, null, 1, null);
INSERT INTO PROVEEDOR VALUES(12, null, null, 2, null);
INSERT INTO PROVEEDOR VALUES(13, null, null, 3, null);
INSERT INTO PROVEEDOR VALUES(14, null, null, 4, null);
INSERT INTO PROVEEDOR VALUES(15, null, null, 5, null);
INSERT INTO PROVEEDOR VALUES(16, null, null, null, 1);
INSERT INTO PROVEEDOR VALUES(17, null, null, null, 2);
INSERT INTO PROVEEDOR VALUES(18, null, null, null, 3);
INSERT INTO PROVEEDOR VALUES(19, null, null, null, 4);
INSERT INTO PROVEEDOR VALUES(20, null, null, null, 5);

INSERT INTO DINERORECIBIDO VALUES(15000, 2019, 1);
INSERT INTO DINERORECIBIDO VALUES(10000, 2000, 2);
INSERT INTO DINERORECIBIDO VALUES(90000, 2019, 3);
INSERT INTO DINERORECIBIDO VALUES(23500, 2015, 4);
INSERT INTO DINERORECIBIDO VALUES(24000, 2023, 5);
INSERT INTO DINERORECIBIDO VALUES(17000, 2019, 6);
INSERT INTO DINERORECIBIDO VALUES(11000, 2000, 7);
INSERT INTO DINERORECIBIDO VALUES(900000, 2019, 8);
INSERT INTO DINERORECIBIDO VALUES(238500, 2015, 9);
INSERT INTO DINERORECIBIDO VALUES(255200, 2023, 10);
INSERT INTO DINERORECIBIDO VALUES(15360, 2019, 11);
INSERT INTO DINERORECIBIDO VALUES(10580, 2000, 12);
INSERT INTO DINERORECIBIDO VALUES(35000, 2019, 13);
INSERT INTO DINERORECIBIDO VALUES(24700, 2015, 14);
INSERT INTO DINERORECIBIDO VALUES(325000, 2023, 15);
INSERT INTO DINERORECIBIDO VALUES(14700, 2019, 16);
INSERT INTO DINERORECIBIDO VALUES(258960, 2000, 17);
INSERT INTO DINERORECIBIDO VALUES(35450, 2019, 18);
INSERT INTO DINERORECIBIDO VALUES(87450, 2015, 19);
INSERT INTO DINERORECIBIDO VALUES(24684, 2023, 20);

INSERT INTO INDICEOCUPACION VALUES(28, 1);
INSERT INTO INDICEOCUPACION VALUES(10, 2);
INSERT INTO INDICEOCUPACION VALUES(30, 3);
INSERT INTO INDICEOCUPACION VALUES(5, 4);
INSERT INTO INDICEOCUPACION VALUES(2, 5);
INSERT INTO INDICEOCUPACION VALUES(18, 6);
INSERT INTO INDICEOCUPACION VALUES(12, 7);
INSERT INTO INDICEOCUPACION VALUES(31, 8);
INSERT INTO INDICEOCUPACION VALUES(54, 9);
INSERT INTO INDICEOCUPACION VALUES(23, 10);
INSERT INTO INDICEOCUPACION VALUES(28, 11);
INSERT INTO INDICEOCUPACION VALUES(17, 12);
INSERT INTO INDICEOCUPACION VALUES(36, 13);
INSERT INTO INDICEOCUPACION VALUES(55, 14);
INSERT INTO INDICEOCUPACION VALUES(29, 15);
INSERT INTO INDICEOCUPACION VALUES(20, 16);
INSERT INTO INDICEOCUPACION VALUES(14, 17);
INSERT INTO INDICEOCUPACION VALUES(38, 18);
INSERT INTO INDICEOCUPACION VALUES(1, 19);
INSERT INTO INDICEOCUPACION VALUES(21, 20);
INSERT INTO INDICEOCUPACION VALUES(7, 21);
INSERT INTO INDICEOCUPACION VALUES(3, 22);
INSERT INTO INDICEOCUPACION VALUES(87, 23);
INSERT INTO INDICEOCUPACION VALUES(90, 24);
INSERT INTO INDICEOCUPACION VALUES(92, 25);
INSERT INTO INDICEOCUPACION VALUES(19, 26);
INSERT INTO INDICEOCUPACION VALUES(82, 27);
INSERT INTO INDICEOCUPACION VALUES(81, 28);
INSERT INTO INDICEOCUPACION VALUES(57, 29);
INSERT INTO INDICEOCUPACION VALUES(67, 30);

COMMIT;



