import java.util.Scanner;

public class VentasConcesionarioobj {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Inicialización de objetos
        Vehiculo[] vehiculos = {
            new Vehiculo("Sedán"),
            new Vehiculo("Hatchback"),
            new Vehiculo("Camioneta"),
            new Vehiculo("SUV"),
            new Vehiculo("Pickup")
        };
        Vendedor[] vendedores = {
            new Vendedor(1),
            new Vendedor(2),
            new Vendedor(3),
            new Vendedor(4),
            new Vendedor(5)
        };
        Concesionario concesionario = new Concesionario(vehiculos, vendedores);
        
        // Captura de ventas
        char continuar;
        do {
            System.out.print("Ingrese la referencia del vehículo vendido: ");
            int referencia = sc.nextInt();
            System.out.print("Ingrese el número del vendedor: ");
            int numVendedor = sc.nextInt();
            System.out.print("Ingrese el monto de la venta: ");
            double monto = sc.nextDouble();
            concesionario.registrarVenta(referencia, numVendedor, monto);
            System.out.print("¿Desea continuar (s/n)? ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        
        // Impresión de resultados
        concesionario.imprimirVentas();
    }
}

class Vehiculo {
    private String referencia;
    
    public Vehiculo(String referencia) {
        this.referencia = referencia;
    }
    
    public String getReferencia() {
        return referencia;
    }
}

class Vendedor {
    private int numVendedor;
    
    public Vendedor(int numVendedor) {
        this.numVendedor = numVendedor;
    }
    
    public int getNumVendedor() {
        return numVendedor;
    }
}

class Concesionario {
    private Vehiculo[] vehiculos;
    private Vendedor[] vendedores;
    private double[][] ventas;
    
    public Concesionario(Vehiculo[] vehiculos, Vendedor[] vendedores) {
        this.vehiculos = vehiculos;
        this.vendedores = vendedores;
        this.ventas = new double[vehiculos.length][vendedores.length];
    }
    
    public void registrarVenta(int referencia, int numVendedor, double monto) {
        int indexVehiculo = referencia - 1;
        int indexVendedor = numVendedor - 1;

    }
    
    public void imprimirVentas() {
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vendedores.length; j++) {
                System.out.println("El vendedor " + vendedores[j].getNumVendedor() + " vendió " + ventas[i][j] + " del vehículo " + vehiculos[i].getReferencia());
            }
        }
    }
}
