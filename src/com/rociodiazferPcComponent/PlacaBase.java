package com.rociodiazferPcComponent;

public class PlacaBase {

    /**
     * Atributos, variables, propiedades, estado
     */

    private Integer id;
    private String marca;
    private String fabricante;
    private Integer precio;

    /**
     *    Metodo, funciones, comportamiento
     */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante=fabricante;
    }
    public Integer getPrecio(){
        return precio;
    }
    public void setPrecio(Integer precio){
        this.precio=precio;
    }
}