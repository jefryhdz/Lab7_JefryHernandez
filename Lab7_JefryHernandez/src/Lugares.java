
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jefry Hernandez
 */
public class Lugares extends Thread {

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

    public Lugares() {
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
        while (true) {
            table.jl_nombre.setText(this.nombre);
            table.setVisible(true);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {

            }

        }
    }

    public void agregarpersonas(ArrayList<Persona> p) {

        int rows = table.jt_lugar1.getRowCount();
        for (int i = 0; i < rows; i++) {
            ((DefaultTableModel) table.jt_lugar1.getModel()).removeRow(0);
        }
        DefaultTableModel model = (DefaultTableModel) table.jt_lugar1.getModel();
        table.jl_nombre.setText(this.nombre);
        for (Persona persona : p) {
            if (persona.getLugar().equals(this.nombre)) {
                Object[] row = {persona.getNombre(), persona.getID(), persona.getEstatura(), persona.getProfesion(), persona.getEdad()};
                model.addRow(row);
            }
        }
        table.jt_lugar1.setModel(model);
    }

}
