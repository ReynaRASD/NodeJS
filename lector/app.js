///// MODULO fs

//var fs = require('fs');


/*
//var contenido = fs.readFileSync('./archivos/texto.txt', 'utf-8');
// esto es muy tardado si es archivo fuera pesado



//otro metodo para informacion muy pesada:
var contenido = fs.readFile('./archivos/texto.txt', 'utf-8', function(error, datos){
    console.log(datos); //texto de archivo
});

console.log("codigo " + contenido);
*/






/*-          OTRO lector          -*/
// aqui evitas que se caiga todo por un simple error con throw y un condicional
/*
fs.readFile('./archivos/texto.txt', 'utf-8', function(error, datos){

    if(error){
        console.log("error de lectura");
        throw error;
    }else{
        console.log(datos); //texto de archivo
    }


    
});
*/








//////LECTOR DE CARPETAS
/*
fs.readdir('./archivos', {withFileTypes:true} , (error, items)=>{
    console.log(items);
});
//con withFiles diferencias de archivos a carpetas
*/










//////// ESCRITURA DE ARCHIVOS
/*

fs.writeFile('./archivos/holaREYNA.txt', 'datos enviados desde Node, atte Reyna', (error)=>{
    if(error){
        console.log("error al escribir");
    }else{
        console.log("archivo modificado exitosamente");
    }
})
//si el archivo no existe, lo crea




//para modificar los datos de un archivo ya hecho:
fs.appendFile('./archivos/holaREYNA.txt', '       nuevos datos', (error)=>{
    if(error){
        console.log("error al escribir");
    }else{
        console.log("archivo modificado exitosamente");
    }
})
*/









////// COPIAR ARCHIVOS
/*
fs.copyFile('./archivos/hola.txt', './archivos/adios.txt', (error)=>{
    if(error){
        console.log("error al copiar");
        throw error;
    }else{
        console.log("copia exitosa");
    }
});
*/








/////////// Eliminar archivos del sistema
/*
fs.unlink('./archivos/holaREYNA.txt', (error)=>{
    if(error){
        console.log("no se pudo eliminar el archivo");
    }else{
        console.log("ok!");
    }
});
*/







///// copiar ARCHIVOS con cadenas de procesos
/*
fs.copyFile('./archivos/texto.txt', './otros/copia2.txt', (error)=>{
    if(error){
        console.log("No se pudo copiar.");
    }else{
        fs.writeFile('./archivos/confirmacion2.txt', 'archivo copiado OK', (error)=>{
            console.log("proceso finalizado");
        })
    }
});
// encadenacion de procesos
*/













/////////////// COPIAR Y ELIMINAR ARCHIVOS
/*
function copiarArchivo(rutaoriginal, nuevaruta, archivoAcopiar){

    //(ruta original, nueva ruta, archivo para copiar)
    fs.copyFile(rutaoriginal + '/' + archivoAcopiar, nuevaruta + '/' + archivoAcopiar, (error)=>{
        if(error){
            console.log("no se pudo copiar");
        }else{
            eliminarArchivo();
        }
    })
}

function eliminarArchivo(rutaoriginal, archivoAcopiar){
    fs.unlink(rutaoriginal + '/' + archivoAcopiar, (error)=>{
        if(error){
            console.log("no se pudo eliminar");
        }else{
            console.log("se elimino correctamente");
        }
    })

}

copiarArchivo('./archivos', './otros', 'hola.txt');
*/










////////////////    LEER JSON
//// manera estatica
/*
var libro = require('./archivos/libros.json');
//el archivo se vuelven objetos estativos, no se debe hacer con dinamicos
console.log(libro);
*/


/// manera dinamica
var fs = require('fs');
fs.readFile('./archivos/libros.json', (error, datos)=>{
    
    if(error){
        console.log("error");
    }else{
        console.log(JSON.parse(datos).autor);
        // si no ocupas JSON es un buffer (datos binarios)
    }
});




