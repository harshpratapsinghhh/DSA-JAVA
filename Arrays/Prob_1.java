// 

package Array;

import java.util.Scanner;

public class Prob_1 {
    public static void main(String[] args) {
        int sum=0,average,count=0,n;
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
        }
        System.out.print("Numbers which are greater then average are: "+count);
    }
}
