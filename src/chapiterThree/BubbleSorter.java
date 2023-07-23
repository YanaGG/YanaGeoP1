package chapiterThree;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {

        int[] myArr = {4, 3, 7, 5, 9, 1};
        System.out.print(Arrays.toString(myArr) + " => ");
        BubbleSort(myArr);
        System.out.println(Arrays.toString(myArr));

        int[] myArr2 = {9, 18, 4, 3, 19, 34};
        System.out.print(Arrays.toString(myArr2) + " => ");
        SelectionSort(myArr2);
        System.out.println(Arrays.toString(myArr2));
        System.out.println("Hello " + Arrays.toString(myArr2));
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void SelectionSort (int [] arr)
    {
        for ( int i = 0; i < arr.length; i++)
        {
            int position = i;
            int min = arr [i];
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr [j] < min)
                {
                    position = j;
                    min = arr[j];
                }
            }
            arr [position] = arr [i];
            arr [i] = min;
        }
    }
}


