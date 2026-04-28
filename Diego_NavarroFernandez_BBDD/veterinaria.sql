CREATE DATABASE veterinaria;
USE veterinaria;

CREATE TABLE propietarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    telefono VARCHAR(20)
);

CREATE TABLE mascotas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    especie VARCHAR(50),
    edad INT,
    id_propietario INT,
    FOREIGN KEY (id_propietario) REFERENCES propietarios(id)
);

INSERT INTO propietarios (nombre, telefono) VALUES
('Laura Gómez', '600111222'),
('Pedro Ruiz', '611222333');

INSERT INTO mascotas (nombre, especie, edad, id_propietario) VALUES
('Toby', 'Perro', 5, 1),
('Misu', 'Gato', 3, 2);