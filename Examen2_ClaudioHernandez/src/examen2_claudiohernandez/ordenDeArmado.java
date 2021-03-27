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
public class ordenDeArmado {
    private vehiculo vehiculo;
    private ensamblador ensamblador;

    public ordenDeArmado(vehiculo vehiculo, ensamblador ensamblador) {
        this.vehiculo = vehiculo;
        this.ensamblador = ensamblador;
    }

    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ensamblador getEnsamblador() {
        return ensamblador;
    }

    public void setEnsamblador(ensamblador ensamblador) {
        this.ensamblador = ensamblador;
    }

    @Override
    public String toString() {
        return "ordenDeArmado" + "vehiculo=" + vehiculo + ", ensamblador=" + ensamblador;
    }
    
}
