package modelos;

import java.util.ArrayList;

public class Profesor extends Persona {

    private String codigo;

    private InformacionAdicionalProfesor info;

    public InformacionAdicionalProfesor getInfo() {
        return info;
    }

    public Profesor(String codigo, String nombre, String apellido, int edad, ArrayList<Paralelo> paralelos, String direccion, String telefono) {
        super(nombre, apellido, edad, paralelos, direccion, telefono);
        this.codigo = codigo;
    }

    public void anadirParalelos(Paralelo p) {
        paralelos.add(p);
    }

}
