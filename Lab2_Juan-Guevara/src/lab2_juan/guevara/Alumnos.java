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
public class Alumnos {
    public String apodo;
    public int NmoCuenta;
    public int edad;
    public int resistencia;
    public String GradAcademico;
    public String arma;

    public Alumnos(String apodo, int NmoCuenta, int edad, int resistencia, String GradAcademico, String arma) {
        this.apodo = apodo;
        this.NmoCuenta = NmoCuenta;
        this.edad = edad;
        this.resistencia = resistencia;
        this.GradAcademico = GradAcademico;
        this.arma = arma;
    }

    public String getApodo() {
        return apodo;
    }

    public int getNmoCuenta() {
        return NmoCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getGradAcademico() {
        return GradAcademico;
    }

    public String getArma() {
        return arma;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setNmoCuenta(int NmoCuenta) {
        this.NmoCuenta = NmoCuenta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setGradAcademico(String GradAcademico) {
        this.GradAcademico = GradAcademico;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    
    
}
