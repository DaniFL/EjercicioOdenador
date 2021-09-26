package src.dominio;

public class Oferta {

    //Atributos

    private int precioInicial;
    private int descuento;
    private Modelo tieneOrdenadorOfertado;

    //Método para calcular el precio final del producto:

    public int calcularPrecioFinal() {
        return precioInicial - descuento;
    }

    //Encapsulación (métodos get&set de los atributos de la clase)

    public Modelo getTieneOrdenadorOfertado() {
        return tieneOrdenadorOfertado;
    }

    public void setTieneOrdenadorOfertado(Modelo tieneOrdenadorOfertado) {
        this.tieneOrdenadorOfertado = tieneOrdenadorOfertado;
    }

    public int getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(int precioInicial) {
        this.precioInicial = precioInicial;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String toString() {
        return "\n" + tieneOrdenadorOfertado + "\n" + "\nOferta ordenador: " + "\n- Precio Inicial: " + precioInicial + "€"
                + "\n- Descuento: " + descuento + "€" + "\n- Precio Final: " + calcularPrecioFinal() + "€";
    }

}