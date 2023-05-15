import java.util.Scanner;

public class TiendaCascos {
    private int[][] ventas;
    private String[] modelos = {"Integral", "Modular", "Abatible", "Jet", "Cross"};
    private int[] vendedores = {1, 2, 3, 4, 5};
    private Scanner sc;

    public TiendaCascos() {
        this.ventas = new int[5][5];
        this.sc = new Scanner(System.in);
    }

    public void realizarVenta() {
        int referencia, vendedor;
        double monto;
        char continuar;

        do {
            System.out.print("Ingrese la referencia del casco vendido: ");
            referencia = sc.nextInt();
            System.out.print("Ingrese el número del vendedor: ");
            vendedor = sc.nextInt();
            System.out.print("Ingrese el monto de la venta: ");
            monto = sc.nextDouble();

            ventas[referencia - 1][vendedor - 1] += monto;

            System.out.print("¿Desea continuar (s/n)? ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
    }

    public void mostrarVentas() {
        for (int i = 0; i < modelos.length; i++) {
            for (int j = 0; j < vendedores.length; j++) {
                System.out.println("El vendedor " + vendedores[j] + " vendió " + ventas[i][j] + " del casco " + modelos[i]);
            }
        }
    }

    public static void main(String[] args) {
        TiendaCascos tienda = new TiendaCascos();
        tienda.realizarVenta();
        tienda.mostrarVentas();
    }
}