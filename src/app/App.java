package app;

public class App {
    public static void main(String[] args) throws Exception {
        Estudiante nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setNombre("pepito");
        System.out.println("El estudiante se llama " + nuevoEstudiante.getNombre());
    }
}