package mallaCurricular;

import ofertaAcademica.OfertaCiclo;

import java.util.ArrayList;

public class Ciclo {
    //Atributos
    private int numero;

    //Relaciones
    private Carrera carrera;
    private ArrayList<Asignatura> asignaturaList;
    private ArrayList<OfertaCiclo> ofertaCicloList;

    // Constructor
    public Ciclo() {
        this.asignaturaList = new ArrayList<>();
        this.ofertaCicloList = new ArrayList<>();
    }

    public Ciclo(int numero) {
        this();
        this.numero = numero;
    }

    public Ciclo(int numero, Carrera carrera) {
        this(numero);
        this.carrera = carrera;
    }

    // Métodos

    // Getters y Setters


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Asignatura> getAsignaturaList() {
        return asignaturaList;
    }

    public void setAsignaturaList(ArrayList<Asignatura> asignaturaList) {
        this.asignaturaList = asignaturaList;
    }

    public ArrayList<OfertaCiclo> getOfertaCicloList() {
        return ofertaCicloList;
    }

    public void setOfertaCicloList(ArrayList<OfertaCiclo> ofertaCicloList) {
        this.ofertaCicloList = ofertaCicloList;
    }

    // toString: La representación en cadena de un objeto
    @Override
    public String toString() {
        String s = "Ciclo{" +
                "numero=" + numero +
                '}';
        for (Asignatura asignatura : asignaturaList) {
            if (asignatura != null) {
                s += "\n" + asignatura;
            }
        }
        return s;
    }
}
