/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria_view;

import java.util.Scanner;
import VeterinariaController.veterinaria_controller;
import VeterinariaModel.mascota_model;
import VeterinariaModel.veterinario_model;
import VeterinariaModel.cita_model;

public class veterinaria_view {
    Scanner sc = new Scanner(System.in);
    veterinaria_controller controlador = new veterinaria_controller();

    public void menu() {
        int opcion = -1;

        while (opcion != 4) {
            System.out.println("""
                               -------------------------------------------------
                                            MENU PRINCIPAL VETERINARIA
                               1. GESTIONAR MASCOTAS
                               2. GESTIONAR VETERINARIOS
                               3. GESTIONAR CITAS
                               4. SALIR
                               SELECCIONE LA OPCION A REALIZAR:
                               """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    menuMascotas();
                    break;
                case 2:
                    menuVeterinarios();
                    break;
                case 3:
                    menuCitas();
                    break;
                case 4:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente de nuevo.");
            }
        }
    }
