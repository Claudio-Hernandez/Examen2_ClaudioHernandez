package examen2_claudiohernandez;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudio Hernandez
 */
public class carroceria extends partes{
   private String tipo;
   private int capacidad;

    public carroceria(String tipo, int capacidad, double tiempoensamblaje) {
        super(tiempoensamblaje);
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return  tipo + ";" + capacidad+";"+super.toString();
    }
   
   
}
