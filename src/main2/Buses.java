/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;
public class Buses {
    private String placa;
    private int totalPasajeros;
    private String empresa;

    
    public Buses(String placa, int totalPasajeros, String empresa) {
        this.placa = placa;
        this.totalPasajeros = totalPasajeros;
        this.empresa = empresa;
    }

   
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    public void setTotalPasajeros(int totalPasajeros) {
        this.totalPasajeros = totalPasajeros;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
public void mostrarBus() {
        System.out.println("La placa es: " + placa + " su total de pasajeros es: " + totalPasajeros + " pertenece a la empresa: " + empresa);
    }
}
