/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeterinariaModel;

/**
 *
 * @author HP
 */
public class veterinaria_model {
    public int id;
    public String nombre;
    public String especie;
    public int edad;
    public String propietario;
    public veterinaria_model(int id, String nombre, String especie, int edad, String propietario){
        this.id=id;
        this.nombre=nombre;
        this.especie=especie;
        this.edad=edad;
        this.propietario=propietario;
    }
}
