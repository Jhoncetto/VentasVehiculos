import java.util.Scanner;

public class VentasTiendaCascosMoto {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ventas = new int[5][5];
        int referencia, vendedor;
        double monto;
        char continuar;
        
        String[] modelosCascos = {"Integral", "Abatible", "Jet", "Modular", "Cross"};
        int[] vendedores = {1, 2, 3, 4, 5};
        
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
        
        // Impresión de resultados
        for (int i = 0; i < modelosCascos.length; i++) {
            for (int j = 0; j < vendedores.length; j++) {
                System.out.println("El vendedor " + vendedores[j] + " vendió " + ventas[i][j] + " del casco " + modelosCascos[i]);
            }
        }
    }
}