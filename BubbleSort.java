import java.util.*;

public class BubbleSort {
    public static void main(String a[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}