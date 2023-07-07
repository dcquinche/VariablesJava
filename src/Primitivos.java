public class Primitivos {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte correspondiente en byte = " + Byte.BYTES);
        System.out.println("tipo byte correspondiente en bites = " + Byte.SIZE);
        System.out.println("valor máximo de un byte = " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte = " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short correspondiente en byte = " + Short.BYTES);
        System.out.println("tipo short correspondiente en bites = " + Short.SIZE);
        System.out.println("valor máximo de un short = " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short = " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int correspondiente en byte = " + Integer.BYTES);
        System.out.println("tipo int correspondiente en bites = " + Integer.SIZE);
        System.out.println("valor máximo de un int = " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int = " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long correspondiente en byte = " + Long.BYTES);
        System.out.println("tipo long correspondiente en bites = " + Long.SIZE);
        System.out.println("valor máximo de un long = " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long = " + Long.MIN_VALUE);

        var numeroVar = 128; // con var los números menores al máximo de int son tomados como int (no byte y short), en adelante si serían como long
    }
}
