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
public class vehiculo {
    private String vin;
    private String color;
    private bateria bateria;
    private carroceria carroceria;
    private interior interior;
    private sistemaInfro sistemaInfro;
    private asientos asientos;

    public vehiculo(String vin, String color, bateria bateria, carroceria carroceria, interior interior, sistemaInfro sistemaInfro, asientos asientos) {
        this.vin = vin;
        this.color = color;
        this.bateria = bateria;
        this.carroceria = carroceria;
        this.interior = interior;
        this.sistemaInfro = sistemaInfro;
        this.asientos = asientos;
    }

    public vehiculo() {
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public bateria getBateria() {
        return bateria;
    }

    public void setBateria(bateria bateria) {
        this.bateria = bateria;
    }

    public carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public interior getInterior() {
        return interior;
    }

    public void setInterior(interior interior) {
        this.interior = interior;
    }

    public sistemaInfro getSistemaInfro() {
        return sistemaInfro;
    }

    public void setSistemaInfro(sistemaInfro sistemaInfro) {
        this.sistemaInfro = sistemaInfro;
    }

    public asientos getAsientos() {
        return asientos;
    }

    public void setAsientos(asientos asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return  vin + ";" + color + ";" + bateria + ";" + carroceria + ";" + interior + ";" + sistemaInfro + ";" + asientos;
    }
    
}
