public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intPrimitivoObjeto = Integer.valueOf(intPrimitivo);

        Integer intObjeto = Integer.valueOf(32768);
        Integer intObjeto2 = 32768;

        int intObjetoPrimitivo = intObjeto;
        int intObjetoPrimitivo2 = intObjeto.intValue();

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);


    }
}
