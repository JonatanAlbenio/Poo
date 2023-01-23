public class EjemploAutomovil {
    public static void main(String[] args) {


        Automovil subaru = new Automovil();
        subaru.fabricante="subaru";
        subaru.modelo="Impreza";
        subaru.cilindrada=2.1;

        Automovil mazda = new Automovil();
        mazda.cilindrada=3.1;
        mazda.fabricante="Mazada";
        mazda.modelo="BT-90";
        mazda.color="Rojo";


        System.out.println(" = " + subaru.detalle());

        System.out.println(" = " + mazda.detalle());

    }
}
