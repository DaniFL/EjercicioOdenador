package src.dominio; 

public class Modelo {

private String marca = "";
private String modeloProcesador = "";
private String identificadorModelo;
private String memoriaRam;
private String discoDuro;
private Oferta tieneOrdenadorOfertado;

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

public void setTieneOrdenadorOfertado(Oferta tieneOrdenadorOfertado){
    this.tieneOrdenadorOfertado = tieneOrdenadorOfertado;
}
public Oferta getTieneOrdenadorOfertado() {
    return tieneOrdenadorOfertado;
}
public String toString(){
    String datos = 
    return datos;
}
}
