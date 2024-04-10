package com.example;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Adivina el numero entre 1-100");
        Scanner na = new Scanner(System.in);
        int numeroUsuario = na.nextInt();
        int numeroAleatorio = numeroAleatorio();
        adivinarNumero(numeroUsuario,numeroAleatorio , 5);
    }

    public static int numeroAleatorio() {     
        // Crear un objeto de la clase Random
        Random rand = new Random();
        
        // Generar un número entero aleatorio entre 0 y 100
        return rand.nextInt(100) + 1; // El argumento especifica el límite superior exclusivo
    }


    // Método para calcular las deducciones
    public static void adivinarNumero(int numeroUsuario, int numeroAleatorio, int max_intentos) {
      int intentos = 0;
      while (intentos<max_intentos) {
        intentos++;
      
      if (numeroAleatorio==numeroUsuario) {
        System.out.println("Felicitaciones has adivinado el numero");
      }
      else if (numeroAleatorio>numeroUsuario) {
        System.out.println("el numero por adivinar es mayor");
      }
      else {
        System.out.println("El numero por adivinar es menor");
      }
      if (intentos < max_intentos) {
        Scanner na = new Scanner(System.in);
        numeroUsuario = na.nextInt();
    } 
    }
    System.out.println("Agotaste todos los intentos. El número correcto era: " + numeroAleatorio);
}

}

