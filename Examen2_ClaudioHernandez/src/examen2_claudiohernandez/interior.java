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
public class interior  extends partes{
    private String materialUtilizado;
    private String tipoVolante;
    private int botones;

    public interior(String materialUtilizado, String tipoVolante, int botones, double tiempoensamblaje) {
        super(tiempoensamblaje);
        this.materialUtilizado = materialUtilizado;
        this.tipoVolante = tipoVolante;
        this.botones = botones;
    }

    public String getMaterialUtilizado() {
        return materialUtilizado;
    }

    public void setMaterialUtilizado(String materialUtilizado) {
        this.materialUtilizado = materialUtilizado;
    }

    public String getTipoVolante() {
        return tipoVolante;
    }

    public void setTipoVolante(String tipoVolante) {
        this.tipoVolante = tipoVolante;
    }

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }

    @Override
    public String toString() {
        return   materialUtilizado + ";" + tipoVolante + ";" + botones+";"+super.toString();
    }
    
    
}
