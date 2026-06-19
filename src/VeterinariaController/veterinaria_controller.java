/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeterinariaController;
import java.util.HashMap;
import java.util.ArrayList;
import VeterinariaModel.mascota_model;
import VeterinariaModel.veterinaria_model;
import VeterinariaModel.cital_model;

public class veterinaria_controller {

    //HASHMAP para mascotas (clave = codigo)
    public HashMap<Integer, mascota_model> mapaMascotas = new HashMap<>();

    //ARRAYLIST para veterinarios
    public ArrayList<veterinaria_model> listaVeterinarios = new ArrayList<>();

    //ARRAYLIST para citas
    public ArrayList<cital_model> listaCitas = new ArrayList<>();

    // ---------------- MASCOTAS (HashMap) ----------------

    //agregar o crear
    public void agregarMascota(mascota_model mascota){
        mapaMascotas.put(mascota.getCodigo(), mascota);
        System.out.println("Mascota agregada");
    }

    //listar o mostrar
    public void listarMascotas(){
        for(mascota_model mascota: mapaMascotas.values()){
            System.out.println(mascota);
        }
    }

    //buscar mascota
    public mascota_model buscarMascota(int codigo){
        return mapaMascotas.get(codigo);
    }

    //eliminar y borrar
    public boolean eliminarMascota(int codigo){
        if (mapaMascotas.containsKey(codigo)){
            mapaMascotas.remove(codigo);
            return true;
        }
        return false;
    }

    //actualizar
    public boolean actualizarMascota(int codigo, String nombre, String especie, String raza, int edad, String dueño){
        mascota_model mascota = buscarMascota(codigo);
        if(mascota != null){
            mascota.setNombre(nombre);
            mascota.setEspecie(especie);
            mascota.setRaza(raza);
            mascota.setEdad(edad);
            mascota.setDueño(dueño);
            return true;
        }
        return false;
    }

    // ---------------- VETERINARIOS (ArrayList) ----------------

    //agregar o crear
    public void agregarVeterinario(veterinaria_model veterinario){
        listaVeterinarios.add(veterinario);
        System.out.println("Veterinario agregado");
    }

    //listar o mostrar
    public void listarVeterinarios(){
        for(veterinaria_model veterinario: listaVeterinarios){
            System.out.println(veterinario);
        }
    }

    //buscar veterinario
    public veterinaria_model buscarVeterinario(int codigo){
        for(veterinaria_model veterinario : listaVeterinarios){
            if (veterinario.getCodigo()==codigo){
                return veterinario;
            }
        }
        return null;
    }

    //eliminar y borrar
    public boolean eliminarVeterinario(int codigo){
        veterinaria_model veterinario= buscarVeterinario(codigo);
        if (veterinario != null){
            listaVeterinarios.remove(veterinario);
            return true;
        }
        return false;
    }

    //actualizar
    public boolean actualizarVeterinario(int codigo, String nombre, String especialidad){
        veterinaria_model veterinario = buscarVeterinario(codigo);
        if(veterinario != null){
            veterinario.setNombre(nombre);
            veterinario.setEspecialidad(especialidad);
            return true;
        }
        return false;
    }

    // ---------------- CITAS (ArrayList) ----------------

    //agregar o crear
    public void agregarCita(cital_model cita){
        //validamos que exista la mascota y el veterinario antes de agendar
        if (mapaMascotas.containsKey(cita.getCodigoMascota()) && buscarVeterinario(cita.getCodigoVeterinario())!=null){
            listaCitas.add(cita);
            System.out.println("Cita agendada");
        } else {
            System.out.println("No existe la mascota o el veterinario indicado");
        }
    }

    //listar o mostrar
    public void listarCitas(){
        for(cital_model cita: listaCitas){
            System.out.println(cita);
        }
    }

    //buscar cita
    public cital_model buscarCita(int codigo){
        for(cital_model cita : listaCitas){
            if (cita.getCodigo()==codigo){
                return cita;
            }
        }
        return null;
    }

    //eliminar y borrar
    public boolean eliminarCita(int codigo){
        cital_model cita= buscarCita(codigo);
        if (cita != null){
            listaCitas.remove(cita);
            return true;
        }
        return false;
    }

    //actualizar
    public boolean actualizarCita(int codigo, String fecha, String motivo){
        cital_model cita = buscarCita(codigo);
        if(cita != null){
            cita.setFecha(fecha);
            cita.setMotivo(motivo);
            return true;
        }
        return false;
    }
}