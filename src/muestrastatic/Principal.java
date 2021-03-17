package muestrastatic;

public class Principal {

    public static void main(String[] args) {
        Auto a1 = new Auto("XYZ123", "Tiaf", 31230, "Azul"); // @A1B2C3
        Auto a2 = new Auto("XYZ234", "Dorf", 43145, "Rojo"); // @A2C3B4
        Auto a3 = new Auto("XYZ345", "Geupot", 63161, "Azul"); // @A3B4C5
        Auto a4 = new Auto("XYZ456", "Tiaf", 34136, "Verde"); // @A4B5C6

        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
        System.out.println(a4.precioPromocional());

        Auto.anularDescuento();
        System.out.println("");

        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
        System.out.println(a4.precioPromocional());

    }

}
