package classes;

public class MyClass implements Comparable<MyClass> {

    public static int COUNTER;
    private final int objNumber;

    public MyClass(int objNumber) {
        this.objNumber = objNumber;
        MyClass.COUNTER++;
    }

    @Override
    public String toString() {
        return String.format("Ich bin Objekt Nummer: %d", objNumber);
    }

    @Override
    public int compareTo(MyClass other) {
        return this.objNumber - other.objNumber;
    }
}
