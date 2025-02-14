class Chalet extends Casa {
    private int mjardin;
    private String colorValla;
    private double mantener;

    public Chalet(int puertas, int ventanas, String color, int mj, String cv, double mant){
        super(puertas, ventanas, color);
        this.mjardin = mj;
        this.colorValla = cv;
        this.mantener = mant;
    }

    public Chalet(int puertas, int mj){
        super(puertas);
        this.mjardin = mj;
    }

    public void aumentaMantener(){
        this.mantener *= 1.02;
    }

    public void setMjardin(int x){
        this.mjardin = x;
    }

    public int getMjardin(){
        return mjardin;
    }

    public void setColorValla(String x){
        this.colorValla = x;
    }

    public String getColorValla(){
        return colorValla;
    }

    public void setMantener(double x){
        this.mantener = x;
    }

    public double getMantener(){
        return mantener;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("El adosado tiene: \n" + this.getQpuertas() + " puertas.\n" + this.getQventanas() +
                " ventanas.\n" + this.getColor() + " color.\nTiene: " + this.mjardin + " metros de jardín.\nColor valla: "
                + this.colorValla + ".\nMantenimiento: " + this.mantener);
        System.out.println("Es un chalet\n");
    }

    @Override
    public String toString(){
        return "CHALET: Cant. puertas --> " + this.getQpuertas() + "\nCant. ventanas --> " + this.getQventanas() +
                "\nColor --> " + this.getColor() + "\nMentros jardín --> " + this.getMjardin() + "\nColor valla --> "
                + this.getColorValla() + "\n";
    }

    public void pintar(String colorCasa, String colorValla){
        super.pintar(colorCasa);
        this.colorValla = colorValla;
    }
}