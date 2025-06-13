package tpgrafos;

import java.util.ArrayList;

public class TestGrafo {
    public static void main(String[] args) {
        Grafo<Integer> gnd = new GND<>(1,2);
        gnd.addA(5, 3);
        gnd.addA(3, 4);
        gnd.addA(1, 5);
        gnd.addA(2, 6);

        ArrayList<Vertice<Integer>> camino = new ArrayList<>();
        Vertice<Integer> a = new Vertice<>(6);
        Vertice<Integer> b = new Vertice<>(5);
        ArrayList<Vertice<Integer>> visitados = new ArrayList<>();

        camino = gnd.camino(a, b, visitados);

        System.out.println("El camino tiene " + (camino.size()-1) + " pasos:");
        for (Vertice<Integer> aux : camino) {
            System.out.println(aux.getE());
            System.out.println("|");
            System.out.println("V");
            System.out.println();
        }

    }
}

