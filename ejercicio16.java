/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author LabSispc05
 */
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese la zona de entrega (1-5): ");
        int zona = scanner.nextInt();

        if (peso > 5) {
            System.out.println("ERROR: el paquete no es transportado por cuestiones de logística y seguridad.");
        } else {
            double costoPorKilogramo = 0;
            switch (zona) {
                case 1:
                    costoPorKilogramo = 24;
                    break;
                case 2:
                    costoPorKilogramo = 20;
                    break;
                case 3:
                    costoPorKilogramo = 21;
                    break;
                case 4:
                    costoPorKilogramo = 10;
                    break;
                case 5:
                    costoPorKilogramo = 18;
                    break;
                default:
                    System.out.println("ERROR: zona de entrega no válida.");
                    return;
            }
            double costoTotal = peso * costoPorKilogramo;
            System.out.println("El costo total del envío es: " + costoTotal + " euros.");
        }
    }
}

