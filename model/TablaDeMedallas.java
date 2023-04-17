package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TablaDeMedallas {
    private ArrayList<Pais> getPaises, paises;

    public TablaDeMedallas() {
        paises = new ArrayList<>();
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public void ordenarPorMedalleriaConvencional() {
        Collections.sort(paises);
    }

    public void ordenarPorTotalMedallas() {
        Comparator<Pais> cmp = Comparator.comparingInt(Pais::getTotalMedallas).reversed()
                .thenComparing(Pais::getNombre);
        Collections.sort(paises, cmp);
    }

    public void ordenarAlfabeticamente() {
        // Método de ordenamiento de burbuja
        int n = paises.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (paises.get(j).getNombre().compareTo(paises.get(j+1).getNombre()) > 0) {
                    Pais temp = paises.get(j);
                    paises.set(j, paises.get(j+1));
                    paises.set(j+1, temp);
                }
            }
        }
        // También se puede utilizar el método de ordenamiento de selección o inserción
    }

    public void imprimir() {
        System.out.println("Pais\tOro\tPlata\tBronce\tTotal");
        for (Pais pais : paises) {
            System.out.println(pais.getNombre() + "\t" + pais.getOro() + "\t" + pais.getPlata() + "\t"
                    + pais.getBronce() + "\t" + pais.getTotalMedallas());
        }
    }
}
