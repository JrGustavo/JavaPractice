public class PrimitivosFloat {

    static  float varFlotante;

    public static void main(String[] args){


        float realFloat = 0.0000000015f; //1.5e-10f
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en byte a = " + Float.SIZE);
        System.out.println("float corresponde en byte a = " + Float.MAX_VALUE);
        System.out.println("float corresponde en byte a = " + Float.MIN_VALUE);

        double realdouble = 3.4028235E38d;
        System.out.println("realdouble = " + realdouble);

        System.out.println("realFloat = " + realFloat);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en byte a = " + Double.SIZE);
        System.out.println("double corresponde en byte a = " + Double.MAX_VALUE);
        System.out.println("double corresponde en byte a = " + Double.MIN_VALUE);


       // var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
