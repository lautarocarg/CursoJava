public class EjemploStringConcatenación {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Ni idea quien es";

        String detalle = curso + " con el profesor: " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        //Concatena numeros
        System.out.println(detalle + " " + numeroA + numeroB );
        //Concatena la suma
        System.out.println(detalle + " " + (numeroA + numeroB) );
        //Suma y concatena el detalle
        System.out.println(numeroA + numeroB + detalle );

        String detalle2 = curso.concat(profesor).concat(" ");
        System.out.println(detalle2);



    }
}
