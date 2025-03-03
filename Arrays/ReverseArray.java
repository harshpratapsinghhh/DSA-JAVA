 This method will help to reverse arrays.
public class ReverseArray{
  public static void reverse(int arr[]){
    int start = 0,end = arr.length-1;
    while(start<end){
      int tmp = arr[start];
      arr[start] = arr[end];
      arr[end] = tmp;
      start++;
      end--;
    }
  }
  public static void main(String[] args){
    int arr[]={1,2,3,4,5,6};
    reverse(arr);
    for(int i: arr){
      System.out.print(i+" ");
    }
  }
}
