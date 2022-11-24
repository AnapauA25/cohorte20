let constructor = function (){
    let valor0 = 0;
    let valor1 = 0;


    //declarando al objeto
    let persona = {
        nombre: 'Pedro',
        apellido: 'Navajas',
        suma: function(a, b){
            return a+b;
        },
        get nombre2 (){          //metodo de acceso
            return this.nombre;
        },
        set nombre2 (nombre1){
            this.nombre = nombre1;
        }
    };
    return persona;
};
let p1 = constructor ();
p1.nombre = 'Carlos'; //se redefine el nombre en el objeto
console.log(p1.nombre);
/* let p1= new constructor();
console.log(p1); */