const titulo = document.getElementById("titulo");
const parrafos = document.getElementsByClassName("parrafo");

/* titulo.textContent = "hola"; */
parrafos[0].innerHTML = "soy un parrafo";

console.log(titulo.textContent);
console.log(parrafos[1].textContent);


/* parrafos[1].style.color ="violet";
parrafos[1].style.backgroundColor = "gold"; */

parrafos[1].classList.add("coloresFeos");

//crear elementos html
const padre = document.getElementById("padre");

const enlace = document.createElement("a");
enlace.href = "https://google.com";
enlace.textContent = "Ir a google";

/* //lo agregamos al body para que se pueda mostrar
document.body.appendChild(enlace); */

/* document.body.insertAdjacentElement("beforeend",enlace); */
padre.appendChild(enlace);


console.log(document.body);


