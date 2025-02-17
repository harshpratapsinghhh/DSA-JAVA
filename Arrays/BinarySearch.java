
package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = z.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Integer's value at [" + i + "] : ");
            arr[i] = z.nextInt();
        }
        System.out.print("Enter the Key: ");
        int key = z.nextInt();
        int search = binarySearch(arr,key);

        if (search==-1)
            System.out.print("Key not Found!");
        else
            System.out.print("Key Found at index arr["+search+"]");
    }
    public static int binarySearch(int [] array,int key){
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid])
                high = mid - 1;
            else if (key == array[mid])
            return mid;
            else
            low = mid + 1;
        }
        return -1;
    }
}
