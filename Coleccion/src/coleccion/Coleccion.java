package coleccion;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<ElementoColeccionable> elementos;

    public Coleccion() {
        elementos = new ArrayList<>();
    }

    public void añadirElemento(ElementoColeccionable elemento) {
        elementos.add(elemento);
    }

    public void mostrarMonedas() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                System.out.println(elemento);
            }
        }
    }

    public void mostrarSellos() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                System.out.println(elemento);
            }
        }
    }

    public double precioTotal() {
        double total = 0;
        for (ElementoColeccionable elemento : elementos) {
            total += elemento.getPrecio();
        }
        return total;
    }

    public double rarezaMedia() {
        if (elementos.isEmpty()) return 0;
        double totalRareza = 0;
        for (ElementoColeccionable elemento : elementos) {
            totalRareza += elemento.getRareza();
        }
        return totalRareza / elementos.size();
    }
}

