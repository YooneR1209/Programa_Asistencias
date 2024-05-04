package mallaCurricular;

import ofertaAcademica.OfertaCarrera;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Carrera {
    //Atributos
    private String codigo;
    private String nombre;
    private String titulo;

    private static int contador = 0;

    //Relaciones
    private Facultad facultad;
    private ArrayList<Ciclo> cicloList;
    private Modalidad modalidad;
    private ArrayList<OfertaCarrera> ofertaCarreraList;

    // Constructor
    public Carrera() {
        this.cicloList = new ArrayList<>();
        this.ofertaCarreraList = new ArrayList<>();
    }

    public Carrera(String codigo, String nombre, String titulo) {
        this();
        this.codigo = codigo;
        this.nombre = nombre;
        this.titulo = titulo;
    }

    public Carrera(String codigo, String nombre, String titulo, Facultad facultad) {
        this(codigo, nombre, titulo);
        this.facultad = facultad;
    }

    public Carrera(String codigo, String nombre, String titulo, Facultad facultad, Modalidad modalidad) {
        this(codigo, nombre, titulo, facultad);
        this.modalidad = modalidad;
    }

    // Métodos

    public void crearCiclos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            this.cicloList.add(new Ciclo(i + 1, this));
        }
    }

    public void crearAsignatura(int numero, String nombre){
        cicloList.get(numero-1).getAsignaturaList()
                .add(new Asignatura(56, 80, 64, 8,
                        nombre, cicloList.get(numero-1)));
        contador += 1;
    }

    // Getters y Setters


    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Carrera.contador = contador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public ArrayList<Ciclo> getCicloList() {
        return cicloList;
    }

    public void setCicloList(ArrayList<Ciclo> cicloList) {
        this.cicloList = cicloList;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public ArrayList<OfertaCarrera> getOfertaCarreraList() {
        return ofertaCarreraList;
    }

    public void setOfertaCarreraList(ArrayList<OfertaCarrera> ofertaCarreraList) {
        this.ofertaCarreraList = ofertaCarreraList;
    }

    // toString: La representación en cadena de un objeto
    @Override
    public String toString() {
        String s = "Carrera{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", titulo='" + titulo + '\'' +
                ", modalidad=" + modalidad +
                '}';
        for (Ciclo ciclo : cicloList) {
            if (ciclo != null) {
                s += "\n" + ciclo;
            }
        }
        return s;
    }
}
