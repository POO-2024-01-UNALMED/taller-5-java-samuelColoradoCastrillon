package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    //Atributos
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    //Constructores
    public Ave() {}
    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    //Métodos
    public static int cantidadAves() {
        return listado.size();
    }
    public Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
        halcones += 1;
        return new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
    }
    public Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
        aguilas += 1;
        return new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
    }
    public static ArrayList<Ave> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }
    public String getColorPlumas() {
        return colorPlumas;
    }
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
