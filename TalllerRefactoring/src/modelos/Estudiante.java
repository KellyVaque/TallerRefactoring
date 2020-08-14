package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona {

    protected String matricula;
    protected String facultad;

    public Estudiante(String matricula, String facultad, String nombre, String apellido, int edad, ArrayList<Paralelo> paralelos, String direccion, String telefono) {
        super(nombre, apellido, edad, paralelos, direccion, telefono);
        this.matricula = matricula;
        this.facultad = facultad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaInicial(Paralelo p, Nota n) {
        double notaInicial = n.calcularNota(p);
        return notaInicial;
    }

    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaFinal(Paralelo p, Nota n) {
        double notaFinal = n.calcularNota(p);
        return notaFinal;
    }

    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p) {
        double notaTotal = 0;
        for (Paralelo par : paralelos) {
            if (p.equals(par)) {
                notaTotal = (p.getMateria().notaInicial + p.getMateria().notaFinal) / 2;

            }
        }
        return notaTotal;

    }
}
