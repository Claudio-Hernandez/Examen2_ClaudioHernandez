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
public class ensamblador {
    private int id;
    private String nomnbre;
    private String genero;
    private int cantidadEnsamblados;

    public ensamblador(int id, String nomnbre, String genero, int cantidadEnsamblados) {
        this.id = id;
        this.nomnbre = nomnbre;
        this.genero = genero;
        this.cantidadEnsamblados = cantidadEnsamblados;
    }

    public ensamblador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidadEnsamblados() {
        return cantidadEnsamblados;
    }

    public void setCantidadEnsamblados(int cantidadEnsamblados) {
        this.cantidadEnsamblados = cantidadEnsamblados;
    }

    @Override
    public String toString() {
        return   id + ":" + nomnbre + ":" + genero + ":" + cantidadEnsamblados;
    }
    
}
