//propiedades de arreglos lenght

const frutas = ["pera", "manzana", "guayaba"];
console.log(frutas);

console.log(frutas.length);

//metodos acciones

//push agrega al final
frutas.push("sandia", "limon");
console.log(frutas);

//unshift agrega al inicio
frutas.unshift("guanabana");
console.log(frutas);

//metodos para quitar

//pop quita al final
frutas.pop();
console.log(frutas);

let elemento = frutas.pop();
console.log(frutas);
console.log(elemento);

//shift quita al inicio
frutas.shift();
console.log(frutas);

//IndexOf  nos permite buscar 

console.log(frutas.indexOf("Manzana"));

//reverse()
frutas.reverse();
console.log(frutas);

//sort
frutas.sort();
console.log(frutas);

const numeros = [4,567, 2, 4566, 45, 78, 1];
//numeros.sort((a,b) => a-b) ;

numeros.sort(function order(a,b) {return a-b}); //funcion callback
console.log(numeros);


