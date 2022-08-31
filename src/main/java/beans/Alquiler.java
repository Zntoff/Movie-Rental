/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.Date;


public class Alquiler {
    
   private int id;
   private int username;
   private Date fechaALquiler;
   private boolean novedad;
   private String genero;

    public Alquiler(int id, int username, Date fechaALquiler, boolean novedad, String genero) {
        this.id = id;
        this.username = username;
        this.fechaALquiler = fechaALquiler;
        this.novedad = novedad;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public int getUsername() {
        return username;
    }

    public Date getFechaALquiler() {
        return fechaALquiler;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public String getGenero() {
        return genero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public void setFechaALquiler(Date fechaALquiler) {
        this.fechaALquiler = fechaALquiler;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", username=" + username + ", fechaALquiler=" + fechaALquiler + ", novedad=" + novedad + ", genero=" + genero + '}';
    }
   
   
    
}
