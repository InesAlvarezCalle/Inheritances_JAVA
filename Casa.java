class Casa {
    private int qpuertas, qventanas;
    private String color;

    Casa(){
        qpuertas = 0;
        qventanas = 0;
        color = "";
    }

    Casa(int qp, int qf, String col){
        this.qpuertas = qp;
        this.qventanas = qf;
        this.color = col;
        System.out.println("Casa inicializada");
    }

    public Casa(int qp){
        this.qpuertas = qp;
    }

    public void setQpuertas(int x){
        this.qpuertas = x;
    }

    public int getQpuertas(){
        return qpuertas;
    }

    public void setQventanas(int x){
        this.qventanas = x;
    }

    public int getQventanas(){
        return qventanas;
    }

    public void setColor(String x){
        this.color = x;
    }

    public String getColor(){
        return color;
    }

    public void mostrarDatos() {
        System.out.println("NºPuertas: " + this.qpuertas);
        if (this.qventanas <= 0) {
            System.out.println("NºVentanas: N/A");
        } else {
            System.out.println("NºVentanas: " + this.qventanas);
        }

        if (this.color == null) {
            System.out.println("Color: N/A");
        } else {
            System.out.println("Color: " + this.color);
        }
        System.out.println();
    }

    public String toString() {
        return "NªPuertas " + this.qpuertas;
    }
}