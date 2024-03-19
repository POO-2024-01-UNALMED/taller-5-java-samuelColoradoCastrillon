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
    public Anfibio() {
        listado.add(this);
    }
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorpiel,
                   boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorpiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    //Métodos
    public static int cantidadAnfibios() {
        return listado.size();
    }
    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas += 1;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }
    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras += 1;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
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
