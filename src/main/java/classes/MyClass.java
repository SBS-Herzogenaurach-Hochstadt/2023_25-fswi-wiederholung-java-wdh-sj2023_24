package classes;

public class MyClass implements Comparable<MyClass> {

    public static int COUNTER;
    private final int objNumber;

    public MyClass(int objNumber) {
        this.objNumber = objNumber;
        MyClass.COUNTER++;
    }

    // nötig für Entscheidung gerade oder ungerade
    public int getObjNumber() {
        return objNumber;
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
