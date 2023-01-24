public class Automovil {


    private String fabricante;

    private String modelo;
    private String color = "gris";
    private double cilindrada;

    public Automovil() {

    }

    public Automovil(String fabricante, String modelo, String color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    private int capacidadTanque = 40;

    public String getFabricante() {
        return fabricante;
    }


    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String detalle() {
        String modelo = "otro";

        StringBuilder sb = new StringBuilder();

        sb.append("automovil.fabricante = " + this.fabricante);
        sb.append("\n automovil.modelo = " + this.modelo);
        sb.append(" \n automovil.color = " + this.color);
        sb.append("\n automovil.cilindrada = " + this.cilindrada);

        return sb.toString();
    }


    public String acelerar(int rpm) {


        return "El auto " + fabricante + "Acelerando a " + rpm + "rpm";

    }

    public String frenar() {
        return fabricante + " " + this.modelo + " Frenando ";

    }

    public String acelerarFrenar(int rpm) {

        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;


    }

    public float calcularConsumo(int km, float porcentajeBencina) {

        return km / (capacidadTanque * porcentajeBencina);


    }

    public float calcularConsumo(int km, int porcentajeBencina) {

        return km / (capacidadTanque * (porcentajeBencina / 100f));


    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }

        Automovil a = (Automovil) obj;

        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equalsIgnoreCase(a.getFabricante())
                && this.modelo.equalsIgnoreCase(a.getModelo()));


    }
}
