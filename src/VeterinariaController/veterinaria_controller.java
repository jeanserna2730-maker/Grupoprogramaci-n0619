/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeterinariaController;
import java.util.ArrayList;
import VeterinariaModel.veterinaria_model;

/**
 *
 * @author Usuario
 */
public class veterinaria_controller {
    public ArrayList<veterinaria_model> listaVeterinaria = new ArrayList<>();
    
    //Ageragar
    public void agregar(veterinaria_model mascota){
        listaVeterinaria.add(mascota);
        
    }
    //Buscar
    public veterinaria_model buscarPorId(int id){
        for(veterinaria_model m : listaVeterinaria){
            if(m.getId()==  id){
                return m;
            }
        }
        return null;
    }
    //Listar 
    public void listarTodos(){
        if(listaVeterinaria.isEmpty()){
            System.out.println("no hay mascotas registradas");
            return;
        }
        for(veterinaria_model m : listaVeterinaria){
            System.out.println(m);
        }
    }
    //Actualizar
    
}
