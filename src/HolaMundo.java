public class HolaMundo {
    public static void main(String[] args){
        String saludar = "Hola Mundo desde Java, Soy Diana Carolina";
        System.out.println(saludar.toUpperCase());

        // VARIABLES
        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero2 = 5;
        System.out.println("numero2 antes del if = " + numero2);
        if(valor){
            System.out.println("numero dentro de if = " + numero);
            numero2 = 11;
        }
        System.out.println("numero2 después del if = " + numero2);

        var numero3 = "15"; // var es flexible y toma el tipo dependiendo del valor que se le dé

        String nombre;
        nombre = "Paola";
        if(numero > 8){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);

    }
}
