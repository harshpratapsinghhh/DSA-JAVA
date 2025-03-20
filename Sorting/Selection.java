// Time Complexity Best Case: O(n^2) and Worst Case O(n^2).
package Sorting;

public class Selection{
  public static void selection(int arr[]){
      for(int i = 0;i<arr.length-1;i++){
        int min_idx = i;
          for(int j = i+1;j<arr.length;j++){
              if(arr[j]<arr[min_idx]){
              min_idx = j;
            }
          int tmp = arr[min_idx];
          arr[min_idx] = arr[i];
          arr[i] = tmp;
        }
      }
    }
  public static void main(String[] args){
    int arr[]={78,98,6,5,1};
    selection(arr);
    System.out.println("Sorted Array:");
    for(int i: arr){
      System.out.println(i+" ");
    }
  }
}
