/*operadores*/
SELECT * FROM  productos;
SELECT * FROM productos WHERE idCategoria=4 and precio=12.50 and existencia>10;
SELECT * FROM productos;
SELECT  * FROM productos WHERE idCategoria =2 OR precio = 10;

select * from productos where idCategoria != 1; /*not, diferente a uno*/
select * from productos where idCategoria <> 2; /*not, diferente */

/*los null y not null*/
select * from productos where precio is not null;
/*between and */
SELECT * FROM productos WHERE precio not BETWEEN 10 and 13;