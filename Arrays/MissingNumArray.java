// Find Missing Number in Array.
package Arrays;

public class MissingNumArray{
public static int MissingNum(int arr[]){
int n = arr.length + 1;
int sum = n*(n+1)/2;
for(int num : arr){
sum -= num;
}
return sum;
}
  public static void main(String[] args){
    int arr[]={0,1,2,3,4,6,7};
    System.out.println("The missing num is: "+MissingNum(arr));
  }
}
