package com.example;

public class Main {
    public static void main(String[] args) {
        String nombre = "Juan Zapata";
        int salarioBase = 4500000;
        int horasTrabajo = 192;
        int horasExtras = 10;
        int auxilioTransporte = 162000;
        // Cálculo de la nómina
        double salarioDevengado = calcularSalarioDevengado(salarioBase, horasTrabajo, horasExtras, auxilioTransporte);
        double deducciones = calcularDeducciones(salarioDevengado, auxilioTransporte);
        double salarioNeto = salarioDevengado - deducciones;

        // Impresión de la nómina
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Auxilio transporte: $" + auxilioTransporte);
        System.out.println("Salario devengado: $" + salarioDevengado);
        System.out.println("Deducciones: $" + deducciones);
        System.out.println("Salario neto: $" + salarioNeto);
    }
    // Método para calcular el salario devengado
    public static double calcularSalarioDevengado(int salarioBase, int horasTrabajo, int horasExtras, int auxilioTransporte) {
        double salarioPorHora = salarioBase/horasTrabajo;//234 375
        double salarioHorasExtras = salarioPorHora * 1.25 * horasExtras;
        double devengoTotal = salarioBase + salarioHorasExtras + auxilioTransporte;
        return devengoTotal;
    }

    // Método para calcular las deducciones
    public static double calcularDeducciones(double salarioDevengado, double auxilioTransporte) {
        double deducciones = salarioDevengado * 0.08 + auxilioTransporte;
        return deducciones;

    }
    public static double calcularSalarioNeto(double salarioDevengado, double deducciones) {
        double salarioNeto = salarioDevengado - deducciones;
        return salarioNeto;
} 
}