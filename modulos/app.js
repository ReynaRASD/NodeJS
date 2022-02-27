/*
var nombre = "Reyna";

nombre=true;
//console.log(nombre);

let array = ["reyna", "RASD", "wenas"];
//console.log(array[1]);


//objetos
let curso ={
    tema:"nodeJS", 
    leccion:"datos compuestos"
}
//console.log(curso.tema);

function saludo(){
    return "hola";
}

//metodos
let calculos = {
    duplicar: function(valor){
        return valor*2;
    },

    sumar:function (valor) {
        return valor+2;
      }
}

//console.log(saludo());

console.log(calculos.duplicar(10), calculos.sumar(10));
*/


/////////////////////////////////////////////
//console.log(process.platform);
//console.log(process.execPath);
//console.log(process.env);

//////////////////////////////////////////
//IMPORTANDO MODULO MOMENT  libreria
/*
var moment = require('moment');

console.log(moment('1999-12-31').format('DD/MM/YY').toString());
*/

////////////////////////
//MODULOS LOCALES archivo miModulo.js
/*
var miModulo=require('./miModulo');

miModulo.multiplicar(10);
miModulo.sumar(20);
*/

/////////////////////MODULO WEB 'util'
/*
var util = require('util');
var http = require('http');

var prueba = "010";
console.log( util.isString(prueba));
console.log(http);
*/

//////////////////////////////////////////
//nodemon 
/*
console.log("resultado" + Math.floor(Math.random()*100));
*/


//////////////////////////////  HTTP 
//creando servirdor

var http = require('http');

var servidor = http.createServer(function(peticion, respuesta){

    respuesta.writeHead(200, {'Content-type':'text/html'});
    respuesta.write("Respuesta para la direccion" + peticion.url);
    console.log("peticion web");
})

servidor.listen(3000);

console.log("Ejecutando servidor NodeJS");

