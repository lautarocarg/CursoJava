import javax.swing.plaf.synth.SynthTextAreaUI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Ingrese una fecha con formato 'yyyy-MM-dd': ");

        try {
            Date fecha = format.parse(s.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2");
            }
            else if(fecha.before(fecha2)){
                System.out.println("Fecha2 anterior a fecha");
            }
            else if(fecha.equals(fecha2)){
                System.out.println("La misma fecha");
            }

            if (fecha.compareTo(fecha2)> 0){
                System.out.println("Fecha del usuario es despues que fecha2");
            }
            else if (fecha.compareTo(fecha2)< 0){
                System.out.println("Fecha2 anterior a fecha");
            }
            else{
                System.out.println("La misma fecha");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
