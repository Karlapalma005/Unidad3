/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica3fibonacci;
    import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Práctica3Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de numeros de la serie Fibonacci que desea ver: ");
            int n = scanner.nextInt();
            int a = 0, b = 1;
            System.out.print("Serie de Fibonacci de " + n + " numeros: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int sum = a + b;
                a = b;
                b = sum;
            }   System.out.println("\nRecomendacion de cancion: 'Someone I Used to Know' de Morat");
            System.out.println("\nRecomendacion de cancin: ' Blank Space' de Taylor Swift");
        }
    }
}

    
    

