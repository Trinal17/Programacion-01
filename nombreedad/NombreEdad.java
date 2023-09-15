/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nombreedad;

/**
 *
 * @author melola
 */
public class NombreEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "Mari Luz";
        int edad = 48;
        int edad2 = 18;
        int total;
        
        total = edad + edad2;
        
        System.out.println("Hola, me llamo "+nombre+".");
        System.out.println("Tengo "+edad+" años!!");
        //System.out.println("La edad total es "+edad+edad2);
        //System.out.println("La edad total es "+(edad+edad2));
        System.out.println("La edad total es "+total);
        
    }
    
}
