import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
      invertArrays();
      fillArray();
      muiltTwo();
      bigArray();
      System.out.println(Arrays.toString(create(10,78)));
      minMax();
    }

    public static void invertArrays() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

     public static void fillArray() {
         int[] arr2 = new int[100];
         for (int i = 0; i < arr2.length; i++) {
             arr2[i] = i + 1;
             System.out.println(arr2[i]);
         }
     }

    private static void muiltTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
               arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void bigArray() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
               arr[i][j] = i+j;
               if (arr[i] == arr[j]){
                   arr[i][j]=1;
               }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    private static int[] create(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i< arr.length;i++) {
            arr[i] = initialValue;
        }
 return arr;

    }
private static void minMax() {
   int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
   int maximum=arr[0];
   int minimum=arr[0];
   for (int i = 1; i < arr.length; i++) {
        if (maximum < arr[i]) {
            maximum = arr[i];
        }
    }
   for (int j = 1; j < arr.length; j++) {
        if (minimum>arr[j]) {
            minimum = arr[j];
            }
    }
    System.out.println("Максимальное значение = " + maximum);
    System.out.println("Минимальное значение =  " + minimum);
}
       }


