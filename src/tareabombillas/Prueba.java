/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareabombillas;

/**
 *
 * @author acm92
 */
public class Prueba {
    public static void main(String[] args) {
        InterruptorGeneral plomos = new InterruptorGeneral(false);
        Bombilla b1 = new Bombilla("b1", plomos.isEncendidoPlomos());
        Bombilla b2 = new Bombilla("b2", plomos.isEncendidoPlomos());
        Bombilla b3 = new Bombilla("b3", plomos.isEncendidoPlomos());
        
        //Siempre que se llama a pulsarInterruptor se le pasa el estado del plomo
     //   b1.estado();                                                //estado apagada
       // b1.pulsarInterruptor(plomos.encendidoPlomos);    //enciende bombilla1
        //b1.estado();                                                //está encendida, pero no hay luz en el sistema
        //System.out.println();
        
        plomos.tocarPlomos();                                       //da luz al sistema
        b2.pulsarInterruptor(plomos.encendidoPlomos);    //enciende bombilla2
        b2.estado();                                                //estado encendida
        System.out.println();
        
        plomos.tocarPlomos();                                       //corta luz del sistema
        plomos.tocarPlomos();                                       //da luz al sistema
        b2.estado();                                                //estado encendida
        System.out.println();
        
        b3.pulsarInterruptor(plomos.encendidoPlomos);    //enciende bombilla3
    }
}
