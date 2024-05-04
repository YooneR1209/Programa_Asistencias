package mallaCurricular;

import java.util.ArrayList;

public class Facultad {
    //Atributos
    private String nombre;
    private String siglas;

    //Relaciones
    private ArrayList<Carrera> carreraList;

    // Constructor
    public Facultad() {
        this.carreraList = new ArrayList<>();
    }

    public Facultad(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Facultad(String nombre, String siglas) {
        this(nombre);
        this.siglas = siglas;
    }


    // Métodos
    public boolean inicializar(String nuevoNombre, String siglas) {
        this.nombre = nuevoNombre;
        this.siglas = siglas;
        return true;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public ArrayList<Carrera> getCarreraList() {
        return carreraList;
    }

    public void setCarreraList(ArrayList carreraList) {
        this.carreraList = carreraList;
    }

    // toString: La representación en cadena de un objeto
    @Override
    public String toString() {
        String s = "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", siglas='" + siglas + '\'' +
                '}';
        for (Carrera carrera : carreraList) {
            if (carrera != null) {
                s += "\n" + carrera;
            }
        }
        return s;
    }
}
