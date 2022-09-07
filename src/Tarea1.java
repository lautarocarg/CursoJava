import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        System.out.println("Ingrese tres nombres: ");
        System.out.println("Nombre 1: ");
        String nombre1 = sacnner.nextLine();

        String nombre1pro = nombre1.charAt(1)+ "." + nombre1.substring(nombre1.length()-2);
        System.out.println("Nombre 2: ");
        String nombre2 = sacnner.nextLine();
        String nombre2pro = nombre2.charAt(1) + "." + nombre2.substring(nombre2.length()-2);
        System.out.println("Nombre 3: ");
        String nombre3 = sacnner.nextLine();
        String nombre3pro = nombre3.charAt(1) + "." + nombre3.substring(nombre3.length()-2);
        StringBuilder nombresProce = new StringBuilder(nombre1pro);
        nombresProce.append("_" + nombre2pro).append("_" + nombre3pro);
        System.out.println("nombresProce = " + nombresProce);
    }
}
