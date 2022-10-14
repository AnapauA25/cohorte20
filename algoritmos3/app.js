//array-Arreglos nos permite guaradar mas de una variable
let arr1 = new Array("Raul", 3, true);
console.log(arr1);


//notacion de corchetes, para ubicar rapido un dato
console.log(arr1[1]); //muestra el 3

//modificar valores o agregar
console.log(arr1[3]);
arr1[3] = 234;
console.log(arr1[3]);

/*arr1[10]= 5;
console.log(arr1); si nos permite hacer esto aunque haya 6 lugares vacios*/

arr1[10]= "GDL";
console.log(arr1);

let arr2 = ["CDMX", 7, false];
console.log(arr2);

arr2[0]= "holi";
console.log(arr2)
//alert(arr2);

//dentro de los arreglos se pueden declar con const
const arr3 = [];
console.log(arr3);
arr3 [4] = "holi";
console.log(arr3);

//arreglos multidimensionales o matrices
//un arreglo dentro de otro
const arr4 = [1, "adios", false, [1, 3]];
console.log(arr4[2]);
console.log(arr4[3][0]); //para que muestre el 1




