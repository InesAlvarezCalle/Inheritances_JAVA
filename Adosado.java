class Adosado extends Casa{
    private int qCocheras;
    private boolean patio;

    public Adosado(int puertas, int ventanas, String color, int qCocheras, boolean patio){
        super(puertas, ventanas, color);
        this.qCocheras = qCocheras;
        this.patio = patio;
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

    @Override
    public void mostrarDatos(){
        System.out.println("El adosado tiene: \n" + this.getQpuertas() + " puertas.\n" + this.getQventanas() +
                " ventanas.\n" + this.getColor() + " color.\nTiene: " + this.qCocheras + " cocheras.\n¿Tiene patio? "
                + this.patio);
        System.out.println("Es un adosado\n");
    }

    @Override
    public String toString(){
        return "ADOSADO: Cant. puertas --> " + this.getQpuertas() + "\nCant. ventanas --> " + this.getQventanas() +
                "\nColor --> " + this.getColor() + "\nCocheras --> " + this.getqCocheras() + "\n¿Tiene patio? "
                + this.getPatio() + "\n";
    }
}