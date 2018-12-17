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
public class Constructores {
    private static Persona objeto;
    
    public static void main(String[] args) {
        //usando constructor por defecto
        objeto= new Persona();
        
        //imprimir los valores por defecto
        System.out.println(objeto.getNombre()+ ", "+objeto.getAepllido());
        
        objeto.setNombre("Vilma");
        objeto.setAepllido("Picapiedra");
        System.out.println(objeto.getNombre()+ ", "+objeto.getAepllido());
        
        //destruir objeto
        objeto= null;
        //System.out.println(objeto.getNombre()+ ", "+objeto.getAepllido());
        
        //pasando un parametro
        objeto= new Persona("Pedro antes del null");
        System.out.println(objeto.getNombre()+ ", "+objeto.getAepllido());
        
        //destruir objeto
        objeto= null;
        System.out.println(objeto.getNombre()+ ", "+objeto.getAepllido());
        
        //pasando dos parametro
        objeto= new Persona("Pablo", "Marmol");
        System.out.println(objeto.getNombre()+ ", "+objeto.getAepllido());
    }
    
}
