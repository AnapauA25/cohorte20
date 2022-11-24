//const calculadora = require ("../calculadora"); prueba que busque el archivo index
import { indexTest } from "../calculadora"; //lo que voy a importar de index.js con babel
test ("test suma", () => {
    const result = indexTest.suma(1, 2);//estamos dando valores a la funcion suma
    expect (result).toBe(3) //evaluando los resultados, lo que se supone que debe resultar
});
test.todo("test de resta");
test.todo("test de multiplicacion");
test.todo("test de division");