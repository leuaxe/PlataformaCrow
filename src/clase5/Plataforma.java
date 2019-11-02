package clase5;

public class Plataforma{
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Juan", 300.0);
        Usuario u2 = new Usuario("Antonio", 150.0);
        Usuario u3 = new Usuario("Pepe", 500.0);

        Usuario.imprimirNumUsuarios();
        System.out.println("El usuario 2 tiene el id " + u2.getIdUsuario());
        System.out.println("El usuario 3 tiene el id " + u3.getIdUsuario());

        PlataformaCrow p1 = new PlataformaCrow("Save the Whales");
        PlataformaCrow p2 = new PlataformaCrow("Save the Sun");

        u1.donarTodoDinero();
        u2.donarTodoDinero();
        u3.donarTodoDinero();

        PlataformaCrow.imprimirDineroTotal();

        p1.asignarDinero(500.0);
        p2.asignarDinero(200.0);

        PlataformaCrow.imprimirDineroTotal();

        //me quede en el minuto 21 de clase 2
    }
}