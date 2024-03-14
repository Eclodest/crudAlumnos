
package com.mycompany.gestoralumnos;

import java.util.ArrayList;
/**
 *
 * @author Jaime
 */
public class GestorAlumnos {
    private ArrayList<Alumno> Alumnos = new ArrayList<Alumno>();
    private int id = 0;
    
    public void agregarAlumno(Alumno estudiante) {
        estudiante.setId(id++);
        Alumnos.add(estudiante);
    }
    public void eliminarAlumno(int id) {
        Alumno alumnoEliminar = null;
        for (Alumno alumno : Alumnos) {
            if (alumno.getId() == id) {
                alumnoEliminar = alumno;
                break;
            }
        }
        if (alumnoEliminar != null) {
            Alumnos.remove(alumnoEliminar);
        } else {
            System.out.println("No se encontró ningún alumno con el ID proporcionado.");
        }
    }
    
    public ArrayList<Alumno> listarAlumnos() {
        ArrayList<Alumno> alumnosNoBorrados = new ArrayList<Alumno>();
        for (Alumno alumno : Alumnos) {
            if (!alumno.isBorrado()) {
                alumnosNoBorrados.add(alumno);
            }
        }
        return alumnosNoBorrados;
    }
}
