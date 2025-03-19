// This code will give element in array which are greater & smaller than average of all elements in arrays.
package Arrays;

import java.util.Scanner;

public class AvgSizeArray {
    public static void main(String[] args) {
        int sum=0,average,count=0,n,value=0;
        Scanner z = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        n = z.nextInt();
        int [] arr = new int[n];
        for (int i = 0;i<n;i++){
            System.out.print("Enter Integer's value at ["+i+"] : ");
            arr[i]=z.nextInt();
            sum=sum+arr[i];
        }
        average=sum/n;
        System.out.println("The Average is: "+average);
        for (int i = 0;i<n;i++){
            if (arr[i]>average)
                count++;
            else
                value++;
        }
        System.out.println("Numbers which are greater then average are: "+count);
        
        System.out.print("Numbers which are smaller then average are: "+value);
    }
}
