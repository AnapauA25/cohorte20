/*Subconsultas*/
SELECT * FROM productos WHERE idCategoria = 2 and precio >10 and existencia between 5 and 20 and fecha_alta is not null;
SELECT * FROM categoria WHERE id >2;

select * from productos
where idCategoria
IN (SELECT id FROM categoria WHERE id >2);

