// Time complexity is O(nlogn) ; logn is dueto recurssive calling 
package Sorting;

public class Quicksort {
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low;j<high;j++){
            if (arr[j]<pivot){
                i++;
                int tmp = arr[i];
                arr[i]  = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i+1] = arr[high];
        arr[high] = tmp;
        return i + 1;
    }
    public static void sort(int arr[],int low,int high){
        if(low<=high){
            int pi = partition(arr, low, high);
            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,11,67,6,2};
        sort(arr,0, arr.length-1);
        System.out.println("Sorted Array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

