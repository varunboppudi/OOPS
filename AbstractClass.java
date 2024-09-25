public abstract class AbstractClass {
    //The class which contains abstract key word it is abstract class
    //When class contains partial implementation then we should declare abstract class
    AbstractClass()
    {
        System.out.println("All animals are ....");
    }
    public abstract void sound();

}
class Dog extends AbstractClass{
    Dog()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Dog is Barking");
    }
}
class Lion extends AbstractClass{
    Lion()
    {
        super();
    }
   public void sound()
    {
        System.out.println("Lion is Roaring");
    }
}
class Test{
    public static void main(String[] args) {
        Dog r1=new Dog();
        Lion r2=new Lion();
        r1.sound();
        r2.sound();
    }
}
