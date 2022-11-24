//definiendo un objeto de manera explicita
let persona ={              //objeto
    nombre: "Ana",            //propiedads  
    apellido: "Angeles",       //propiedades
    nombreCompleto: function(){ //metodo
        return "el nombre es "+ this.nombre + this.apellido;
    }
}

for (nombrePropiedad in persona) {
   console.log("atributos");
   console.log(nombrePropiedad);
   console.log("valor"+ persona[nombrePropiedad]);
        
    }

console.log(persona);
console.log(persona.nombreCompleto());
console.log(persona['apellido']);
persona.tel = '5512345678';
console.log(persona.tel); 
delete persona.tel
console.log(persona);
let personaArreglo = Object.values(persona);
let personaString = JSON.stringify(persona); //convertir un objeto a formato  JSON
console.log(personaString);


//definiendo un objeto de manera implicita
/* let persona1 = new Object(); //creando objetos y object constructor
persona1.edad = 23;          //atributo
console.log(persona1);
console.log(persona1.edad); */