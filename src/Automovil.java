public class Automovil {


    String fabricante;

    String modelo;
    String color="gris";
    double cilindrada;


    public  String  detalle(){
        String modelo ="otro";

        StringBuilder sb = new StringBuilder();

        sb.append("automovil.fabricante = " + this.fabricante);
        sb.append("\n automovil.modelo = " + this.modelo);
        sb.append(" \n automovil.color = " + this.color);
        sb.append( "\n automovil.cilindrada = " + this.cilindrada);

        return sb.toString();
    }









}
