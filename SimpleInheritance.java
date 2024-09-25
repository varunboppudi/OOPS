public class SimpleInheritance {
    String name;
    int roll,marks;
    void ask()
    {
        System.out.println("get ur name roll and marks");
    }

}
class C extends SimpleInheritance{

    void display()
    {
        name="varun";
        roll=1104;marks=100;

        System.out.println(name+" "+roll+" "+marks);
    }

    public static void main(String[] args) {
        C obj=new C();
        obj.ask();
        obj.display();
    }
}
