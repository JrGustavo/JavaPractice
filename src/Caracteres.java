public class Caracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;

        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal =  + caracter" + (decimal == caracter));


        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo =  + caracter: " + (simbolo == caracter));

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en byte = " + Character.SIZE);
        System.out.println("char corresponde en byte = " + Character.MIN_VALUE);
        System.out.println("char corresponde en byte = " + Character.MAX_VALUE);


    }


}
