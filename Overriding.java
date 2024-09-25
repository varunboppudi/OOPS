public class Overriding {
    //having same method name with same parameters in different class is known as overriding
    void shape()
    {
        System.out.println("Cant find the shape");
    }
}
class O1 extends Overriding{
    @Override
    void shape() {
        super.shape();
        System.out.println("Square shape");
    }
}
class print{
    public static void main(String[] args) {
        O1 r1=new O1(); //Overriding r1=new O1();

        r1.shape();
    }
}
