/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author migsauceda
 */
public class Polimorfismo {
    private static Persona oPersona= new Persona();
    private static Alumno oAlumno= new Alumno();
    
    public static void main(String[] args) {
      //ingresar datos 
      oPersona.setNombre("Pedro");
      oAlumno.setNombre("Pablo");
      
      //datos de cada uno
        System.out.println("Datos originales");
        System.out.println(oPersona.getNombre());
        System.out.println(oAlumno.getNombre());       
      
      //llamar a metodo con el objeto persona      
      Polimorfico(oPersona);
      
      //llamar a metodo con el objeto alumno
      Polimorfico(oAlumno);
      
      //persona como alulmno
        System.out.println("Asignando oPersona = oAlumno, persona como alumno");
      oPersona = oAlumno;
      System.out.println(oPersona.getNombre());      
    }
    public static void Polimorfico(Persona obj){
        System.out.println("Metodo polimorfico");
        System.out.println(obj.getNombre());
    }
}
