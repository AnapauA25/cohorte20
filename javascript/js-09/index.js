/*  console.log("Hola mundo Node"); */
//alert("Hola"); hay algunas cosas en node que no las puede ejecutar y si requiere del navegador
const parrotSay = require('parrotsay-api')
 
parrotSay('Satoshi campeon mundial')
  .then(console.log)
  .catch(console.error)

