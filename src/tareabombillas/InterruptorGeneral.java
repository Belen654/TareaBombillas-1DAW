/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareabombillas;

/**
 *
 * @author acm92
 */
public class InterruptorGeneral {

    boolean encendidoPlomos = false;

    public InterruptorGeneral(boolean encendidoPlomos) {
        this.encendidoPlomos = encendidoPlomos;
    }

    public boolean isEncendidoPlomos() {
        return encendidoPlomos;
    }

    public void setEncendidoPlomos(boolean encendidoPlomos) {
        this.encendidoPlomos = encendidoPlomos;
    }
    
    public void tocarPlomos() {
        if (encendidoPlomos == false) {
            System.out.println("Se han dado los plomos, ya hay luz.");
            encendidoPlomos = true;
        } else {
            System.out.println("Se han apagado los plomos, no hay luz.");
            encendidoPlomos = false;
        }
    }
}
