/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeterinariaModel;
public class mascota_model {
    public int codigo;
    public String nombre;
    public String especie;
    public String raza;
    public int edad;
    public String dueño;

    //CONSTRUCTOR

    public mascota_model(int codigo, String nombre, String especie, String raza, int edad, String dueño){
        this.codigo= codigo;
        this.nombre= nombre;
        this.especie= especie;
        this.raza= raza;
        this.edad= edad;
        this.dueño= dueño;
    }
    //metodos get y set

    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEspecie(){
        return especie;
    }

    public String getRaza(){
        return raza;
    }

    public int getEdad(){
        return edad;
    }

    public String getDueño(){
        return dueño;
    }
    //setters
    public void setCodigo(int codigo){
        this.codigo= codigo;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public void setEspecie(String especie){
        this.especie= especie;
    }

    public void setRaza(String raza){
        this.raza= raza;
    }

    public void setEdad(int edad){
        this.edad= edad;
    }

    public void setDueño(String dueño){
        this.dueño= dueño;
    }

    @Override
    //mostrar mascota
        public String toString(){
            return "codigo: "+codigo
            +" nombre: "+ nombre
            +" especie: "+ especie
            +" raza: "+ raza
            +" edad: "+ edad
            +" dueño: "+ dueño;
        }
}
