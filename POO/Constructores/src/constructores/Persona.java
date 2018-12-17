/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author migsauceda
 */
public class Persona {
    private String Nombre;
    private String Aepllido;

    public Persona(){
        this.Nombre= "--Sin nombre--";
        this.Aepllido= "--Sin apellido--";
    }
    
    public Persona(String Nombre){
        this.Nombre= Nombre;
    }
    
    public Persona(String Nombre, String Apellido){
        this.Nombre= Nombre;
        this.Aepllido= Apellido;
    }
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Aepllido
     */
    public String getAepllido() {
        return Aepllido;
    }

    /**
     * @param Aepllido the Aepllido to set
     */
    public void setAepllido(String Aepllido) {
        this.Aepllido = Aepllido;
    }
    
}
