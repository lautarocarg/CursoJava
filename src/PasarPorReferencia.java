public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {11, 12, 25};
        System.out.println("Inicionamos");
        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " +edad[i]);
        }
        test(edad);

        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " +edad[i]);
        }
        System.out.println("Finaliza main");
    }
    public static void test(int[] edad){
        for(int i = 0; i < edad.length; i++){
            edad[i] += 20;
        }

    }
}
