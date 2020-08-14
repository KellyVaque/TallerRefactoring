package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {

    private ArrayList<Paralelo> ayudantias;

    public Ayudante(ArrayList<Paralelo> ayudantias, String matricula, String facultad, String nombre, String apellido, int edad, ArrayList<Paralelo> paralelos, String direccion, String telefono) {
        super(matricula, facultad, nombre, apellido, edad, paralelos, direccion, telefono);
        this.ayudantias = ayudantias;
    }

    //Metodo para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos() {
        for (Paralelo ayu : ayudantias) {
        }
    }
}
