// Find Missing Number in Array
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
    
  }
}
