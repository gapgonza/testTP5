/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Gonza
 */
public class Calculador {
     // Método para sumar dos números
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public double restar(double a, double b) {
        return a - b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return a / b;
    }

   
}
