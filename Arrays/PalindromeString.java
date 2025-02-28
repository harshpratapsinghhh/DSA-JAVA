/*
Palindrome : A string , number or sequence that reads the same from forward and backward.
Ex: "Madam","racecar",141 etc.
*/
import java.util.scanner;
public class PalindromeString{
      public boolean palindrome(String word){
        char[] arr = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start<end){
            if(arr[start]!=arr[end]){
              return false;
            }
              start++;
               end--;
          }
          return true;
      }

  public static void main(String[] args){
    Scanner z = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String a = z.nextLine();
    palindrome(a);
    
  }
}
