import mallaCurricular.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Facultad facultad = new Facultad("Facultad de Energía", "FEIRNNR"); // Insta
        Carrera computacion = new Carrera("123", "Computación",
                "Ingeniero en computacion", facultad, Modalidad.PRESENCIAL);
        facultad.getCarreraList().add(computacion);
        facultad.getCarreraList().add(new Carrera("124", "Electronica",
                "Ingeniero en electronica", facultad, Modalidad.PRESENCIAL));

       computacion.crearCiclos(9);
       computacion.crearAsignatura(2, "POO");
       computacion.crearAsignatura(2, "Análisis");
       computacion.crearAsignatura(2, "Matemática");
       System.out.println(facultad);
    }
}