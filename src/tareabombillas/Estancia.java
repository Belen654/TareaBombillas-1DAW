/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareabombillas;
//hol
/**
 *
 * @author acm92
 */
public enum Estancia {
    entrada("Recibidor"),salon("Salón"), cocina("Cocina"), pasillo("Pasillo"), cuarto_juego("Cuarto de juegos"), estudio("Estudio"), dormitorio("Dormitorio"), baño("Baño");

    String nombre;

    Estancia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
