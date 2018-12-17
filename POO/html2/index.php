<!DOCTYPE html>
<html>
    <head>
        <title>LLamadas a PHP</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        
        <!--carga la libreria jquery que está en la carpeta local-->
        <script src="./jquery-3.3.1.js"></script>
    </head>
    <body>
        <div>Recibe datos e incova archivo PHP</div>
        <form id="frmPrincipal" name="frmPrincipal" action="./RecibirDatos.php" method='post'>
            Nombre:<input type="text" name="txtNombre" id="txtNombre">
            <br>
            Carrera:<input type="text" name="txtCarrera" id="txtCarrera">
            <br>
<!--        envia los datos del formulario para que los procese RecibirDatos.php
            que esta en el action del form-->
            <input type="submit" value="Guardar">
        </form>
        
<!--    ejecuta la funcion CargarDatos() que invoca el archivo json.php
        que contiene informacion en formato json-->
        <input type="button" value="Cargar Datos" onclick="CargarDatos()">
        
<!--    invoca varios registros json-->
        <input type="button" value="Cargar Datos" onclick="CargarDato2()">       
        
        <script type='text/javascript'>
            function CargarDatos(){
//                invoca el archivo json.php
                $.ajax({
                    type:       "POST",
                    datatype:   "json",
                    url:    "./json.php",
                    error: function (){
                        alert("Error al cargar datos para los delitos");
                    },
//                  si todo sale bien se recibe json_obj que contiene 
//                  la informacion en formato json                    
                    success: function(json_obj){
//                        JSON.parse(variable) escrito asi en mayuscula convierte
//                        el archivo json_obj en objeto json
			var obj = JSON.parse(json_obj);
                        
//                        hace referencia a los input por su id y les asigna
//                        el valor del json
                        document.getElementById("txtNombre").value= obj.Nombre;
			document.getElementById("txtCarrera").value= obj.Carrera;
                    } 
                });
            }
            
            function CargarDatos2(){
//                invoca el archivo json.php
                $.ajax({
                    type:       "POST",
                    datatype:   "json",
                    url:    "./json2.php",
                    error: function (){
                        alert("Error al cargar datos para los delitos");
                    },
//                  si todo sale bien se recibe json_obj que contiene 
//                  la informacion en formato json                    
                    success: function(json_obj){
//                        JSON.parse(variable) escrito asi en mayuscula convierte
//                        el archivo json_obj en objeto json
			var obj = JSON.parse(json_obj);
                        
                        for (){
                            document.getElementById("txtNombre").value= obj.Nombre;
                            document.getElementById("txtCarrera").value= obj.Carrera;                            
                        }

                    } 
                });
            }             
        </script>
    </body>
</html>


