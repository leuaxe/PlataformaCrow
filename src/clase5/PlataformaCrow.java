package clase5;

public class PlataformaCrow{
    private String nombre;
    private double dineroPropio;
    private static double dineroTotal = 0.0;

    public PlataformaCrow(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getDineroPropio(){
        return this.dineroPropio;
    }

    public void setDineroPropio(double dineroPropio){
        this.dineroPropio = dineroPropio;
    }

    public static double getDineroTotal(){
        return dineroTotal;
    }

    public static void setDineroTotal(double dineroTotal){
        PlataformaCrow.dineroTotal = dineroTotal;
    }

    public void asignarDinero(double cantidadDinero){
        dineroTotal -= cantidadDinero;
        this.dineroPropio = cantidadDinero;
    }

    public static void recogerDinero(double dinero){
        PlataformaCrow.dineroTotal += dinero;
    }

    //como es un metodo comun para todas las plataformas se pone en static
    public static void imprimirDineroTotal(){
        System.out.println("El dinero total del que se dispone es "+ dineroTotal);
    }
}