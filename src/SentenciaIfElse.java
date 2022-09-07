public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 5.8f;
        if (promedio >= 6.5){
            System.out.println("Excelente");
        }
        else if(promedio >= 6){
            System.out.println("Casi");
        }
        else if (promedio >= 5.5){
            System.out.println("Regular");
        }
        else{
            System.out.println("Insuficiente");
        }
    }
}
