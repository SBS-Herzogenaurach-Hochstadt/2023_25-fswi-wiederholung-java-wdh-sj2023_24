import classes.MyClass;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    MyClass[] classArray = new MyClass[100];
    List<MyClass> classList = new ArrayList<>();

    for(int i = 0; i < classArray.length; i++) {
      MyClass bufClass = new MyClass("Ich bin Objekt Nummer: " + (i + 1));
      classArray[i] = bufClass;
      classList.add(bufClass);
    }

    System.out.println(classArray[49]);
    System.out.println(MyClass.COUNTER);

    System.out.println(classList.get(49));
    System.out.println(MyClass.COUNTER);
  }
}
