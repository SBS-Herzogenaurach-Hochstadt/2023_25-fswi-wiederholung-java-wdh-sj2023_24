package classes;

public class MyClass {

    public static int COUNTER;
    private final int objNumber;

    public MyClass(int objNumber) {
        this.objNumber = objNumber;
        MyClass.COUNTER++;
    }
}
