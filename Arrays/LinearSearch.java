// basic search when we find key it will return it's place.
package Arrays;

public class LinearSearch{
  public static void search(int arr[],int key){
    for(int i = 0;i<arr.length-1;i++){
      if(arr[i]==key){
        System.out.println("Key found! at arr["+i+"]");
      }
      else{
        System.out.println("Key not found!");
      }
  }
  public static void main(String[] args){
    int arr[] = {1,7,9,5,77,4};
    search(arr,8);
    search(arr,9);
  }
}
