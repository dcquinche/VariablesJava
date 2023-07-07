public class PrimitivosFlotantes {
    public static void main(String[] args) {
        // la e es exponencial, sirve para mover la coma, número positivo hacia la derecha y negativo hacia la izquierda
        float realFloat = 1.5e6F; // es igual pero de forma más sencilla que escribir 1500000.0
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float correspondiente en byte = " + Float.BYTES);
        System.out.println("tipo float correspondiente en bites = " + Float.SIZE);
        System.out.println("valor máximo de un float = " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un float = " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308; // se le puede poner la D pero no es necesario
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double correspondiente en byte = " + Double.BYTES);
        System.out.println("tipo double correspondiente en bites = " + Double.SIZE);
        System.out.println("valor máximo de un double = " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un double = " + Double.MIN_VALUE);

        var decimalVar = 3.1416;
        System.out.println("decimalVar = " + decimalVar); // con var los números menores al máximo de double son tomados como double no como float sino se le pone la F.
    }
}
