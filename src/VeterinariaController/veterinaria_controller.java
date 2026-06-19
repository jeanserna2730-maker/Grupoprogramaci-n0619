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
    
    //Agregar
    public veterinaria_model buscarPorId(int id){
        for(veterinaria_model m : listaVeterinaria){
            if(m.getId()==  id){
                return m;
            }
        }
    }
    
}
