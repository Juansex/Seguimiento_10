package model;

import java.io.*;
import java.util.*;

public class Pais implements Comparable<Pais> {
    private String nombre;
    private int oro;
    private int plata;
    private int bronce;

    public Pais(String nombre) {
        this.nombre = nombre;
        oro = 0;
        plata = 0;
        bronce = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getOro() {
        return oro;
    }

    public int getPlata() {
        return plata;
    }

    public int getBronce() {
        return bronce;
    }

    public void agregarMedalla(String tipo) {
        if (tipo.equals("oro")) {
            oro++;
        } else if (tipo.equals("plata")) {
            plata++;
        } else if (tipo.equals("bronce")) {
            bronce++;
        }
    }

    public int getTotalMedallas() {
        return oro + plata + bronce;
    }

    public int compareTo(Pais otroPais) {
        if (oro > otroPais.getOro()) {
            return -1;
        } else if (oro < otroPais.getOro()) {
            return 1;
        } else if (plata > otroPais.getPlata()) {
            return -1;
        } else if (plata < otroPais.getPlata()) {
            return 1;
        } else if (bronce > otroPais.getBronce()) {
            return -1;
        } else if (bronce < otroPais.getBronce()) {
            return 1;
        } else {
            return nombre.compareTo(otroPais.getNombre());
        }
    }
}