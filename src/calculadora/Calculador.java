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
     // M�todo para sumar dos n�meros
    public double sumar(double a, double b) {
        return a + b;
    }

    // M�todo para restar dos n�meros
    public double restar(double a, double b) {
        return a - b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisi�n por cero no permitida");
        }
        return a / b;
    }

   
}
