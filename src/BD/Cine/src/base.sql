CREATE DATABASE Cine;

USE Cine;

CREATE TABLE Peliculas(
    ID_Pelicula INT AUTO_INCREMENT PRIMARY KEY,
    Titulo VARCHAR(100) NOT NULL,
    Genero VARCHAR(50) NOT NULL,
    Duracion INT NOT NULL
);

CREATE TABLE Salas(
    ID_Sala INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Capacidad INT NOT NULL
);

CREATE TABLE Reservas(
    ID_Reserva INT AUTO_INCREMENT PRIMARY KEY,
    ID_Pelicula INT NOT NULL,
    ID_Sala INT NOT NULL,
    Fecha DATE NOT NULL,
    Hora TIME NOT NULL,
    Nombre_Cliente VARCHAR(100) NOT NULL,
    Asientos_Reservados INT NOT NULL,
    CONSTRAINT fk_pelicula FOREIGN KEY (ID_Pelicula) REFERENCES Peliculas(ID_Pelicula) ON DELETE CASCADE,
    CONSTRAINT fk_sala FOREIGN KEY (ID_Sala) REFERENCES Salas(ID_Sala) ON DELETE CASCADE
);

INSERT INTO Peliculas (Titulo, Genero, Duracion)
VALUES 
('Inception', 'Ciencia ficción', 148),
('La La Land', 'Musical', 128),
('El Señor de los Anillos', 'Fantasía', 201);

INSERT INTO Salas (Nombre, Capacidad)
VALUES 
('Sala A', 50),
('Sala B', 30),
('Sala C', 80);

INSERT INTO Reservas (ID_Pelicula, ID_Sala, Fecha, Hora, Nombre_Cliente, Asientos_Reservados)
VALUES
(1, 1, '2025-06-01', '18:00:00', 'Ana López', 4),
(2, 2, '2025-06-01', '19:00:00', 'Carlos Ruiz', 2),
(3, 3, '2025-06-02', '20:30:00', 'María Torres', 6);
