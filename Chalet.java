class Chalet extends Casa {
    private int mjardin;
    private String colorValla;
    private double mantener;

    public Chalet(int puertas, int ventanas, String color, int mj, String cv, double mant){
        super(puertas, ventanas, color);
        this.mjardin = mj;
        this.colorValla = cv;
        this.mantener = mant;
        System.out.println("Chalet inicializado");
    }

    public Chalet(int puertas, int mj){
        super(puertas);
        this.mjardin = mj;
    }

    public void aumentaMantener(){
        this.mantener *= 0.02;
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
}