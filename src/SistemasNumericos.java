import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ser un número" + "\nExepcion: " + e.toString() );
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de " + numeroDecimal + "= " + Integer.toBinaryString(numeroDecimal));

        String mensaje = "Numero binario de " + numeroDecimal + "= " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNumero octal de " + numeroDecimal + "= " + Integer.toOctalString(numeroDecimal);
        mensaje+= "\nNumero hexadecimal de " + numeroDecimal + "= " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
