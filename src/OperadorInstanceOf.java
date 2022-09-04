public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Un objeto de la clase String";

        Integer num = 7;
        
        boolean b1 = texto instanceof String;
        System.out.println("b1 = " + b1);
    }
}
