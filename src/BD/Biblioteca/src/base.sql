CREATE DATABASE Biblioteca;

USE Biblioteca;

CREATE TABLE Libros (
    ID_Libro INT PRIMARY KEY AUTO_INCREMENT,
    Titulo VARCHAR(100) NOT NULL,
    Autor VARCHAR(50) NOT NULL,
    Año_Publicacion INT NOT NULL,
    Genero VARCHAR(30) NOT NULL,
    Disponible BOOLEAN DEFAULT TRUE
);
