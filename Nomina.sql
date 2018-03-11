CREATE DATABASE Nomina;
USE Nomina;

CREATE TABLE Empleado(
	IDempleado INT AUTO_INCREMENT,
	nomEmpresa VARCHAR(40),
	fechaIngreso DATE,
	nombre VARCHAR(50),
	cargo VARCHAR(30),
	edad DATE,
	CURP VARCHAR(30),
	RFC VARCHAR(13),
	telefono INT(15),
	correo VARCHAR(30),
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
	PRIMARY KEY(IDrecibo),
	FOREIGN KEY(IDempleado) REFERENCES Empleado(IDempleado)
);
