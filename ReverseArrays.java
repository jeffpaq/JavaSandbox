import java.util.Arrays;

public class ReverseArrays {

  public static int[] RevIntArray(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    return arr;
  }

  /* Print array using loop, with comma as separator */
  public static void PrintIntArrayLoop(int[] intArray) {
    for (int i = 0; i < intArray.length; i++) {
      if (i == intArray.length - 1) {
        System.out.print(intArray[i]);
      } else if (i < intArray.length) {
        System.out.print(intArray[i] + ",");
      }
    }
  }

  /* Print array using Java Arrays API */
  public static void PrintIntArray(int[] intArray) {
    System.out.println(Arrays.toString(intArray));
  }

  public static void main(String[] args) {
    int intArray[] = { 2, 9, 15, 60, 3, 28, 7, 31, -4 };
    System.out.print("Array (orig): ");
    PrintIntArrayLoop(intArray);
    RevIntArray(intArray);
    System.out.print("\nArray (reversed): ");
    PrintIntArrayLoop(intArray);

  }
}