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

    // ---------------- SUBMENU MASCOTAS ----------------
    public void menuMascotas() {
        int opcion = -1;
        while (opcion != 5) {
            System.out.println("""
                               -------------------------------------------------
                                                MASCOTAS
                               1. AGREGAR
                               2. MOSTRAR
                               3. ACTUALIZAR
                               4. ELIMINAR
                               5. VOLVER
                               SELECCIONE LA OPCION A REALIZAR:
                               """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre de la mascota: ");
                    String nombre = sc.nextLine();
                    System.out.print("Especie: ");
                    String especie = sc.nextLine();
                    System.out.print("Raza: ");
                    String raza = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre del dueño: ");
                    String dueño = sc.nextLine();

                    mascota_model mascota = new mascota_model(codigo, nombre, especie, raza, edad, dueño);
                    controlador.agregarMascota(mascota);
                    break;

                case 2:
                    controlador.listarMascotas();
                    break;

                case 3:
                    System.out.print("Codigo de la mascota a actualizar: ");
                    int codigoAct = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nombreAct = sc.nextLine();
                    System.out.print("Nueva especie: ");
                    String especieAct = sc.nextLine();
                    System.out.print("Nueva raza: ");
                    String razaAct = sc.nextLine();
                    System.out.print("Nueva edad: ");
                    int edadAct = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo dueño: ");
                    String dueñoAct = sc.nextLine();

                    if (controlador.actualizarMascota(codigoAct, nombreAct, especieAct, razaAct, edadAct, dueñoAct)) {
                        System.out.println("Mascota actualizada exitosamente!");
                    } else {
                        System.out.println("Mascota no encontrada!");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el codigo de la mascota a eliminar: ");
                    int codigoDel = sc.nextInt();
                    sc.nextLine();

                    if (controlador.eliminarMascota(codigoDel)) {
                        System.out.println("Mascota eliminada con exito!");
                    } else {
                        System.out.println("Mascota no encontrada!");
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcion incorrecta, intente de nuevo.");
            }
        }
    }

    // ---------------- SUBMENU VETERINARIOS ----------------
    public void menuVeterinarios() {
        int opcion = -1;
        while (opcion != 5) {
            System.out.println("""
                               -------------------------------------------------
                                                VETERINARIOS
                               1. AGREGAR
                               2. MOSTRAR
                               3. ACTUALIZAR
                               4. ELIMINAR
                               5. VOLVER
                               SELECCIONE LA OPCION A REALIZAR:
                               """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre del veterinario: ");
                    String nombre = sc.nextLine();
                    System.out.print("Especialidad: ");
                    String especialidad = sc.nextLine();

                    veterinario_model veterinario = new veterinario_model(codigo, nombre, especialidad);
                    controlador.agregarVeterinario(veterinario);
                    break;

                case 2:
                    controlador.listarVeterinarios();
                    break;

                case 3:
                    System.out.print("Codigo del veterinario a actualizar: ");
                    int codigoAct = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nombreAct = sc.nextLine();
                    System.out.print("Nueva especialidad: ");
                    String especialidadAct = sc.nextLine();

                    if (controlador.actualizarVeterinario(codigoAct, nombreAct, especialidadAct)) {
                        System.out.println("Veterinario actualizado exitosamente!");
                    } else {
                        System.out.println("Veterinario no encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el codigo del veterinario a eliminar: ");
                    int codigoDel = sc.nextInt();
                    sc.nextLine();

                    if (controlador.eliminarVeterinario(codigoDel)) {
                        System.out.println("Veterinario eliminado con exito!");
                    } else {
                        System.out.println("Veterinario no encontrado!");
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcion incorrecta, intente de nuevo.");
            }
        }
    }

    // ---------------- SUBMENU CITAS ----------------
    public void menuCitas() {
        int opcion = -1;
        while (opcion != 5) {
            System.out.println("""
                               -------------------------------------------------
                                                CITAS
                               1. AGENDAR
                               2. MOSTRAR
                               3. ACTUALIZAR
                               4. ELIMINAR
                               5. VOLVER
                               SELECCIONE LA OPCION A REALIZAR:
                               """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el codigo de la cita: ");
                    int codigo = sc.nextInt();
                    System.out.print("Codigo de la mascota: ");
                    int codigoMascota = sc.nextInt();
                    System.out.print("Codigo del veterinario: ");
                    int codigoVeterinario = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Fecha (dd/mm/aaaa): ");
                    String fecha = sc.nextLine();
                    System.out.print("Motivo: ");
                    String motivo = sc.nextLine();

                    cita_model cita = new cita_model(codigo, codigoMascota, codigoVeterinario, fecha, motivo);
                    controlador.agregarCita(cita);
                    break;

                case 2:
                    controlador.listarCitas();
                    break;

                case 3:
                    System.out.print("Codigo de la cita a actualizar: ");
                    int codigoAct = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nueva fecha: ");
                    String fechaAct = sc.nextLine();
                    System.out.print("Nuevo motivo: ");
                    String motivoAct = sc.nextLine();

                    if (controlador.actualizarCita(codigoAct, fechaAct, motivoAct)) {
                        System.out.println("Cita actualizada exitosamente!");
                    } else {
                        System.out.println("Cita no encontrada!");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el codigo de la cita a eliminar: ");
                    int codigoDel = sc.nextInt();
                    sc.nextLine();

                    if (controlador.eliminarCita(codigoDel)) {
                        System.out.println("Cita eliminada con exito!");
                    } else {
                        System.out.println("Cita no encontrada!");
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcion incorrecta, intente de nuevo.");
            }
        }
    }
}