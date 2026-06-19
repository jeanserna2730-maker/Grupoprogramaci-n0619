/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeterinariaModel;
public class veterinario_model {
    public int codigo;
    public String nombre;
    public String especialidad;

    //CONSTRUCTOR

    public veterinario_model(int codigo, String nombre, String especialidad){
        this.codigo= codigo;
        this.nombre= nombre;
        this.especialidad= especialidad;
    }
    //metodos get y set

    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEspecialidad(){
        return especialidad;
    }
    //setters
    public void setCodigo(int codigo){
        this.codigo= codigo;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad= especialidad;
    }

    @Override
    //mostrar veterinario
        public String toString(){
            return "codigo: "+codigo
            +" nombre: "+ nombre
            +" especialidad: "+ especialidad;
        }
}