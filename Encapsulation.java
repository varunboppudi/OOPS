public class Encapsulation {
    //Wrapping the data members and member function of a class in a single unit is known as Encapsulation.
    private int val; //data hiding

    public void setVal(int val) {  //data Abstraction
        this.val = val;            // setting the value
    }

    public int getVal() {
        return val;                //returning the value
    }
}
class E{
    public static void main(String[] args) {
        Encapsulation r1=new Encapsulation();
        r1.setVal(100);
        System.out.println(r1.getVal());
    }
}
