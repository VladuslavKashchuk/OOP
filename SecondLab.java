import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
class SecondLab {
  public static void main(String args[])
  {
    int[] arr = {5, 6, 44, 7, 0, 10, 47};

    shuffleArray(arr);
    for (int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void shuffleArray(int[] ar)
  {
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i+1);
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
}
