public class Overloading {
    //same method name having different parameters is know as method overloading
    void add()
    {
        int a=10,b=20;
        int c=a+b;
        System.out.println(c);
    }
    void add(int x,int y)
    {
        int c=x+y;
        System.out.println(c);
    }
    void add(int x,double y)
    {
        double c=x+y;
        System.out.println(c);
    }
}
class O{
    public static void main(String[] args) {
        Overloading r1=new Overloading();
        r1.add();
        r1.add(100,200);
        r1.add(50,30.25);
    }
}
