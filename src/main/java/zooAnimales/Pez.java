package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{
    //Atributos
    private static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    //Constructores
    public Pez() {}
    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas,
               int cantidadAletas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    //Métodos
    public static int cantidadPeces() {
        return listado.size();
    }
    public Pez crearSalmon(String nombre, int edad, String genero, Zona zona) {
        salmones += 1;
        return new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
    }
    public Pez crearBacalao(String nombre, int edad, String genero, Zona zona) {
        bacalaos += 1;
        return new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
    }
    public static ArrayList<Pez> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }
    public String getColorEscamas() {
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public int getCantidadAletas() {
        return cantidadAletas;
    }
    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
