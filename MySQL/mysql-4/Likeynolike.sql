/*LIKE */
SELECT * FROM productos WHERE nombre LIKE 'Limonada';

SELECT * FROM productos WHERE nombre LIKE 'palomita%';
SELECT * FROM productos WHERE nombre LIKE '%Limon%';

SELECT * FROM productos WHERE nombre NOT LIKE '%Limon%';