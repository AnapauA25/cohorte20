/* const foo = () => console.log("First");
const bar = () => setTimeout(() => console.log("Second"), 500);
const baz = () => console.log("Third");

bar();
foo();
baz(); */

//servidor
 const nombre = () => {
    const nombres = ["pepe", "tono", "maria"];

    setTimeout(()=>{
        return nombres;

    },0); 

 return new Promise((resolve, reject) =>  {  //resolve proceso exitoso
   
    setTimeout(() => {                   //reject proceso no exitoso
        if(false){
            resolve(nombres);
        }else{
            reject("No hay nombres");
        }
        
    }, 1)
});

 }
 nombre().then(nombres => console.log(nombres)).catch(error => console.warn(error));

//servidor  

//console.log(nombre()[0]);


/* const url = "https://pokeapi.co/api/v2/pokemon/25";
//promesas
const pokedex = ()=> {
    fetch(url)
    .then((datos) => {return datos.json()})
    .then((pokemon)=> {console.log(pokemon)//estan encadenados
    .catch(error => console.log(error))// es una buena practica en caso que se presente algun error
    })
}; 
pokedex(); */

//azucar sintactica codigo que se creo para facilitar el trabajo de los programadores
//async await

const obtenerNombre = async () => {
try{
    let nombres = await nombre();
    console.log(nombres);
} catch (error){
obtenerNombre();
}
}
//otra funcion
const cartaPokemon = document.getElementById("pokemon");
const nombrePokemon = document.getElementById("nombre");
const formu = document.getElementById("formu");
//para poner imagen
const imagen = document.getElementById('img');

//const url = "https://pokeapi.co/api/v2/pokemon/200";
const pokedex = async (numero) => {
    const url = `https://pokeapi.co/api/v2/pokemon/${numero}`;
    try{
        const respuesta = await fetch(url);
        const pokemon = await respuesta.json();
        console.log(pokemon.name); //muestra el nombre del pokemon que esta asignado
//nombrePokemon.textContent = pokemon.name; //al final de la url 25 es pikachu

const datos = {
    nombre: pokemon.name,
    imagen:pokemon.sprites.other['official-artwork'].front_default,
}
nombrePokemon.textContent = datos.nombre;
imagen.innerHTML = `<img src="${datos.imagen}" alt="imagen de ${datos.nombre}"/>`
    } catch (error){

    }
}


formu.addEventListener("submit", (evento)=>{
    //codigo a ejecutarse
    evento.preventDefault();
    const valor = document.getElementById("idP").value;
    //console.log(evento);

    console.log(valor);
    pokedex(valor);

    formu.reset();//borra los datos una vez que los busca
});

