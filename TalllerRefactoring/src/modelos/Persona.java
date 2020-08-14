/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Xavier
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected ArrayList<Paralelo> paralelos;
    protected String direccion;
    protected String telefono;

    public Persona(String nombre, String apellido, int edad, ArrayList<Paralelo> paralelos, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.paralelos = paralelos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

  

}
