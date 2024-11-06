package coleccion;

public abstract class ElementoColeccionable {
    protected String pais;
    protected String autoridadGobernante;
    protected int annus;
    protected double valor;
    protected String unidadMonetaria;
    protected int rareza;
    protected double precio;

    public ElementoColeccionable(String pais, String autoridadGobernante, int annus, double valor,
                                 String unidadMonetaria, int rareza, double precio) {
        if (rareza < 1 || rareza > 100) {
            throw new IllegalArgumentException("La rareza debe estar entre 1 y 100.");
        }
        this.pais = pais;
        this.autoridadGobernante = autoridadGobernante;
        this.annus = annus;
        this.valor = valor;
        this.unidadMonetaria = unidadMonetaria;
        this.rareza = rareza;
        this.precio = precio;
    }

    public int getRareza() { return rareza; }
    public double getPrecio() { return precio; }
}
