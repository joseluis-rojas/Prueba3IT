-- Tabla de usuarios
CREATE TABLE usuarios (
  id INT AUTO_INCREMENT PRIMARY KEY,
  correo VARCHAR(255) UNIQUE
);

-- Tabla de estilos
CREATE TABLE estilos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  estilo VARCHAR(255)
);

-- Tabla de relación entre usuarios y estilos
CREATE TABLE usuarios_estilos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  correo VARCHAR(255),
  estilo VARCHAR(255)
);

INSERT INTO estilos (estilo) VALUES ('rock');
INSERT INTO estilos (estilo) VALUES ('pop');
INSERT INTO estilos (estilo) VALUES ('clasica');
INSERT INTO estilos (estilo) VALUES ('salsa');

INSERT INTO usuarios_estilos (correo, estilo) VALUES ('correo01@correo.com','rock');
INSERT INTO usuarios_estilos (correo, estilo) VALUES ('correo02@correo.com','rock');
INSERT INTO usuarios_estilos (correo, estilo) VALUES ('correo03@correo.com','rock');
INSERT INTO usuarios_estilos (correo, estilo) VALUES ('correo04@correo.com','rock');
INSERT INTO usuarios_estilos (correo, estilo) VALUES ('correo05@correo.com','rock');
INSERT INTO usuarios_estilos (correo, estilo) VALUES ('correo06@correo.com','rock');
INSERT INTO usuarios_estilos (correo, estilo) VALUES ('correo07@correo.com','pop');
INSERT INTO usuarios_estilos (correo, estilo) VALUES ('correo08@correo.com','pop');


