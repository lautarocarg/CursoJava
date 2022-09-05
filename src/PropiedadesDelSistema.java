import java.util.Properties;

public class PropiedadesDelSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
