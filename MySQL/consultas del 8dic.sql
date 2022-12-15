SHOW COLUMNS FROM productos;
INSERT INTO productos (nombre, precio, fecha_alta, idCategoria, existencia)
VALUES ('brownie', 19.50, curdate(), 11, 40);
UPDATE productos SET existencia = 10 WHERE idProducto = 23;
update productos SET nombre='mini brownies', precio= 15.50, existencia= 2 where idProducto=25;

SELECT * FROM categoria;
SELECT * FROM productos;

alter table productos add column marca varchar(20) not null;
UPDATE productos SET marca ='Bimbo' WHERE idProducto = 23;

INSERT INTO categoria VALUES (NULL, 'Dulces'); 
INSERT INTO categoria (nombre) VALUES ('Refrescos');

UPDATE productos SET precio =3 WHERE idProducto = 26;

UPDATE productos SET precio = REPLACE (precio, 5, 6);

UPDATE productos SET precio = REPLACE (precio, 3, 13);

INSERT INTO productos(nombre, precio, fecha_alta, idCategoria, existencia, marca) VALUES ('tamarindo', 5, curdate(), 13, 100, 'picafresa');

DELETE FROM categoria WHERE id=8;

truncate table categoria;

SET foreign_key_checks=0;
truncate table categoria;
SET foreign_key_checks=1;

SELECT * FROM categoria WHERE id>=9;

INSERT INTO categoria values ('a');

SELECT COUNT (idProducto)FROM productos GROUP BY idCategoria;

SELECT idProducto FROM productos group by idCategoria;
INSERT INTO categoria (nombre) VALUES ('c');