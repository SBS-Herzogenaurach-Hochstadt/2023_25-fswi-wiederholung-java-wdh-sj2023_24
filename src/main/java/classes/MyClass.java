package classes;

public class MyClass {

  public static int COUNTER;
  private String message;

  public MyClass(String message) {
    this.message = message;
	MyClass.COUNTER++;
  }

  @Override
  public String toString() {
    return message;
  }
}
