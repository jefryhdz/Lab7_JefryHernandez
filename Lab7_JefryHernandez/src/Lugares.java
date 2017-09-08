
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Lugares extends Thread{
    private String nombre;
    private String clima;
    private String extension;    
    private String cantidad_habitantes;    
    private ArrayList<Persona> habitantes = new ArrayList();
    private Lugar table;
    private String zona;
    private String fundacion;

    public Lugares(String nombre, String clima, String extension, String cantidad_habitantes, Lugar table, String zona, String fundacion) {
        this.nombre = nombre;
        this.clima = clima;
        this.extension = extension;
        this.cantidad_habitantes = cantidad_habitantes;
        this.table = table;
        this.zona = zona;
        this.fundacion = fundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getCantidad_habitantes() {
        return cantidad_habitantes;
    }

    public void setCantidad_habitantes(String cantidad_habitantes) {
        this.cantidad_habitantes = cantidad_habitantes;
    }

    public ArrayList<Persona> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Persona> habitantes) {
        this.habitantes = habitantes;
    }

    public Lugar getTable() {
        return table;
    }

    public void setTable(Lugar table) {
        this.table = table;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    @Override
    public void run() {
        
        super.run(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
