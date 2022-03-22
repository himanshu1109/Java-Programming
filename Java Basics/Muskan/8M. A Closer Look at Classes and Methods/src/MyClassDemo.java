class MyClass
{
    private static int count = 0;
    private int x;

    public MyClass(int i)
    {
        x = i;
    }
    public void incrementCount()
    {
        count++;
    }

    public void printX()
    {
        System.out.println("Value of x : "  + x);
    }

    public static void printCount()
    {
        System.out.println("Value of count : "  + count);
    }
}

public class MyClassDemo
{
    public static void main(String[] args)
    {
        MyClass myObject1 = new MyClass(5);
        MyClass myObject2 = new MyClass(7);
        myObject1.printX();
        myObject1.incrementCount();
//        try {
//            MyClass.incrementCount();
//        }
//        catch(Exception E){
//            System.out.println("ERROR!!!");
//        }
        myObject1.printCount();
        myObject2.printCount();
        myObject2.printX();
//        try {
//            myObject1.setX(14);
//        }
//        catch(Exception E){
//            System.out.println("ERROR!!!");
//        }
        myObject1.incrementCount();
        myObject1.printX();
        myObject1.printCount();
        myObject2.printCount();
    }
}