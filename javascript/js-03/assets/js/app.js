//control de flujo

let edad = Number(prompt("Escribe tu edad "));
/*
console.log(edad === 18);

if(edad <= 17){
    document.write("menor de edad");

}else if(edad === 18){
    document.write("Ya tienes 18")
}else if(edad> 18){
    document.write("Mayor de edad")

}
else{
    document.write("Eso no es un numero");
}

//operadores logicos && || !

if(edad > 0 && edad<= 17){
    document.write("menor de edad");

}else if(edad === 18){
    document.write("Ya tienes 18");
}else if(edad> 18){
    document.write("Mayor de edad");
}else if(edad<0){
    document.write("Es un numero negativo");
}
else{
    document.write("Eso no es un numero");
}
*/
let dia = 1;
    if(dia===1){
        document.write("Lunes");
    }else if (dia ===2){
        document.write("martes");
    }

//operador ternario o elvis
//if simplificado
let edad2 = 18; 

let mensaje = edad2 >= 18 //condicion
? "es mayor de edad" //si es verdad se ejecuta
: "tas chiquito";   //se ejecuta si es falso

console.log(mensaje);



