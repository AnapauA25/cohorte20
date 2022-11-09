let precio = Number(prompt("Introduce el precio: "));
let cupon = prompt("Introduce tu cupon: ");
let descuento = 0;
switch (cupon){
    case  "bronce":     
        descuento = 0.05;
    break;

    case  "plata":     
        descuento = 0.1;
    break;

    case  "oro":     
        descuento = 0.2;
    break;

    case  "platino":     
        descuento = .25;
    break;

    default:
        document.write("El cupon no es valido");
    break;
}
    /*Escribir un programa que detecte el cupón que tiene el usuario
Bronce se le hará un descuento del 5 %
Plata se le hará un descuento del 10%
Oro se le hará un descuento del 20%
Platino se le hará el descuento del 25%
-El usuario introduce el precio primero y después el cupón
-El programa debe mostrar el precio original y el precio con el descuento aplicado
-También debe mostrar el mensaje "El cupón no es válido" en caso de que sea un 
 cupón equivocado
*/