/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;
import java.util.ArrayList;

public class GestionBuses {
    private ArrayList<Buses> buses;

    
    public GestionBuses() {
        buses = new ArrayList<>();
    }

    
    public void registrarBus(String placa, int totalPasajeros, String empresa) {
        Buses nuevoBus = new Buses(placa, totalPasajeros, empresa);
        buses.add(nuevoBus);
    }

 
    public void listarBusesSotracauca() {
        System.out.println("\n Estos son los buses que estan registrados:");
        for (Buses bus : buses) {
            if (bus.getEmpresa().equalsIgnoreCase("Sotracauca")) {
                bus.mostrarBus();
            }
        }
    }

  
    public void buscarBusMenorCapacidad() {
        if (buses.isEmpty()) {
            System.out.println("Aun no se han registrado buses.");
            return;
        }

        Buses busMenorCapacidad = buses.get(0);

        for (Buses bus : buses) {
            if (bus.getTotalPasajeros() < busMenorCapacidad.getTotalPasajeros()) {
                busMenorCapacidad = bus;
            }
        }

        System.out.println("\n El bus de menor capacidad es:");
        busMenorCapacidad.mostrarBus();
    }
}
