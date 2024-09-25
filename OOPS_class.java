public class OOPS_class {
    void print()
    {
        System.out.println("Creating of a class");
    }
    int a=10,b=20;
    void object()
    {
        System.out.println(a+" "+b);
    }
}
class b{
    public static void main(String[] args) {
        OOPS_class ref=new OOPS_class();
        ref.print();
        ref.object();
    }
}
//Creation of a class,object and method
