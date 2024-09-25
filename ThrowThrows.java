public class ThrowThrows {
    int age=10;
    void m1() throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException(); //or Exception also we can write
        } else {
            System.out.println("Age is valid");
        }
    }
}
class TH1{
    public static void main(String[] args) {
        ThrowThrows r1=new ThrowThrows();

        try {
            r1.m1();
        }
        catch (Exception e)
        {
            System.out.println("Under Age");
        }
    }
}
