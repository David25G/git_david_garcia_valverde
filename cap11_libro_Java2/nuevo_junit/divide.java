package nuevo_junit;


public class divide {
    private int num1, num2;

    public divide(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int divide0() {
        if(num2 == 0)
        throw new java.lang.ArithmeticException("División por 0");
        else {
            int resul = num1 / num2;
            return resul;
        }

    }
}
