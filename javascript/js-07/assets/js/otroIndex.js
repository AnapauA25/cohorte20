//forma no. 1 para crear un elemento

 //primero llamar al acontenedor
let imagen = document.getElementsByClassName("contenedor")[0];
console.log(imagen);

//segundo crear el elemento
const nuevaImg = document.createElement("img");

//tercero modificar atributos
nuevaImg.src = "https://placeimg.com/200/200/nature";

nuevaImg.alt = "Imagen de naturaleza";

//cuarto insertar el elemento
imagen.appendChild(nuevaImg); 



/* FORMA No.2 */
//Primero llamar al elemento padre
const imagen2 = document.getElementById("img");

//Segundo 
imagen2.innerHTML =`
<img src="https://placeimg.com/200/200/animals"/> 
`;

//crear una lista apartir de los elementos guardados en un arreglo
//insertarla en el documento para que se pueda mostrar

const nombres = ["Pedro","Juan","Sonia","Miguel"];

//FORMA1
const lista1 = document.getElementById("lista1");

nombres.forEach((el) => {
    const li = document.createElement('li');
    li.textContent = el;
    lista1.appendChild(li);
});

//FORMA 2
const frutas = ["manzana", "limon", "pera", "uva"];
const lista2 = document.getElementById("lista2");
frutas.forEach((el)=>{
    lista2.innerHTML += `<li>${el}</li>`;//esto es lo mismo que el comentario de abajo
});
//lista2 = lista + elemento; para que muestre todos los elementos de la lista

