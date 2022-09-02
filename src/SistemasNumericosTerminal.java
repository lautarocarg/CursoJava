import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        }
        catch (InputMismatchException e){
            System.out.println("Debe ser un numero" + "\nExepcion: " + e.toString());
            main(args);
            System.exit(0);
        }


        String mensaje = "Numero binario de " + numeroDecimal + "= " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNumero octal de " + numeroDecimal + "= " + Integer.toOctalString(numeroDecimal);
        mensaje+= "\nNumero hexadecimal de " + numeroDecimal + "= " + Integer.toHexString(numeroDecimal);
        System.out.println(mensaje);
    }
}
