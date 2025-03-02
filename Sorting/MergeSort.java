// Merge Sort -- Divide Conquer Then merge
public class MergeSort{
  public static void main(String[] args){
    
  }
  public static void merge(int arr[],int left,int mid,int right){
    int n1 = mid - left +1;
    int n2 = right - mid;
    int L[] = new int[n1];
    int R[] = new int[n2];

    for(int i = 0;i<n1;i++)
      L[i] = arr[l+i];
    for(int j = 0;j<n2;j++)
      R[i]=arr[mid + 1 + j];

    int i = 0,j = 0;
    int k = left;
  }
}
