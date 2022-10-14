//let miVariable = prompt("Cual es tu nombre: "); //muestra una caja de texto, recibimos un valor

//function saludoPer(){ //aqui solamente estamos declarando un solo valor
 //   alert(miVariable);      //no hacemos cambio de valor
//}
//saludoPer(miVariable);  //aqui ya muestra el valor que ingresamos en la caja
//
/*let miVariable = prompt("Cual es tu nombre: "); //muestra una caja de texto, recibimos un valor

function saludoPer(){
    alert(miVariable);*/
//}
/*function suma(){ 
    let num1 = parseInt( prompt("de el valor numero 1: "));
    let num2 = parseInt(prompt("de del valor numero 2: "));
    let resultado = num1 + num2;
    return resultado;
}
 let r = suma();
 alert(r);  
//suma();*/
function suma(){
    let valor1 = 4;
    let valor2 = 7;
    return valor1 + valor2;
}
console.log ("El resultado de la suma: "+ suma());

function resta(){
    let valor1 = 6;
    let valor2 = 1;
    return valor1 - valor2;
}
console.log ("El resultado de la resta: "+ resta());

function division(){
    let valor1 = 30;
    let valor2 = 0;
    if (valor2 == 0){
        console.log("El denominador es 0");
    }
    return valor1 / valor2;
}
console.log ("El resultado de la division: "+ division());

function multiplicacion(){
    let valor1 = 4;
    let valor2 = 7;
    return valor1 * valor2;
}
console.log ("El resultado de la multiplicacion: ", multiplicacion());
function resto(){
    let valor1 = 2;
    let valor2 = 7;
    return valor1 % valor2;
}
console.log ("El resultado del resto: "+ resto());

function adicionales(){
    let valor1 = 7;
    valor1 /= valor1;
    return(valor1);
}
console.log(adicionales());

function logico(){
    let valido = true;
    console.log("El valor booleano es" + valido);
    
}
logico();

//funcion void
function edad(){
    let miEdad = 8;
    if(miEdad >= 18){
        console.log("Eres mayor de edad");
    }
    else{
console.log("No eres mayor de edad");
    }
}
edad();
//else  es como la prueba logica no ha sido satisfactoria
//la funcion else esta dentro de las llaves
//si la llamada esta dentro de las llaves es como llamarte a ti mismo

/* los operadores logicos me van hacer estructuras de control mas grandes
como el and, or y not, &&, ||, ! */

function conjuncion(){
    let valor1 = true;
    let valor2 = false;
    if(valor1 && valor2){ //and
        console.log("El valor 1 y el valor 2 son verdaderos");

    }
    else{
        console.log("Un valor es falso");
    }
}
conjuncion();

function disjuncion(){
    let valor1 = false;
    let valor2 = true;

    if(valor1 ||  valor2){ //or
        console.log("El operador OR es verdadero");
     }
      else {
            console.log("El operador OR es falso");
        }
    
}
disjuncion();

function negacion(){
    let valor1 = false;
    if (!( !valor1 )){
        console.log("El valor es: " + valor1);
    }
    else{
        console.log("El valor negado es: " + valor1);
    }
}
negacion();