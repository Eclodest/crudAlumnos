package com.mycompany.gestoralumnos;

/**
 *
 * @author Jaime
 */
public class Alumno {

    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private double nota1;
    private double nota2;
    private double nota3;
    private double asistencia;
    private double finales;
    private double notaTotal;
    private String notaCualitativa;
    private boolean borrado;
    
    public Alumno( String nombre, String apellido, String telefono, String correoElectronico, double nota1, double nota2, double nota3, double asistencia, double finales){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.asistencia = asistencia;
        this.finales = finales;
        calcularNotaCualitativa();
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String numero){
        this.telefono = numero;
    }
    public String setCorreoElectronico(){
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    public double getNota1(){
        return nota1;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public double getNota3(){
        return nota3;
    }
    public void setNota3(double nota3){
        this.nota3 = nota3;
    }
    public double getAsistencia(){
        return asistencia;
    }
    public void setAsistencia(double asistencia){
        this.asistencia = asistencia;
    }
    public double getFinales(){
        return finales;
    }
    public void setFinales(double finales){

        this.finales = finales;
    }
    public void setNotaTotal(double notaTotal){
        this.notaTotal = notaTotal;
        calcularNota();
        calcularNotaCualitativa();

    }
    public double getNotaTotal(){
        return notaTotal;
    }

    public boolean isBorrado() {
        return borrado;
    }
    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
    private void calcularNota(){
        this.notaTotal = (this.nota1*0.2 + this.nota2*0.2 + this.nota3*0.2 + this.asistencia * 0.1 + this.finales * 0.3);
    }
    
    private void calcularNotaCualitativa() {
        calcularNota();
        if (this.notaTotal >= 5.0 && this.notaTotal < 7.0) {
            this.notaCualitativa = "Aprobado";
        } else if (this.notaTotal >= 7.0 && this.notaTotal < 9.0) {
            this.notaCualitativa = "Notable";
        } else if (this.notaTotal >= 9.0 && this.notaTotal <= 10.0) {
            this.notaCualitativa = "Sobresaliente";
        } else {
            this.notaCualitativa = "Suspenso";
        }
    }
    
    public String toStr() {
        return String.format("%-2d %-7s %-7s %-5s %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-5s",id, nombre,apellido,telefono,correoElectronico, nota1, nota2, nota3,asistencia, finales, notaCualitativa);
    }
    
}
