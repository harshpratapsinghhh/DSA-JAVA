// In this we find max  vaule and place it as root 
package Sorting;

public class heapsort{
  public static void main(String[] args){
    
  }
  public void sort(int arr[]){
    int n = arr.length;
    for(int i = n/2 - 1;i>=0;i--){
      heapify(arr,n,i);
    }
    for(int i = n-1;i>=0;i--){
      int tmp = arr[0];
    }
  }
}
