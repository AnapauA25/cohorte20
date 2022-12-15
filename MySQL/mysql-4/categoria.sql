SELECT * FROM tiendita.categoria;
SELECT * FROM tiendita.productos;
SELECT nombre, precio, existencia FROM productos;
select * from categoria;
/*max(), min()*/

SELECT nombre, precio, existencia, idCategoria FROM productos WHERE idCategoria<=2;
SELECT min(existencia) as pocos_productos, max(existencia) as muchos_productos FROM productos;
/*limit*/
SELECT * FROM productos limit 3, 5;
/*asc, desc*/
SELECT * FROM productos ORDER BY nombre ASC;
SELECT * FROM productos ORDER BY  existencia desc;



