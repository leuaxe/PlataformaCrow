package montoEnBilletes;

public class Cajero{
    public static void main(String[] args) {
        int dinero = 3456;
        int resultado;
        resultado = (dinero/500);
        if (resultado > 0) {
            dinero -= (resultado * 500);
            System.out.println("Billetes de 500 son " + resultado);
        }
        resultado = (dinero/100);
        if (resultado > 0) {
            dinero -= (resultado * 100);
            System.out.println("Billetes de 100 son " + resultado);
        }
        resultado = (dinero/50);
        if (resultado > 0) {
            dinero -= (resultado * 50);
            System.out.println("Biletes de 50 son " + resultado);
        }
        resultado = (dinero/20);
        if (resultado > 0) {
            dinero -= (resultado * 20);
            System.out.println("Billetes de 20 son " + resultado);
        }
        resultado = (dinero/10);
        if (resultado > 0) {
            dinero -= (resultado * 10);
            System.out.println("Billetes de 10 son " + resultado);
        }
        resultado = (dinero/5);
        if (resultado > 0) {
            dinero -= (resultado * 5);
            System.out.println("Monedas de 5 son " + resultado);
        }
        resultado = (dinero/1);
        System.out.println("Moneas de 1 son " + resultado);
    }
}