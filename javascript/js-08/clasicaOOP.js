class OperacionesAritmeticas {
     numero0 = 0;        //atributos de la clase
     numero1 = 0;

    constructor  (valor0, valor1){
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar(a, b){        //metodo de acceso
        return a +b;
    }

    set numero0(num0){
        this.numero0 = num0;
    }

    set numero1(num1){
        this.numero1 = num1;
    }
    get numero0(){
        return this.numero0;
    }
    get numero1(){
        return this.numero1;
    }
}

let obj1;
 obj1= new OperacionesAritmeticas(8, 6); //hay un constructor implicito
console.log(obj1.sumar());
console.log(obj1.numero0);
let obj2 = new OperacionesAritmeticas();
obj2.numero0 = 8; //asisgnacion de valores a set
obj2.numero1 = 4;   //asignacion de valores a set
console.log(obj2.numero0);
console.log(obj2.sumar(5, 6));
console.log('obj1 : ' + obj1.sumar(obj1.numero0,obj1.numero1)); //get
console.log(obj2.sumar(obj2.numero0, obj2.numero1));            //get



