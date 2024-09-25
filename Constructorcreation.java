public class Constructorcreation {
    //default constructor
    int a;String b;
    Constructorcreation()
    {
        a=10;b="Varun";
    }
    Constructorcreation(int x)
    {
        a=x;
    }
    Constructorcreation(int x,String y)
    {
        a=x;
        b=y;
    }

}
class B{
    public static void main(String[] args) {
        Constructorcreation obj=new Constructorcreation();
        Constructorcreation r1=new Constructorcreation(10);
        Constructorcreation r2=new Constructorcreation(10,"Usha");
        System.out.print(obj.a+" "+obj.b);
        System.out.print(r1.a);
        System.out.print(r2.a+" "+r2.b);

    }
}
//Consructor in java
