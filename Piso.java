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
}