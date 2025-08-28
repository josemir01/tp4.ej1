
package Colegio;

import java.util.HashSet;


public class Alumno {
private int legajo;
private String apellido;
private String nombre;
private HashSet<Materia>lista;

    public Alumno(int legajo, String apellido) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.lista=new HashSet<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   public void agregarMaterias(Materia m){
    if(!lista.contains(m)){
      lista.add(m);  
      }
    }
   public int cantidadMaterias(){
       int contador=0;
       for (Materia aux : lista) {
          if(lista.contains(aux));
          contador++;
       }
 
       
    return contador;
     
       
   } 
       
    
    
}
