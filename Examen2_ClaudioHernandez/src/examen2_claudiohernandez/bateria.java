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
public class bateria  extends partes{
    private int autonomia;
    private String material;

    public bateria(int autonomia, String material, double tiempoensamblaje) {
        super(tiempoensamblaje);
        this.autonomia = autonomia;
        this.material = material;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return autonomia + ";" + material +";"+super.toString() ;
    }
    
    
}
