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
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día de la semana (del 1 al 7): ");
        int dia = scanner.nextInt();
        String diaSemana = "";

        if (dia < 1 || dia > 7) {
            System.out.println("ERROR: número incorrecto");
        } else {
            switch (dia) {
                case 1:
                    diaSemana = "Lunes";
                    break;
                case 2:
                    diaSemana = "Martes";
                    break;
                case 3:
                    diaSemana = "Miércoles";
                    break;
                case 4:
                    diaSemana = "Jueves";
                    break;
                case 5:
                    diaSemana = "Viernes";
                    break;
                case 6:
                    diaSemana = "Sábado";
                    break;
                case 7:
                    diaSemana = "Domingo";
                    break;
            }
            System.out.println("El día correspondiente es: " + diaSemana);
        }
    }
}

