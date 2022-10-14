let valor1 = prompt("Agrega el primer numero: ");
let valor2 = prompt("Agrega el segundo numero: ");
let valor3 = prompt("Agrega el tercer numero: ");

let comparar = [valor1, valor2, valor3];

if (valor1 == valor2) {
    console.log("los numeros son iguales.");
    
}
if (valor2 == valor3) {
    console.log("los numeros son iguales.");
}
if (valor3 == valor1) {
    console.log("los numeros son iguales.");
}
comparar.sort((a,b) => a-b);
console.log(comparar);

comparar.reverse();
console.log(comparar);

/*function comparar(valor1, valor2,  valor3){
    if (valor1 == valor2) {
        console.log("los numeros son iguales.");
        
    }
    if (valor2 == valor3) {
        console.log("los numeros son iguales.");
    }
    if (valor3 == valor1) {
        console.log("los numeros son iguales.");
    }
    console.log(comparar.sort((a, b) => a-b));
}
//reverse()
frutas.reverse();
console.log(frutas);

//sort
frutas.sort();
console.log(frutas);

console.log(comparar);
console.log(reverse(comparar));*/