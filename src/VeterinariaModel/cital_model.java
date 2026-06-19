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