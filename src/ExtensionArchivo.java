public class ExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.pdf";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo= " + archivo.substring( i + 1 ));

    }
}
