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