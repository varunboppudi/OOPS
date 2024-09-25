public abstract class AbstractMethod {
    public abstract void Vehecle();
    public abstract void Rank();

}
abstract class A1 extends AbstractMethod{
    public void Vehecle()
    {
        System.out.println("It is Car");
    }
    public void Rank()
    {
        System.out.println("2nd Rank");
    }

}
class A2 extends A1{
    public void Rank()
    {
        System.out.println("3rd Rank");
    }
    public void Vehecle()
    {
        System.out.println("It is a BIke");
    }
}
class t{
    public static void main(String[] args) {
        A2 r1=new A2();

        r1.Vehecle();
        r1.Rank();
    }
}
