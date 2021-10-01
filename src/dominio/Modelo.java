package src.dominio; 

public class Modelo {

    //Atributos

    private int numeroModelo;
    private String marca;
    private String modeloProcesador;
    private String identificadorModelo;
    private String memoriaRam;
    private String discoDuro;

    //Encapsulación (métodos get&set de los atributos de la clase)

    public int getNumeroModelo() {
        return numeroModelo;
    }

    public void setNumeroModelo(int numeroModelo) {
        this.numeroModelo = numeroModelo;
    }

    public void setMarca(String marca) {
    this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }
    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setIdentificadorModelo(String identificadorModelo) {
        this.identificadorModelo = identificadorModelo;
    }
    public String getIdentificadorModelo() {
        return identificadorModelo;
    }

    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }
    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public String toString(){
        return "\n" + "Modelo " + numeroModelo + ":" +  "\n- Marca:" + marca + "\n- Identificador: " + identificadorModelo + "\n- Memoria ram:" +
                memoriaRam + "\n- Modelo procesador:" + modeloProcesador + "\n- Disco duro:" + discoDuro;
    }
}
