public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(3, 5, "Rosa");
        Casa casa2 = new Casa(4);
        Adosado adosado1 = new Adosado(2, 4, "Gris", 1, false);
        Piso piso1 = new Piso(5, 7, "Blanco", 2, 2);
        Chalet chalet1= new Chalet(4, 40, "Azul", 18, "Blanco", 15);
        Chalet chalet2= new Chalet(5, 50);

        casa1.mostrarDatos();
        casa2.mostrarDatos();
        System.out.println(casa1);

    }
}