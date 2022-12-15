class Persona{
    constructor (nombre, apellido, edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

};



class Empleado extends Persona{
    constructor (nombre, apellido, edad, IdEmp, sueldo){
        super(nombre, apellido, edad);
        this.IdEmp = IdEmp;
        this.sueldo = sueldo;

    }
    set FechaRegistro (FechaRegistro){
        this._FechaRegistro = FechaRegistro;
    }
    get FechaRegistro (){
        return this._FechaRegistro;
    } 

};

class Cliente extends Persona{
    constructor(nombre, apellido, edad, IdCliente, FRegistro){
        super(nombre, apellido, edad);
        this.IdCliente = IdCliente;
        this.FRegistro = FRegistro;
    }
    set Sueldo (Sueldo){
        this._Sueldo = Sueldo;
    }
    get Sueldo (){
        return this._Sueldo;
    } 

};


let p1 = new Persona ('', '', '');
console.log(p1);
let Em1 = new Empleado ('', '', '');
console.log(Empleado);
let Cli1 = new Cliente ('', '', '');
console.log(Cli1);