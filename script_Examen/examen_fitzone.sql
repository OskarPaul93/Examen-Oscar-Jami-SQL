CREATE TABLE socios (
    id_socio INT PRIMARY KEY,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    fecha_registro VARCHAR(10) NOT NULL,
    activo BOOLEAN NOT NULL
);

INSERT INTO socios values (1,'Oscar', 'Jami', 25, '2026-01-15', TRUE);
INSERT INTO socios values (2, 'Maria', 'Lopez', 16, '2026-03-20', TRUE);
INSERT INTO socios values (3, 'Andres', 'Lucas', 32, '2026-05-10', FALSE);
INSERT INTO socios values (4, 'Sofia', 'Torres', 14, '2026-08-25', TRUE);
INSERT INTO socios values (5, 'Daniel', 'Vargas', 45, '2026-11-05', TRUE);


select* from socios;


-- CONSULTA 1
SELECT nombres, apellidos, edad FROM socios WHERE activo = TRUE AND edad > 18;


-- CONSULTA 2
SELECT * FROM socios WHERE fecha_registro > '2026-02-01';


-- CONSULTA 3
SELECT * FROM socios ORDER BY edad DESC;

ALTER TABLE socios
ADD COLUMN email VARCHAR(100);



-- 4.2 ACTUALIZAR EL EMAIL DE UN SOCIO

UPDATE socios SET email = 'andres.lucas@gmail.com' WHERE id_socio = 3;
