/*JOINS*/
SELECT * FROM productos;
SELECT * FROM productos, categoria WHERE idCategoria= id;

SELECT p.nombre, p.precio, p.existencia, c.nombre FROM productos as p INNER JOIN categoria as c ON p.idCategoria= c.id;
SELECT p.nombre, p.precio, p.existencia, t.nombre FROM productos as p RIGHT JOIN tempo as t ON p.idCategoria= t.id;
SELECT * FROM productos, categoria WHERE idCategoria= id;

SELECT * FROM categoria UNION 
SELECT * FROM proveedores;
/*MULTI CONSULTA*/
SELECT p.nombre, c.nombre FROM productos as p INNER JOIN categoria as c ON p.idCategoria=c.id;

SELECT p.nombre, c.nombre FROM productos as p LEFT JOIN categoria as c ON p.idCategoria=c.id LEFT JOIN detalle_producto_proveedor ON p.idProducto=det.idProducto;

select p.nombre as nomp, c.nombre as nomcat, pv.nombre as nom_proveedor
from productos as p
inner join categoria as c
on p.idCategoria = c.id
inner join detalle_producto_proveedor as det
on p.idProducto=det.idProducto
inner join proveedores as pv
on det.idProveedor = pv.id
WHERE p.existencia > 20;


SELECT idCategoria FROM productos;



