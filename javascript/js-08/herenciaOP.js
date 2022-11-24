/* class   Persona{                    //clase padre
    constructor (nombre, apellido){ //parametro
        this._nombre = nombre;      //_miembro
        this._apellido = apellido;
    }

    set nombre(nombre){         //metodo
        this._nombre = nombre;  //_miembro | parametro
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
}
//herencia clase hija
class Empleado extends Persona{
       constructor(nombre,apellido,empresa){
       super(nombre, apellido); //para acceder al padre, definiendo E1
        this._empresa = empresa;
    }
    set empresa(empresa){
        this._empresa = empresa;
    }
    get empresa(){
        return this._empresa;
    }
//se sobreescribe el metodo padre al hijo y agrego el atributo de hijo
    nombreCompleto(){
        return super.nombreCompleto() + ' '+ this._empresa;
    }
    //sobreescritura del metodo tostring de la clase Object
    toString (){
        return this.nombreCompleto();
    }

}

let p1 = new Persona('Hugo', 'Boss');
console.log(p1.nombreCompleto());
console.log(p1.toString());

let E1 = new Empleado('Juan', 'Prez', 'Liverpool');
console.log(E1.nombreCompleto());
console.log(E1.toString);


 */

//Resuelto
class Persona{

    constructor (nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    set nombre (nombre){
        this._nombre = nombre;
    }
    set apellido (apellido){
        this._apellido = apellido;
    }
    nombreCompleto () {
        return this._nombre + ' ' +this._apellido;
    } 
    // Sobre escritura del metodo toString de la clase Object
    toString () {
        return this.nombreCompleto();
    }   
}

class Empleado extends Persona{

    constructor(nombre, apellido, empresa){
        
        super(nombre,apellido);
        this._empresa = empresa;
    }
    set empresa (empresa){
        this._empresa = empresa;
    }
    get empresa (){
        return this._empresa;
    }  
    //Sobre escritura del metodo
    nombreCompleto () {
        return super.nombreCompleto() + ' ' + this._empresa;
    } 

}

let p1 = new Persona('Hugo', 'Sanchez');
console.log(p1.nombreCompleto());
console.log(p1.toString());

let E1 = new Empleado('Juan', 'Perez', 'coopel');

console.log(E1.nombreCompleto());
console.log(E1.toString())