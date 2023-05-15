# Ventas de Concesionario
Este programa permite registrar las ventas de un concesionario de vehículos y mostrar el total de ventas para cada vendedor y vehículo.

## Requisitos
- Java Development Kit (JDK) 8 o superior.
- Un IDE o editor de texto para Java, como Eclipse, IntelliJ IDEA o Visual Studio Code.
- Consola o terminal para ejecutar el programa.

### Instrucciones
    1. Clonar o descargar el repositorio del programa.
    2. Abrir el proyecto en el IDE o editor de texto.
    3. Ejecutar el archivo VentasConcesionario.java.
    4. Ingresar la referencia del vehículo, número del vendedor y monto de la venta.
    5. Presionar la tecla "s" o "S" para continuar ingresando ventas, o cualquier otra tecla para terminar.
    6. El programa mostrará el total de ventas para cada vendedor y vehículo.

## Cómo funciona
El programa utiliza programación orientada a objetos para representar las ventas y el concesionario.

La clase Venta representa una venta individual con su referencia de vehículo, número de vendedor y monto.

La clase Concesionario representa el conjunto de ventas del concesionario. Se encarga de almacenar las ventas en una matriz, calcular el total de ventas para cada vendedor y vehículo, y mostrar los resultados.

En el archivo VentasConcesionario.java, se crea una instancia de la clase Concesionario, se ingresan las ventas a través de su método agregarVenta() y se muestran los resultados con su método imprimirVentas().

## Limitaciones

- El programa está diseñado para registrar ventas de hasta 5 vehículos y 5 vendedores.
- No se realizan validaciones de los datos ingresados por el usuario.
- El programa no guarda las ventas registradas en una base de datos o archivo.

## Contribuciones
Si deseas contribuir al desarrollo de este programa, puedes hacerlo a través de pull requests o abriendo issues en el repositorio. Cualquier aporte será bienvenido.

# Ejercicio Base:
En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita el presidente de una compañía de venta de automóviles, que desea calcular el promedio de ventas de los asesores. Este desea saber el promedio de unidades vendidas de determinada referencia y de determinado asesor. Como información básica de cada venta se debe registrar el número de identificación, su nombre, referencia del vehículo y asesor.
Aclaraciones:
•	Se supondrá que la aplicación solo se requiere para calcular el promedio de ventas totales.
•	Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.
•	No se realiza validación, ni se verifica calidad en los datos ingresados.
 
# Análisis del Ejercicio:
Aproximación Plantilla Historia de Usuario:
[VEH-1] HISTORIA USUARIO Creada: 11/may/23  Actualizada: 11/may/23 

Estado:	Tareas por hacer
Proyecto:	Vehiculos

Componentes:	Ninguno 
Versiones afectadas:	Ninguno 
Versiones corregidas:	Ninguno 

Tipo: 	Historia 	Prioridad: 	Medium 
Informador: 	Jhon Garcia 
Responsable: 	Jhon GARCIA
Resolución: 	Sin resolver 	Votos: 	0 
Etiquetas: 	Programa de concesionario
Estimación Restante:	Desconocido 
Tiempo Trabajado:	Desconocido 
Estimación original:	Desconocido 

Rank:	0|i0001j: 
Sprint:	Tablero Sprint 1

Descripción  	 
HISTORIA DE USER

Generado a las Sun May 14 23:13:48 UTC 2023 por Jhon Garcia (Jhoncetto) usando JIRA 1001.0.0-SNAPSHOT#100225-sha1:e4eb8694a796a8572871db670789a29d54b1c385. 



  
## Aproximación Caso de Uso:




 

 
Nombre: Calcular ventas por asesor
Actores: Presidente concesionario y asesores
Propósito: Calcular su promedio de ventas por asesor y por referencia de vehículos.
Curso Normal de Eventos:
1.	El presidente ingresa la referencia del vehículo en este caso del 1 al 4.
2.	El presidente ingresa el código del vendedor y/o asesor en este caso del 1 al 5.
3.	El presidente ingresa valor de la venta.
4.	Se calcula el promedio de ventas por unidad, por asesor y muestra el total en valor.
Postcondiciones: Promedio de Ventas  de concesionario 



 
## Aproximación Diagrama de Flujo:
 


Entender el anterior diagrama no debe presentar mayores problemas. Sin embargo, es conveniente realizar las siguientes aclaraciones y comentarios:
•	Este código es muy básico y no tan preciso como el de java y el código orientado a objetos
•	En el algoritmo se captura información como la referencia del vehiculo, código de vendedor y el valor del vehículo,  

## Aproximación Seudocódigo:

Algoritmo VentasConcesionario
	Definir vehiculo Como Caracter
	Definir vendedor Como Entero
	Definir ventas Como Real
	Escribir 'Ingrese el modelo de vehículo:'
	Leer vehiculo
	Escribir 'Ingrese el número del vendedor:'
	Leer vendedor
	Escribir 'Ingrese las ventas para el modelo ',vehiculo,' del vendedor ',vendedor,':'
	Leer ventas
	Escribir 'Ventas del modelo ',vehiculo,' para el vendedor ',vendedor,':'
	Escribir 'El vendedor ',vendedor,' vendió ',ventas,' del modelo ',vehiculo
FinAlgoritmo
 
