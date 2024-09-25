public class thiskeyword {
    thiskeyword()
    {
        System.out.println("This is default cons");
    }
    int a;
    thiskeyword(int a)
    {
        this(); //this called deafault constructor
        a=a; //this prints 0 because int default value
        this.a=a; //this prints 100
    }
    void show()
    {

        System.out.println(a);
    }
}
class t1{
    public static void main(String[] args) {
        thiskeyword r1=new thiskeyword(100);
        r1.show();
    }
}
