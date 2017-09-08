/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Persona {
    private String nombre;
    private String ID;
    private Lugares lugar;
    private Integer Edad;
    private String Estatura;
    private String profesion;

    public Persona(String nombre, String ID, Lugares lugar, Integer Edad, String Estatura, String profesion) {
        this.nombre = nombre;
        this.ID = ID;
        this.lugar = lugar;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Lugares getLugar() {
        return lugar;
    }

    public void setLugar(Lugares lugar) {
        this.lugar = lugar;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getEstatura() {
        return Estatura;
    }

    public void setEstatura(String Estatura) {
        this.Estatura = Estatura;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
}
