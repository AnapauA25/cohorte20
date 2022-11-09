/*  */
const numeros = [2,4,6,57,200];
let suma =0; //valor base para que empieze a contar si no seria undefined
//ForEach
//recorre todo el arreglo y ejecuta el codigo sobre los valores guardados

/* let sumador = numeros.forEach(function sumar(elemento){
    suma = suma + elemento;
    //suma += elemento;
    return suma;
}); */

//lo que esta dentro del parentesis de foreach son variables
numeros.forEach((elemento, indice, arreglo) => {
    console.log(elemento, indice, arreglo);
})

//console.log(suma);
console.log(numeros);



/* map
genera una copia del arreglo original*/
let nuevoArr = numeros.map((el) => {
    return el * el;
});
console.log(nuevoArr);

/* FILTER 
crea una copia del arreglo original y nos permite filtrar*/

const frutas = ['papaya', 'manzana','manzana', 'uva'];

let frutaFiltrada = frutas.filter((fruta) => fruta.length <= 3);
console.log(frutaFiltrada);

