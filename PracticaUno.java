/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicauno;
import java.util.Scanner;

public class PracticaUno {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por fis, ingresa un numero entero: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par.");
            } else {
                System.out.println("El numero " + numero + " es impar.");    
         scanner.close();
                        }
             }
    }
}
        
        
    


    
