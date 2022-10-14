alert("Hola mundo desde Visual studio Code");
//comentario de una linea 
let miVariable; //declaracion de una variable


//inicializar variable, la variable no puede estar vacia
const otraVariable = 5;
let nombre = "Ana";
miVariable = "Hola";


console.log(otraVariable);
//la diferencia entre let y const es la mutacion de valor, reasignacion. Solo en let
//const no permite cambiar el valor
console.log(miVariable);
miVariable = "Adios";
console.log(miVariable);

let palabra = "Cualquier palabra /-]";
let palabra2 = 'holi';
console.log(palabra);
console.log(palabra2);

//number numeros
let num = 3;
let num2 =65.098;

console.log(num, num2);
//boolean true or false
let verdadero= true;
let falso= false;
console.log(verdadero);
console.log(falso);

//null este tipo de dato genera errores en js es una variable vacia intencionalmente o evitar ciertos tipos de errores como en const
//nospermite 'apartar' lugares
const varConst = null;
console.log(varConst);
let valorNulo = null;
console.log(valorNulo);

//undefined es un estado, en js no esta ocupando espacio en la memoria
let varUn;
console.log(varUn);

//operador typeof nospermite conocer eel tipo de dato
let a = 1;
let b = "hola";

console.log(typeof a);
console.log(typeof b);
console.log(typeof true); 


