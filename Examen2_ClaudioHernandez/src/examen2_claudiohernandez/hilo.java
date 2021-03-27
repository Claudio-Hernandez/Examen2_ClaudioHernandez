/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_claudiohernandez;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Claudio Hernandez
 */
public class hilo extends Thread {

    private vehiculo vehiculo;
    private JProgressBar barra;
    private JTable tabla;
    private boolean vive = true;
    private double tiempoT = 1;
    private double tiempo2T = 1;
    private ArrayList<Double> tiempos = new ArrayList();

    public hilo(JProgressBar barra, JTable tabla) {
        this.vehiculo = vehiculo;
        this.barra = barra;
        this.tabla = tabla;
    }

    public void run() {
        double tiempo = vehiculo.getBateria().getTiempoensamblaje();
        System.out.println(tiempo);
        double tiempo2 = vehiculo.getCarroceria().getTiempoensamblaje();
        double tiempo3 = vehiculo.getInterior().getTiempoensamblaje();
        double tiempo4 = vehiculo.getSistemaInfro().getTiempoensamblaje();
        double tiempo5 = vehiculo.getBateria().getTiempoensamblaje();
        double tiempo6 = vehiculo.getAsientos().getTiempoensamblaje();
        tiempos.add(tiempo);
        tiempos.add(tiempo2);
        tiempos.add(tiempo3);
        tiempos.add(tiempo4);
        tiempos.add(tiempo5);
        tiempos.add(tiempo6);
        while (vive) {
             for (int i = 0; i < tiempos.size(); i++) {
                if (i == 0) {
                    barra.setString("ensamblando bateria");
                }
                if (i == 1) {
                    barra.setString("ensamblando carroceria");
                }
                if (i == 2) {
                    barra.setString("ensamblando interior");
                }
                if (i == 3) {
                    barra.setString("ensamblando sistema de infoentretenimiento");
                }
                if (i == 4) {
                    barra.setString("ensamblando asientos");
                }//fin ultimo if
                tiempo2T = tiempos.get(i);
                System.out.println(tiempo2T);
                while (tiempo2T > 0) {
                    tiempo2T = tiempo2T - tiempoT;
                    // barra.setValue((barra.getValue()*16)/100);
                    barra.setValue((barra.getValue() + 2));
                    tiempoT++;
                    if (tiempo2T <=0) {
                        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

                        tabla.setModel(modelo);
                        if (i == 0) {
                            barra.setString("ensamblando bateria");
                            Object[] x = {"bateria",tiempos.get(i)};
                            modelo.addRow(x);
                        }
                        if (i == 1) {
                            barra.setString("ensamblando carroceria");
                             Object[] x = {"carroceria",tiempos.get(i)};
                            modelo.addRow(x);
                        }
                        if (i == 2) {
                            barra.setString("ensamblando interior");
                             Object[] x = {"interior",tiempos.get(i)};
                            modelo.addRow(x);
                        }
                        if (i == 3) {
                            barra.setString("ensamblando sistema de infoentretenimiento");
                             Object[] x = {"sistema infoEtretenimiento",tiempos.get(i)};
                            modelo.addRow(x);
                        }
                        if (i == 4) {
                             Object[] x = {"asientos",tiempos.get(i)};
                            modelo.addRow(x);
                            barra.setString("ensamblando asientos");
                        }//fin ultimo if

                        JOptionPane.showMessageDialog(null, "termine");
                        break;
                    }
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(hilo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }//fin for
             vive =false;
             JOptionPane.showMessageDialog(null, "ensamblaje terminado");
          

        }

    }
    public void nosirce(){
    
    
   
    
    }

    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getTiempoT() {
        return tiempoT;
    }

    public void setTiempoT(double tiempoT) {
        this.tiempoT = tiempoT;
    }

    public double getTiempo2T() {
        return tiempo2T;
    }

    public void setTiempo2T(double tiempo2T) {
        this.tiempo2T = tiempo2T;
    }

    public ArrayList<Double> getTiempos() {
        return tiempos;
    }

    public void setTiempos(ArrayList<Double> tiempos) {
        this.tiempos = tiempos;
    }

}
