/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // se crea un de tipo UnidadDVD
        String marca = "Toshiba";
        double costo = 600;
        UnidadDVD unidad = new UnidadDVD(marca,costo);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";
        double UnidadDVD = unidad;
        
        Computadora computadora = new Computadora(procesador, unidad);
        
        String varible_marca = computadora.obtenerTipoProcesador();
        UnidadDVD variable_unidad = computadora.obtenerUnidadDVD();
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                variable_marca,
                variable_unidad.obtenerMarca());
        
       
    }

}
