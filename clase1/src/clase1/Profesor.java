/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author Roberto
 */
public class Profesor extends Persona{
    private String profesion;

    public Profesor() {
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    public void saludar(){
        System.out.println("Hola estudiantes");
    }
}
