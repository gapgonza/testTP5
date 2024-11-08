/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Gonza
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculador calculador = new Calculador();

        double numero1 = 5.5;
        double numero2 = 3.2;

        double suma = calculador.sumar(numero1, numero2);
        double resta = calculador.restar(numero1, numero2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    
    }
    
}
