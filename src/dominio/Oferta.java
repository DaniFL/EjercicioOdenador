package src.dominio;

public class Oferta {

    private int precioInicial;
    private int descuento;

    public int calcularPrecioFinal() {
        int precioFinal = (precioInicial - descuento);
        return precioFinal;
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
    public String toString(){
        String datos2 =   precioInicial + "€" + " y un descuento de " + descuento + "€" +
                " siendo su precio final de " + calcularPrecioFinal()  + "€";
        return datos2;
    }
}