/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareabombillas;
//
/**
 *
 * @author acm92
 */

/*
Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o
apagar simultáneamente. Para ello, hacer una clase Bombilla con una variable que indique
si está encendida o apagada, así como un método que nos diga el estado de una bombilla concreta.
Además, queremos poner un interruptor general, de forma que si este se apaga, todas las bombillas
quedan apagadas. Cuando el interruptor general se activa, las bombillas vuelven a estar encendidas
o apagadas,según estuvieran antes. Cada bombilla se enciende y se apaga individualmente, pero solo
responde que está encendida si su interruptor particular está activado y además hay luz general. 
(se puede hacer con el uso de array o sin ellos, además se puede indicar el número de bombillas
que tiene o preguntar, lo dejo a vuestra elección)

Finalmente realiza distintas pruebas con JUNIT4: plomo apagado, plomo encendido, apagar,
encender.. y sube el proyecto entero en .zip.
*/
public class Bombilla extends InterruptorGeneral {
jhawgdjhagds
    String nombre;
    boolean encenderBomb = true;
    boolean estadoPlomo = encendidoPlomos;   //creamos el estado del plomo 

    public Bombilla(String nombre, boolean encendidoPlomos) {
        super(encendidoPlomos);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEncenderBomb() {
        return encenderBomb;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEncenderBomb(boolean encenderBomb) {
        this.encenderBomb = encenderBomb;
    }
    
    // al pulsar el interruptor le pasamos siempre el estado del plomo para que pueda leerlo  
    public void pulsarInterruptor(boolean estadoPlomo) {
        this.estadoPlomo = estadoPlomo;
        if (estadoPlomo == true) {        //InterruptorGeneral.isEncendido() == true
            //cambios de Belén 
            if (encenderBomb == false) {
                encenderBomb = true;
                System.out.println("La bombilla " + nombre + " se ha encendido.");
            } else {
                encenderBomb = false;
                System.out.println("La bombilla " + nombre + " se ha apagado.");
            }
        } else {
            System.out.println("No hay luz en el sistema.");
            if (encenderBomb == false) {
                encenderBomb = true;
            }  else {
                encenderBomb = false;
            }
        }      
    }
       
    public void estado() {
        if (encenderBomb == false) {
            System.out.println("La bombilla " + nombre + " está apagada.");
        } else {
            if (estadoPlomo == true) {
                System.out.println("La bombilla " + nombre + " está encendida.");
            } else {
                System.out.println("El interruptor de la bombilla " + nombre + " está en posición de encendido, pero no hay luz.");
            }
        }
    }
}