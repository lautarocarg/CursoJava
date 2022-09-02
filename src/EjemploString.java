public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String cursoObjeto = new String("Programación Java");

        String cursoCase = "Programación Java";
        String cursoObjetoCase = new String("Programación Java");
        
        //Comparando la referencia en memoria
        boolean esIgual = curso == cursoObjeto;
        System.out.println("esIgual = " + esIgual);
        
        //Comparando el valor de los objetos
        boolean correctoEsIgual = curso.equals(cursoObjeto);
        System.out.println("correctoEsIgual = " + correctoEsIgual);
        
        int compareToString = curso.compareTo(cursoObjeto);
        System.out.println("compareToString = " + compareToString);
        if (compareToString == 0){
            System.out.println("0 Cuando son iguales");
        }

        boolean ignorarCase = cursoCase.equalsIgnoreCase(cursoObjetoCase);
        System.out.println("ignorarCase = " + ignorarCase);

        //No crea una nueva instancia cuando los creamos así
        String cursoLiteral = "Programación Java";
        String cursoLiteral2 = "Programación Java";
        boolean litral = cursoLiteral == cursoLiteral2;
        System.out.println("litral = " + litral);
        
    }
}
