/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        //1. crear una persona del barrio el valle de la ciudad de loja
        //2. crea una persona del barrio Central de la ciudad de Cuenca
        //3. crear una persona del Barrio Centenario de ola ciudad de Guayaquil
        
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        Barrio barrio1 = new Barrio("El Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad1);
        Barrio barrio3 = new Barrio("Centenario", ciudad3);
        
        Persona persona1 = new Persona("Juan Carlo", "1100878655", barrio1);
        Persona persona2 = new Persona("Adam Felipe", "1105515656", barrio2);
        Persona persona3 = new Persona("René Elizalde", "1100909909", barrio3);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s (%s) es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),persona1.obtenerCedula(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        persona1.establecerBarrio(barrio2);
        
        System.out.printf("El barrio de la persona %s (%s) es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),persona2.obtenerCedula(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        
        barrio2.establecerCiudad(ciudad2);
        System.out.printf("El barrio de la persona %s (%s) es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerNombre(),persona3.obtenerCedula(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
    }
}
