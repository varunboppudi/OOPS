import java.util.Scanner;

interface InterfaceOOps {
    public void Input();
    public void Output();
}
class I1 implements InterfaceOOps{

    String name;
    int age;
    public void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        name = sc.next();
        System.out.println("Enter Age");
        age =sc.nextInt();
    }
    public void Output() {
        System.out.println(name + " " + age);
    }
}
class I2{
    public static void main(String[] args) {
        InterfaceOOps r1=new I1();
        r1.Input();
        r1.Output();
    }
}
