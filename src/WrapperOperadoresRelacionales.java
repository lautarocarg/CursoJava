public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = 1000;
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeot? " + ((num1 == num2)? " Lo son": "No lo son"));

        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeot? " + ((num1 == num2)? " Lo son": "No lo son"));
        System.out.println("Son el mismo objeot? " + ((num1.equals(num2))? " Lo son": "No lo son"));
        System.out.println("Son el mismo objeot? " + ((num1.intValue() == num2.intValue())? " Lo son": "No lo son"));


    }
}
