/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_juan.guevara;

/**
 *
 * @author HP
 */
public class Rusos {
    public int edad;
    public int ID;
    public String nombre;
    public int resistencia;
    public String arma;
    public String rango;
    public int poder;

    public Rusos(int edad, int ID, String nombre, int resistencia, String arma, String rango, int poder) {
        this.edad = edad;
        this.ID = ID;
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.arma = arma;
        this.rango = rango;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getArma() {
        return arma;
    }

    public String getRango() {
        return rango;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    
}
