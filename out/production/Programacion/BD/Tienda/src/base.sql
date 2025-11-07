CREATE DATABASE Tienda;

USE Tienda;

CREATE TABLE Clientes (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellidos VARCHAR(100),
    email VARCHAR(100),
    telefono VARCHAR(20)
);
