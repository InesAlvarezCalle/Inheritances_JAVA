class Piso extends Casa{
    private int nplanta, nbalcones;

    public Piso(int puertas, int ventanas, String color, int np, int nb){
        super(puertas, ventanas, color);
        this.nplanta = np;
        this.nbalcones = nb;
    }

    public void setNplanta(int x){
        this.nplanta = x;
    }

    public int getNplanta(){
        return nplanta;
    }

    public void setNbalcones(int x){
        this.nbalcones = x;
    }

    public int getNbalcones(){
        return nbalcones;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("El piso tiene: \n" + this.getQpuertas() + " puertas.\n" + this.getQventanas() +
                " ventanas.\n" + this.getColor() + " color." + this.nplanta + " planta.\n" + this.nbalcones +
                " num. balcones.");
        System.out.println("Es un piso\n");
    }

    @Override
    public String toString(){
        return "PISO --> " + super.toString() + ". Número Planta --> " + this.nplanta +
                ". Número balcones --> " + this.nbalcones + "\n";
    }
}