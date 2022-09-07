import java.io.IOException;

public class EjecutarProgramasSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                proceso = rt.exec("notepad");
            }else if(System.getProperty("os.name").startsWith("Mac")){
                proceso = rt.exec("notepad");
            }
            else{
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e) {
            System.out.println("Comando desconocido");
            e.printStackTrace();
        }
    }
}

