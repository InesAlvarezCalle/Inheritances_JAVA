public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(3, 5, "Rosa");
        Casa casa2 = new Casa(4);
        Adosado adosado1 = new Adosado(2, 4, "Gris", 1, false);
        Piso piso1 = new Piso(5, 7, "Blanco", 2, 2);
        Chalet chalet1= new Chalet(4, 40, "Azul", 18, "Blanco", 15);
        Chalet chalet2= new Chalet(5, 10, "Morado", 10, "Rojo", 5 );

        System.out.println("MOSTRAR DATOS");
        casa1.mostrarDatos();
        casa2.mostrarDatos();
        adosado1.mostrarDatos();
        piso1.mostrarDatos();
        chalet1.mostrarDatos();
        chalet2.mostrarDatos();

        System.out.println("IMPRIMIR DATOS");
        System.out.println("Casa 1: " + casa1);
        System.out.println("Casa 2: " + casa2);
        System.out.println("Adosado 1: " + adosado1);
        System.out.println("Piso 1: " + piso1);
        System.out.println("Chalet 1: " + chalet1);
        System.out.println("Chalet 2: " + chalet2);

        /*Pintamos y aumentamos mantenimiento de un adosado y un chalet*/

        adosado1.pintar("Verde");
        chalet1.pintar("Blanco", "Azul");
        chalet2.aumentaMantener();

        System.out.println(adosado1);
        System.out.println(chalet1);
        System.out.println(chalet2);
    }
}