/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_claudiohernandez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Claudio Hernandez
 */
public class adminVehiculos {

    private ArrayList<vehiculo> listaVehiculos = new ArrayList();
    private File archivo = null;

    public adminVehiculos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaVehiculos;
    }

    //extra mutador
    public void setVehiculo(vehiculo p) {
        this.listaVehiculos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (vehiculo t : listaVehiculos) {
                bw.write(t.toString()+";");

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        Scanner sc2 = null;
        listaVehiculos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc2 = new Scanner(archivo);
                sc.useDelimiter(";");
                sc2.useDelimiter(";");
                while (sc.hasNext()) {
                    System.out.println("hay");
                    String vin2 = sc.next();
                    String colorv = sc.next();
                    int autonomiav = sc.nextInt();
                    String materialBat = sc.next();
                    double tiempoBateria = sc.nextDouble();
                    //=====================================================
                    bateria bateriaNueva = new bateria(autonomiav, materialBat, tiempoBateria);
                    String tipoCarroceriac = sc.next();
                    int capacidaMale = sc.nextInt();
                    double tiempoCarroceriaC = sc.nextDouble();
                    carroceria nuevaCarroceria = new carroceria(tipoCarroceriac, capacidaMale, tiempoCarroceriaC);
                    //===========================================
                    String materialInte = sc.next();
                    String tipoV = sc.next();
                    int numerobot = sc.nextInt();
                    double tiempoInterior = sc.nextDouble();
                    interior interiornuevo = new interior(materialInte, tipoV, numerobot, tiempoInterior);
                    //=====================================================================
                    String tieneVisor = sc.next();
                    int numeroPantallas = sc.nextInt();
                    int ancho = sc.nextInt();
                    double tiemposistema = sc.nextInt();
                    sistemaInfro sistema = new sistemaInfro(numeroPantallas, tieneVisor, numeroPantallas, tiemposistema);
                    //=================================================
                    String tieneMasa = sc.next();
                    String elecOManual = sc.next();
                    String material = sc.next();

                    double tiempoA = sc.nextDouble();
                    asientos asientos = new asientos(material, elecOManual, tieneMasa, tiempoA);
                    //==========================
                    System.out.println("===================================================");
                    vehiculo vehiculoN = new vehiculo(vin2, colorv, bateriaNueva, nuevaCarroceria, interiornuevo, sistema, asientos);
                    listaVehiculos.add(vehiculoN);
                    System.out.println("========================================================================");
                    sc.next();
                   // sc.nextLine();
                }
            } catch (Exception ex) {
            }
            sc.close();
            sc2.close();
        }//FIN IF
    }
}
