import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
class Main {
  public static void main(String[] args) {
    int[] array = {1, 1, 1, 2, 5, 5, 6, 7};
    System.out.println(uniqueCount(array));
}
static int uniqueCount(int[] array) {
    int result = 0;
    int countUnique = 0;
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        countUnique++;
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] == array[i]) {
                count++;
                break;
            }
        }
    }
    return result = countUnique - count;
  }
}
