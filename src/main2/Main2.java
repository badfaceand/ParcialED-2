/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionBuses gestionBuses = new GestionBuses();

        while (true) {
           
            System.out.println("\n Menu de opciones:");
            System.out.println("1. registrar bus ");
            System.out.println("2. Listar los buses de SotraCauca");
            System.out.println("3. Buscar el bus con menor capacidad");
            System.out.println("4. Salir");
            System.out.print("Que opcion quieres?: ");
            String opcion = scanner.nextLine();

            switch (opcion.toLowerCase()) {
                case "1":
                  
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("total de pasajeros: ");
                    int totalPasajeros = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese la empresa del bus: ");
                    String empresa = scanner.nextLine();

                    gestionBuses.registrarBus(placa, totalPasajeros, empresa);
                    break;

                case "2":
                   
                    gestionBuses.listarBusesSotracauca();
                    break;

                case "3":
                    
                    gestionBuses.buscarBusMenorCapacidad();
                    break;
                case "wwssadadba":
                    System.out.println("Encontraste el easter egg!");
                case "4":
                  
                    System.out.println("Cerrando");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcion invalidas.");
            }
        }
    }
}
