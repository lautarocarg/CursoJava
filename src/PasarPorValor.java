public class PasarPorValor {
    public static void main(String[] args) {

        Integer i = 1000;
        System.out.println("Inicionamos i con este valor = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor i = " + i);
    }
    public static void test(int i){
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza con i = " + i);
    }
}
