public class Superkeyword {
    int a=10;
    void print()
    {
        System.out.print("hii this is same method");
    }
    Superkeyword(){
        System.out.println("This is non parametarized constructor");
    }
    Superkeyword(int v)
    {
        System.out.println(v);
    }

}
class s1 extends Superkeyword{
    int a=20;
    void print()
    {
        System.out.println(a);
        System.out.println(super.a);
        super.print();
    }
    s1()
    {
        //default there is a super constructor super()

        super(100);//if constrctor is parameterized

        System.out.println("This is a constructor");
    }
}
class s2{
    public static void main(String[] args) {
        s1 r1=new s1();
        r1.print();
    }
}
