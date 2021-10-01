package src.aplicacion; 
import src.dominio.*;

import java.util.Scanner;

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

        Modelo modelo2 = new Modelo();
        modelo2.setNumeroModelo(2);
        modelo2.setMarca(" APPLE ");
        modelo2.setIdentificadorModelo("MacBook Pro");
        modelo2.setModeloProcesador(" Intel i9 ");
        modelo2.setDiscoDuro(" 1 TB ");
        modelo2.setMemoriaRam(" 16 GB ");

        //Nueva oferta:

        Oferta oferta1 = new Oferta();
        oferta1.setPrecioInicial(1200);
        oferta1.setDescuento(180);
        //System.out.println(oferta1);

        Oferta oferta2 = new Oferta();
        oferta2.setPrecioInicial(900);
        oferta2.setDescuento(150);

        /*Relación entre Oferta y Modelo:
        oferta1.setTieneOrdenadorOfertado(modelo1);
        oferta2.setTieneOrdenadorOfertado(modelo2);
        System.out.println(oferta1);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione un modelo:");
        int ordenador = sc.nextInt();
            if (ordenador == 1){
                oferta1.setTieneOrdenadorOfertado(modelo1);
                System.out.println(oferta1);
            } else if (ordenador == 2){
            oferta2.setTieneOrdenadorOfertado(modelo2);
            System.out.println(oferta2);
            } else{
            System.out.println("No existe el modelo que busca");
            }
    }
}