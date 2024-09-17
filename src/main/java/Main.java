import classes.MyClass;

import java.util.Arrays;
import java.util.Random;

public class Main {

  public static void main(String[] args) {

    MyClass[] myclassArray = new MyClass[100];

    for (int i = 0; i < myclassArray.length; i++) {
      myclassArray[i] = new MyClass(new Random().nextInt(1000) + 1);
    }

    System.out.println(Arrays.deepToString(myclassArray));
    Arrays.sort(myclassArray);
    System.out.println(Arrays.deepToString(myclassArray));

    int counter = 0;
    for (int i = 0; i < myclassArray.length; i++) {
      if (myclassArray[i].getObjNumber() % 2 == 0) {
        counter++;
      }
    }

    MyClass[] geradeObjNummer = new MyClass[counter];

    counter = 0;
    for (int i = 0; i < myclassArray.length; i++) {
      if (myclassArray[i].getObjNumber() % 2 == 0) {
        geradeObjNummer[counter++] = myclassArray[i];
      }
    }
    System.out.println(Arrays.deepToString(geradeObjNummer));
  }
}
