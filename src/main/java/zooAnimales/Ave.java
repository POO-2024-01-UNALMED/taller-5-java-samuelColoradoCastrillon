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
    public Ave() {listado.add(this);}
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    //Métodos
    public String movimiento() {
        return "volar";
    }
    public static int cantidadAves() {
        return listado.size();
    }
    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones += 1;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }
    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas += 1;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
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
