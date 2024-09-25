public class ExceptionHandiling {
    int a=10,b=0,c;
    void m1()
    {
        c=a/b;
        System.out.println(c);
    }
    void m2()
    {

        System.out.println("Canot divide integer by 0");
    }
    void m3()
    {
        System.out.println("It executes any in way");
    }
}
class E1{
    public static void main(String[] args) {
        ExceptionHandiling r1=new ExceptionHandiling();
        try {
            r1.m1();
        }
        catch (ArithmeticException e) //we can write Exception to there will be no change
        {
            r1.m2();
        }
        finally {
            r1.m3();
        }
    }
}
