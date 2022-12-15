/*para la ayudad de consultas LISTAS*/
/*in y not in*/
SELECT * FROM productos;
SELECT * FROM productos WHERE precio in (6.5, 15, 18);
SELECT * FROM productos WHERE precio NOT IN (6.5, 15, 18);

SELECT * FROM productos WHERE DATE(fecha_alta) BETWEEN '2015-01-01' AND '2016-07-14';

/*operadores aritmeticos*/
SELECT * FROM productos WHERE precio = 10+8;
SELECT * FROM productos WHERE precio = 15-3;

SELECT (nombre), avg(precio) as promedio_precios FROM productos WHERE idProducto=1 GROUP BY idProducto;