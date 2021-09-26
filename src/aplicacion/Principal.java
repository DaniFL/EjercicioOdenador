package src.aplicacion; 
import src.dominio.*;

public class Principal{
    public static void main(String[] args) {

        //Nuevo modelo:

        Modelo modelo1 = new Modelo();
        modelo1.setNumeroModelo(1);
        modelo1.setMarca(" HP ");
        modelo1.setIdentificadorModelo("OMEN");
        modelo1.setModeloProcesador(" AMD Ryzen 7 ");
        modelo1.setDiscoDuro(" 1 TB ");
        modelo1.setMemoriaRam(" 16 GB ");
        //System.out.println(modelo1);


        //Nueva oferta:

        Oferta oferta1 = new Oferta();
        oferta1.setPrecioInicial(1200);
        oferta1.setDescuento(180);
        //System.out.println(oferta1);

        //Relación entre Oferta y Modelo:

        oferta1.setTieneOrdenadorOfertado(modelo1);
        System.out.println(oferta1);

    }
}