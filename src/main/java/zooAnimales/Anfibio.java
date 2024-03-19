package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends Animal{
    //Atributos
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    //Constructores
    public Anfibio() {}
    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorpiel,
                   boolean venenoso) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorpiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    //Métodos
    public static int cantidadAnfibios() {
        return listado.size();
    }
    public Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
        ranas += 1;
        return new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
    }
    public Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
        salamandras += 1;
        return new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
    }
    public static ArrayList<Anfibio> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }
    public String getColorPiel() {
        return colorPiel;
    }
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }
    public boolean isVenenoso() {
        return venenoso;
    }
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}
