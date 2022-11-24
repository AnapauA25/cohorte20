/*let miNom = "Ana Paula";
console.log(miNombre);*/

function miNombre(){
    let nombre= "Paula";
    console.log(nombre);
}

miNombre ();
//---------------------------------
function funcionUno(){
    let valor = 2;
    valor = valor +3;
    return valor;
}

let resultado = funcionUno();
console.log("el resultado es: ", resultado);
//-----------------------------------------------
function funcionEjemplo(){
    let valor1 =2;
    valor1 = valor1 + 3;
    console.log("El resultado de valor1: " + valor1);
}

funcionEjemplo();

//variable global
let variableGlobal = 7;
function funcion3(){
    let variablelocal = "El valor es: "
    console.log(variablelocal + variableGlobal);
}

funcion3();
   
//Parametros
function funcion4 (valor){
    let numero = 6;
    numero = numero * valor;
    return numero;
}
let salida = funcion4(3);
console.log("El producto es: ", salida);

//funciones anonimas
let miFuncion0 = function(parametro){
    parametro = parametro * 2;
    return parametro;
}
console.log("Llamando a la funcion anonima "+ miFuncion0 (4));

let funcion01 = function (caracteres){
    return "Hola "+ caracteres;
}("Lunes");
console.log("El aviso es: "+ funcion01);

//funcion flecha
let suma = (x, y) =>{ return x+y};
let resultadof = suma(5, 3);
console.log("La suma es:", resultadof);

//Ejercicio Calcular el precio total de una compra

function precioTotal(precio) {
   
    let impuesto = 1.16;
    let envio = 10;
    let total = (precio*impuesto)+envio;
    console.log(total);
}
precioTotal(23.34);

/*let precioTotal = function (precio) {
   
    let impuesto = 1.16;
    let envio = 10;
    return (precio*impuesto)+envio;
   
}(23.34);
console.log("El precio es: "+ precioTotal);
*/
//DECLARACION DE OBJETOS
let miObjeto = {
    nombre: "Ana",
    edad: 10,
    datos: function (){
        let mensaje = "tu nombre es: " + this.nombre;
        mensaje += " tienes " + this.edad + " anios";
        console.log(mensaje);
    }
};
miObjeto.datos();
//constructor objetos
let constructor = function(){
    let objPersona = {
        nombre: "Juan",
        nss: 2357,
        datosPersona: function (){
            let msj= "Eres " + this.nombre + " tu numero nss es:" + this.nss;
            console.log(msj);
        },
        otroMetodo: function (parametro){
            let numero = 8;
            console.log("La suma es : "+ (numero+parametro));
        }
    };
    return objPersona;
}
//para la llamada del constructor primero llamamos al objeto y despues a los parametros
let varObjReg = constructor()//crear la variable llamada objeto
//dentro de un objeto
varObjReg.datosPersona();
varObjReg.otroMetodo(5);




