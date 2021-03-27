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
public class partes {
    private double tiempoensamblaje;

    public partes(double tiempoensamblaje) {
        this.tiempoensamblaje = tiempoensamblaje;
    }

    public double getTiempoensamblaje() {
        return tiempoensamblaje;
    }

    public void setTiempoensamblaje(double tiempoensamblaje) {
        this.tiempoensamblaje = tiempoensamblaje;
    }

    @Override
    public String toString() {
        return ""+tiempoensamblaje ;
    }
    
}
