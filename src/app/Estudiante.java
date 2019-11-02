package app;

public class Estudiante{
    private String nombre;
    private String apellido;
    private String dni;
    private String posicion;
    private double valor;

    public Estudiante(){}

    public Estudiante(String nombre, String apellido, String dni, String posicion, double valor){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.posicion = posicion;
        this.valor = valor;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDni(){
        return this.dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public String getPosicion(){
        return this.posicion;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}