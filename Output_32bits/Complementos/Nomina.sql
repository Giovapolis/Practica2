CREATE TABLE Empleado(
	IDempleado INT AUTO_INCREMENT,
	nomEmpresa VARCHAR(40),
	fechaIngreso DATE,
	NOMBRE VARCHAR(30) NOT NULL,
	APATERNO VARCHAR(30) NOT NULL,
	AMATERNO VARCHAR(30) NOT NULL,
	EDAD INT NOT NULL,
	TEL VARCHAR(15),
	CEL VARCHAR(12),
	CURP VARCHAR(30),
	RFC VARCHAR(13),
	correo VARCHAR(30),
	cargo VARCHAR(30),
	CALLE TEXT,
	NUM_INT VARCHAR(5),
	NUM_EXT VARCHAR(5),
	COLONIA TEXT,
	MUNICIPIO TEXT,
	ESTADO TEXT,
	PRIMARY KEY(IDempleado)
);

CREATE TABLE Asistencia(
	IDasistencia INT AUTO_INCREMENT,
	IDempleado INT,
	diasTrab INT,
	faltas INT,
	PRIMARY KEY(IDasistencia),
	FOREIGN KEY(IDempleado) REFERENCES Empleado(IDempleado)
);

CREATE TABLE Recibo(
	IDrecibo INT AUTO_INCREMENT,
	IDempleado INT,
	IDsueldo INT,
	LOGO LONGBLOB,
	PRIMARY KEY(IDrecibo),
	FOREIGN KEY(IDempleado) REFERENCES Empleado(IDempleado)
);
