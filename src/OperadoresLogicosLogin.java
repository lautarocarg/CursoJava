import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "lautaro";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "contra";

        String[] usernames2 = {"lautaro", "pepe", "admin"};
        String[] passwords2 = {"12345","12345","12345"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String u = scanner.next();

        System.out.print("Ingrese la password: ");
        String p = scanner.next();

        for(int i = 0; i<usernames.length; i++){
            if(usernames[i].equals(u) && passwords[i].equals(p)){
                System.out.println("Autenticado");
                System.out.println("Bienvenido usuario ".concat(usernames[i]).concat("!"));
                break;
            }
            else{
                System.out.println("Usuario o contraseña incorrecta");
                main(args);
                break;
            }
        }



    }
}
