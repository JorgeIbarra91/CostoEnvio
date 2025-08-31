/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 * @author jorge ibarra tenia el nombre del notebook de mi hermano que es donde trabaje.
 */
public class CostoEnvio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: valor de compra y distancia
        System.out.print("Ingrese el total de la compra en pesos: ");
        int totalCompra = scanner.nextInt();

        System.out.print("Ingrese la distancia a recorrer en kilómetros: ");
        int kilometros = scanner.nextInt();

        int costoDespacho = 0;

        // Reglas de negocio
        if (totalCompra >= 50000) {
            costoDespacho = 0; // Envío gratis
        } else if (totalCompra >= 25000 && totalCompra <= 49999) {
            costoDespacho = kilometros * 150; 
        } else {
            costoDespacho = kilometros * 300;
        }

        // Mostrar resultados
        System.out.println("\nResumen de compra:");
        System.out.println("Monto de la compra: $" + totalCompra);
        System.out.println("Distancia de despacho: " + kilometros + " km");
        System.out.println("Costo de despacho: $" + costoDespacho);
        System.out.println("Total a pagar (compra + despacho): $" + (totalCompra + costoDespacho));

        scanner.close();
    }
}