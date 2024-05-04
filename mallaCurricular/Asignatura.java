package mallaCurricular;

import ofertaAcademica.OfertaAsignatura;

public class Asignatura {
    //Atributos
    private int aa;
    private int acd;
    private int ape;
    private int codigo;
    private String nombre;

    //Relaciones
    private Ciclo ciclo;
    private OfertaAsignatura[] ofertaAsignaturaList;

    // Constructor
    public Asignatura() {
        this.ofertaAsignaturaList = new OfertaAsignatura[10];
    }

    public Asignatura(int aa, int acd, int ape, int codigo, String nombre) {
        this();
        this.aa = aa;
        this.acd = acd;
        this.ape = ape;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Asignatura(int aa, int acd, int ape, int codigo, String nombre, Ciclo ciclo) {
        this(aa, acd, ape, codigo, nombre);
        this.ciclo = ciclo;
    }

    // Métodos

    // Getters y Setters


    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public int getAcd() {
        return acd;
    }

    public void setAcd(int acd) {
        this.acd = acd;
    }

    public int getApe() {
        return ape;
    }

    public void setApe(int ape) {
        this.ape = ape;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public OfertaAsignatura[] getOfertaAsignaturaList() {
        return ofertaAsignaturaList;
    }

    public void setOfertaAsignaturaList(OfertaAsignatura[] ofertaAsignaturaList) {
        this.ofertaAsignaturaList = ofertaAsignaturaList;
    }

    // toString: La representación en cadena de un objeto
    @Override
    public String toString() {
        return "Asignatura{" +
                "aa=" + aa +
                ", acd=" + acd +
                ", ape=" + ape +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
