public class primitivos {
    public static void main(String[] args) {

        byte numeroByte = 7; //-127 y 127
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte a " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte a " + Byte.MIN_VALUE);

        impimir("-", 100, true);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en bites a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un byte a " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un byte a " + Short.MIN_VALUE);

        impimir("-", 100, true);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un byte a " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un byte a " + Integer.MIN_VALUE);

        impimir("-", 100, true);

        long numeroLong = 327680424465465L;
        System.out.println("numeroInt = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de un byte a " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un byte a " + Long.MIN_VALUE);

        System.out.println();

        impimir("*", 100, true);
        impimir(" ", 40, false);
        System.out.println("Valores decimales");
        impimir("*", 100, true);

        System.out.println();

        float realFloat = 2.12e3f;
        System.out.println("numeroInt = " + realFloat);
        System.out.println("Tipo long corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Float.SIZE);
        System.out.println("Valor maximo de un byte a " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un byte a " + Float.MIN_VALUE);

        impimir("-", 100, true);

        double numeroDouble = 327680424465465e15d;
        System.out.println("numeroInt = " + numeroDouble);
        System.out.println("Tipo long corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Double.SIZE);
        System.out.println("Valor maximo de un byte a " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un byte a " + Double.MIN_VALUE);



    }

    public static void impimir(String valor, int cantidad, boolean espaciado){
        for (int i = 0; i < cantidad; i++) {
            System.out.print(valor);
        }
        if(espaciado){
            System.out.println();
        }
    }
}
