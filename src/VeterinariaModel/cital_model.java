/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VeterinariaModel;

/**
 *
 * @author el_ingeniero
 */
package VeterinariaModel;
public class cita_model {
    public int codigo;
    public int codigoMascota;
    public int codigoVeterinario;
    public String fecha;
    public String motivo;
public class cital_model {

    //CONSTRUCTOR
 
    public cita_model(int codigo, int codigoMascota, int codigoVeterinario, String fecha, String motivo){
        this.codigo= codigo;
        this.codigoMascota= codigoMascota;
        this.codigoVeterinario= codigoVeterinario;
        this.fecha= fecha;
        this.motivo= motivo;
    }
    
   //metodos get y set
 
    public int getCodigo(){
        return codigo;
    }
 
    public int getCodigoMascota(){
        return codigoMascota;
    }
 
   public int getCodigoVeterinario(){
        return codigoVeterinario;
    }
 
    public String getFecha(){
        return fecha;
    }
    
   public String getMotivo(){
        return motivo;
    }
   
   //setters
    public void setCodigo(int codigo){
        this.codigo= codigo;
    }
    
  public void setCodigoMascota(int codigoMascota){
        this.codigoMascota= codigoMascota;
    }
  
   public void setCodigoVeterinario(int codigoVeterinario){
        this.codigoVeterinario= codigoVeterinario;
    }
   
   public void setFecha(String fecha){
        this.fecha= fecha;
    }
   
   public void setMotivo(String motivo){
        this.motivo= motivo;
    }
 
    @Override
    //mostrar cita
        public String toString(){
            return "codigo cita: "+codigo
            +" codigo mascota: "+ codigoMascota
            +" codigo veterinario: "+ codigoVeterinario
            +" fecha: "+ fecha
            +" motivo: "+ motivo;
        }
}
 