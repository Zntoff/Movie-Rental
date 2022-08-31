/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;


public class Usuarios {
    private int username;
    private String contraseña;
    private String apellido;
    private String email;
    private double saldo;
    private boolean premium;

    public Usuarios(int username, String contraseña, String apellido, String email, double saldo, boolean premium) {
        this.username = username;
        this.contraseña = contraseña;
        this.apellido = apellido;
        this.email = email;
        this.saldo = saldo;
        this.premium = premium;
    }

    public int getUsername() {
        return username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "username=" + username + ", contrase\u00f1a=" + contraseña + ", apellido=" + apellido + ", email=" + email + ", saldo=" + saldo + ", premium=" + premium + '}';
    }
    
    
}
