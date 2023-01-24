import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {


        Automovil subaru = new Automovil("subaru","Impreza");



        Automovil mazda = new Automovil("Manzda","Kia","rojo",3.0);

        Automovil nissan = new Automovil("nissan","Navvarra","gris oscuro",3.4,50);

        Automovil nissan2 = new Automovil("nissan","Navvarra","gris oscuro",3.4,50);

        Automovil auto = new Automovil();

        Date fecha = new Date();

        System.out.println(nissan);

        System.out.println(auto.equals(fecha));

        System.out.println(auto.equals(nissan2));

        System.out.println(nissan==nissan2);

        System.out.println(nissan.equals(nissan2));


        System.out.println(" = " + subaru.detalle());

        System.out.println(" = " + mazda.detalle());
        System.out.println("nissan.detalle() = " + nissan.detalle());
        System.out.println(" = " + subaru.acelerar(200));

        System.out.println("subaru.frenar() = " + subaru.frenar());
        System.out.println("mazda.acelerarFrenar() = " + mazda.acelerarFrenar(123));

        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300,0.6f));
        System.out.println("Kilometros por litro nidsas " + nissan.calcularConsumo(300,60));


    }
}
