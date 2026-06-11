CREATE DATABASE academia;
USE academia;

-- Tabla cursos
CREATE TABLE cursos (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
duracion INT -- horas
);

-- Tabla estudiantes
CREATE TABLE estudiantes (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
edad INT,
id_curso INT,
FOREIGN KEY (id_curso) REFERENCES cursos(id)
);

-- Insertar cursos
INSERT INTO cursos (nombre, duracion) VALUES
('Programación Java', 120),
('Bases de Datos', 90),

('Desarrollo Web', 100);

-- Insertar estudiantes
INSERT INTO estudiantes (nombre, edad, id_curso) VALUES
('Ana López', 20, 1),
('Carlos Pérez', 22, 2),
('Lucía Gómez', 19, 1);