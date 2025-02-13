class Adosado extends Casa{
    private int qCocheras;
    private boolean patio;

    public Adosado(int puertas, int ventanas, String color, int qCocheras, boolean patio){
        super(puertas, ventanas, color);
        this.qCocheras = qCocheras;
        this.patio = patio;
        System.out.println("Adosado inicializado");
    }

    public void setqCocheras(int x){
        this.qCocheras = x;
    }

    public int getqCocheras(){
        return qCocheras;
    }

    public void setPatio(boolean x){
        this.patio = x;
    }

    public boolean getPatio(){
        return patio;
    }
}