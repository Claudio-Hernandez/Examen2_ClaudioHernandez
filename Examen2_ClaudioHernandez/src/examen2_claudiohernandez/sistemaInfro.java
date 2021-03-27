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
public class sistemaInfro extends partes {
    private int cantidadPantallas;
    private String visor;
    private int tamanioPantalla;

   public sistemaInfro(int cantidadPantallas, String visor, int tamanioPantalla, double tiempoensamblaje) {
        super(tiempoensamblaje);
        this.cantidadPantallas = cantidadPantallas;
        this.visor = visor;
        this.tamanioPantalla = tamanioPantalla;
    }

    public int getCantidadPantallas() {
        return cantidadPantallas;
    }

    public void setCantidadPantallas(int cantidadPantallas) {
        this.cantidadPantallas = cantidadPantallas;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public int getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    @Override
    public String toString() {
        return cantidadPantallas + ";" + visor + ";" + tamanioPantalla +";"+ super.toString();
    }
    
}
