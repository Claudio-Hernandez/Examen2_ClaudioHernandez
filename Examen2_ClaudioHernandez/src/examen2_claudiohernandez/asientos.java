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
public class asientos extends partes{
    private String material;
    private String electricoManual;
    private String tieneMasaje;

    public asientos(String material, String electricoManual, String tieneMasaje, double tiempoensamblaje) {
        super(tiempoensamblaje);
        this.material = material;
        this.electricoManual = electricoManual;
        this.tieneMasaje = tieneMasaje;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getElectricoManual() {
        return electricoManual;
    }

    public void setElectricoManual(String electricoManual) {
        this.electricoManual = electricoManual;
    }

    public String getTieneMasaje() {
        return tieneMasaje;
    }

    public void setTieneMasaje(String tieneMasaje) {
        this.tieneMasaje = tieneMasaje;
    }

    @Override
    public String toString() {
        return  material + ";" + electricoManual + ";" + tieneMasaje +";"+ super.toString();
    }
    
}
