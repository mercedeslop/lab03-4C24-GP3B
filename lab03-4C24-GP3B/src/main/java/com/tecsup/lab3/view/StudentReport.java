package com.tecsup.lab3.view;

public class StudentReport {

    // Método para imprimir el reporte del estudiante
    public void printReport(String studentName, int studentAge, double studentGrade) {
        System.out.println("Reporte del Estudiante");
        System.out.println("Nombre: " + studentName);
        System.out.println("Edad: " + studentAge);
        System.out.println("Nota: " + studentGrade);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de StudentReport
        StudentReport report = new StudentReport();
        
        // Datos del estudiante
        String name = "Juan";
        int age = 20;
        double grade = 16.5;
        
        // Imprimir el reporte del estudiante
        report.printReport(name, age, grade);
    }
}
