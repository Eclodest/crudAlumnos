package com.mycompany.gestoralumnos;

import java.util.Scanner;

/**
 *
 * @author Jaime
 */
public class Main {
    static Scanner leer = new Scanner(System.in);
    static GestorAlumnos ga = new GestorAlumnos();
            
    public static void main(String[] args) {
        int opcion;
        
        System.out.println("============================");
        System.out.println("--Calculando notas finales:");
        System.out.println("============================");
        
        boolean salir = false;
        do {
            menu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ingresarAlumno();
                    break;
                case 2:
                    mostrarAlumnos();
                    break;
                case 3:

                    break;
                case 4:
                    eliminarAlumnos();
                    break;
                case 5:
                    mocearAlumnos();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion inexistente");
            }
        }while (!salir);
        System.out.println("Adios!");
    }
    private static void menu() {
    System.out.println("Menu de Opciones");
    System.out.println("================");
    System.out.println("1. Ingresar Alumno y notas");
    System.out.println("2. Listar alumnos");
    System.out.println("3. Actualizar alumno");
    System.out.println("4. Eliminar alumno");
    System.out.println("5. Mocear alumno");
    System.out.println("0. Salir");
    System.out.println();
    System.out.print("Ingrese una opcion: ");
    }
    private static void ingresarAlumno() {

        String nombre;
        String apellido;
        String telefono;
        String correoElectronico;
        double nota1;
        double nota2;
        double nota3;
        double asistencia;
        double finales;

        
        System.out.println("======================================");
        System.out.println("Formulario de ingreso Alumno y notas: ");
        System.out.println();
        System.out.println("Nombre: ");
        nombre = leer.next();
        System.out.println("Apellido: ");
        apellido = leer.next();
        System.out.println("Telefono: ");
        telefono = leer.next();
        System.out.println("Correo: ");
        correoElectronico = leer.next();
        System.out.println("Nota 1: ");
        nota1 = leer.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = leer.nextDouble();
        System.out.println("Nota 3: ");
        nota3 = leer.nextDouble();
        System.out.println("Nota de asistencia: ");
        asistencia = leer.nextDouble();
        System.out.println("Nota Finales: ");
        finales = leer.nextDouble();

        
        ga.agregarAlumno(new Alumno( nombre, apellido, telefono, correoElectronico, nota1, nota2 ,nota3, asistencia, finales));
        
    }

    private static void eliminarAlumnos() {
        System.out.println("=====================================");
        System.out.println("Ingrese el ID del alumno a eliminar: ");
        int idEliminar = leer.nextInt();
        ga.eliminarAlumno(idEliminar);
    }
    private static void mostrarAlumnos() {
        cabeceraListarAlumnos();
        for (Alumno a : ga.listarAlumnos()) {
            System.out.println(a.toStr());
        }
    }  
    private static void cabeceraListarAlumnos() {
        // Salida de datos con variable local
        System.out.println("         LISTADO ALUMNOS");
        System.out.println("==================================================================================================================");
        System.out.println("ID NOMBRE APELLIDO TELEFONO CORREOELECTRONICO           NOTA 1 NOTA 2 NOTA 3 NOTA_ASISTENCIA NOTA_FINAL NOTA TOTAL");
        System.out.println("==================================================================================================================");
    }
    private static void  mocearAlumnos() {
        ga.agregarAlumno(new Alumno("Gerar","valdez","10123123","asdfj@gmail.com" ,10 ,9 ,8 ,1 ,10));
        ga.agregarAlumno(new Alumno("yendi","tejero","42565463","3fvdfgj@gmail.com" ,7 ,6 ,10 ,7 ,2));
        ga.agregarAlumno(new Alumno("Omar","montes","54645262","omarmontesoficial@gmail.com" ,0 ,10 ,10 ,0 ,0));
        
        System.out.println("\n3 registros agregados con exito.......!");

    }
}
