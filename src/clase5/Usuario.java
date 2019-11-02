package clase5;

public class Usuario{
    private int idUsuario;
    private String nombre;
    private double dineroDisponible;
    private static int nunUsuarios;

    public Usuario(String nombre, double dineroDisponible){
        this.nombre = nombre;
        this.dineroDisponible = dineroDisponible;
        this.idUsuario = Usuario.getNumUsuarios();
        nunUsuarios++;
    }

    public int getIdUsuario(){
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getDineroDisponible(){
        return this.dineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible){
        this.dineroDisponible = dineroDisponible;
    }

    public static int getNumUsuarios(){
        return nunUsuarios;
    }

    public static void setNumUsuarios(int numUsuarios){
        Usuario.nunUsuarios = numUsuarios;
    }

    public static void imprimirNumUsuarios(){
        System.out.println("El numero de usuarios es " + Usuario.nunUsuarios);
    }
}