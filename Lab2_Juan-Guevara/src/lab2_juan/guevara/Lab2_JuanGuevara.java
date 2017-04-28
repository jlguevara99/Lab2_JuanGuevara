/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_juan.guevara;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lab2_JuanGuevara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char seguir = 's';
        int opcion, id, edad, poder = 0, cuenta;
        String nombre, Rango, arma = "", casta = "", grado="";
        ArrayList ejercitoRuso = new ArrayList();
        ArrayList ejercitoAleman = new ArrayList();
        ArrayList ejercitoAlumnos = new ArrayList();

        do {
            System.out.println("1. Agregar Rusos");
            System.out.println("2. Agregar Alemanes");
            System.out.println("3. Agregar Alumnos");
            System.out.println("4. Simular");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Soldado Ruso");
                        System.out.println("Nombre del soldado: ");
                        nombre = sc.next();
                        System.out.println("ID del soldado: ");
                        id = sc.nextInt();
                        System.out.println("Edad del soldado: ");
                        edad = sc.nextInt();
                        if (edad < 18) {
                            System.out.println("El soldado no tiene la edad adecuada para ingresar(mayor de 18 años)");
                            System.out.println("Ingrese otro soldado");
                            seguir = 's';
                            continue;
                        }
                        System.out.println("Rango del soldado: ");
                        Rango = sc.next();
                        int tipoArma = 100;
                        while (tipoArma < 1 || tipoArma > 3) {
                            System.out.println("Arma del soldado:");
                            System.out.println("1. AK-47");
                            System.out.println("2. Revolver Navant");
                            System.out.println("3. RPG-7");
                            tipoArma = sc.nextInt();
                            switch (tipoArma) {
                                case 1:
                                    arma = "AK-47";
                                    poder = 27;
                                    break;
                                case 2:
                                    arma = "Revolver Navant";
                                    poder = 13;
                                    break;
                                case 3:
                                    if (edad < 25) {
                                        tipoArma = 100;
                                        System.out.println("Muy joven para RPG-7");
                                    }
                                    arma = "RPG-7";
                                    poder = 57;
                                    break;
                                default:
                                    System.out.println("El tipo de arma es incorrecto.");
                            }
                        }
                        ejercitoRuso.add(new Rusos(edad, id, nombre, edad * 8, arma, Rango, poder));
                        System.out.println("Desea Ingresar otro soldado Ruso?  [s/n]");
                        seguir = sc.next().charAt(0);
                    } while (seguir == 's');
                    break;
                case 2:
                    do {
                        System.out.println("Soldado Aleman");
                        System.out.println("Alias del soldado: ");
                        nombre = sc.next();
                        System.out.println("casta del soldado: ");
                        casta = sc.next();
                        System.out.println("Edad del soldado: ");
                        edad = sc.nextInt();
                        if (edad < 0) {
                            System.out.println("El soldado no tiene la edad adecuada para ingresar)");
                            System.out.println("Ingrese otro soldado");
                            seguir = 's';
                            continue;
                        }
                        
                        int tipoArma = 100;
                        while (tipoArma < 1 || tipoArma > 3) {
                            System.out.println("Arma del soldado:");
                            System.out.println("1. AK-47");
                            System.out.println("2. Revolver Navant");
                            System.out.println("3. RPG-7");
                            tipoArma = sc.nextInt();
                            switch (tipoArma) {
                                case 1:
                                    arma = "MP 40";
                                    poder = 25;
                                    break;
                                case 2:
                                    arma = "Ametralladora MG42";
                                    poder = 32;
                                    break;
                                case 3:
                                    arma = "Pistolas Walther P38";
                                    poder = 11;
                                    break;
                                default:
                                    System.out.println("El tipo de arma es incorrecto.");
                            }
                        }
                        ejercitoAleman.add(new Alemanes(nombre,edad,casta,edad*8,arma,poder));
                            
                        System.out.println("Desea Ingresar otro soldado Aleman?  [s/n]");
                        seguir = sc.next().charAt(0);
                    } while (seguir == 's');
                    break;
                case 3:
                    do {
                        System.out.println("Alumno");
                        System.out.println("Apodo del soldado: ");
                        nombre = sc.next();
                        System.out.println("Numero de cuenta del alumno ");
                        cuenta = sc.nextInt();
                        System.out.println("Edad del alumno: ");
                        edad = sc.nextInt();
                        System.out.println("Grado academico del alumno: ");
                        grado = sc.next();
                        if (edad < 16) {
                            System.out.println("El alumno no tiene la edad adecuada para ingresar)");
                            System.out.println("Ingrese otro alumno");
                            seguir = 's';
                            continue;
                        }
                        
                        int tipoArma = 100;
                        while (tipoArma < 1 || tipoArma > 3) {
                            System.out.println("Arma del alumno:");
                            System.out.println("1. AK-47");
                            System.out.println("2. Revolver Navant");
                            System.out.println("3. RPG-7");
                            tipoArma = sc.nextInt();
                            switch (tipoArma) {
                                case 1:
                                    arma = "Discos duros";
                                    poder = 23;
                                    break;
                                case 2:
                                    arma = "Controles de Wii";
                                    poder = 47;
                                    break;
                                case 3:
                                    arma = "Laptop";
                                    poder = 76;
                                    break;
                                default:
                                    System.out.println("El tipo de arma es incorrecto.");
                            }
                        }
                        ejercitoAlumnos.add(new Alumnos(nombre,cuenta,edad,edad*8,grado,arma,poder));
                        System.out.println("Desea Ingresar otro alumno?  [s/n]");
                        seguir = sc.next().charAt(0);
                    } while (seguir == 's');
            }

        } while (opcion != 5);

    }

}
