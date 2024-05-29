package com.example;

public class Main {
    public static void main(String[] args) {
        String nombre = "Emanuel Mesa";
        int salarioBase = 1800000;
        int horasTrabajo = 150;
        int horasExtras = 15;
        double auxilioTransporte = 150000;
        // Cálculo de la nómina
        double salarioDevengado = calcularSalarioDevengado(salarioBase, horasTrabajo, horasExtras);
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
    public static double calcularSalarioDevengado(int salarioBase, int horasTrabajo, int horasExtras) {
        // Cálculo del salario devengado
        double salarioDevengado = salarioBase + (horasExtras * (salarioBase / horasTrabajo));
        return salarioDevengado;
    }

    // Método para calcular las deducciones
    public static double calcularDeducciones(double salarioDevengado, double auxilioTransporte) {
        // Cálculo de las deducciones
        double deducciones = salarioDevengado * 0.1 + auxilioTransporte;
        return deducciones;
    }
    }