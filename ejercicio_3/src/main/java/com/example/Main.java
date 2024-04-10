package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void calcularTriangulo(Scanner scanner) {
       System.out.println("introduce la base del triangulo");
       double baseTriangulo = scanner.nextDouble();
       System.out.println("introduce la alturura del triangulo");
       double altururaTtiangulo = scanner.nextDouble();
       double perimetroTriangulo = baseTriangulo + baseTriangulo + baseTriangulo;
       double areaTriangulo = baseTriangulo * altururaTtiangulo / 2;
       System.out.println("el perimetro del triangulo es: " + perimetroTriangulo);
       System.out.println("el area del triangulo es: " + areaTriangulo);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("Introduce el lado del cuadrado:");
        double lado = scanner.nextDouble();
        double perimetro = 4 * lado;
        double area = lado * lado;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
        System.out.println("El área del cuadrado es: " + area);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("Introduce la base del rectángulo:");
    double base = scanner.nextDouble();
    System.out.println("Introduce la altura del rectángulo:");
    double altura = scanner.nextDouble();
    double perimetro = 2 * (base + altura);
    double area = base * altura;
    System.out.println("El perímetro del rectángulo es: " + perimetro);
    System.out.println("El área del rectángulo es: " + area);
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.println("Introduce el radio del círculo:");
        double radio = scanner.nextDouble();
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;
        System.out.println("El perímetro del círculo es: " + perimetro);
        System.out.println("El área del círculo es: " + area);
    }
}
